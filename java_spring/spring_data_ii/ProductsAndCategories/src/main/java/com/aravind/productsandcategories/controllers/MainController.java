package com.aravind.productsandcategories.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.aravind.productsandcategories.models.Category;
import com.aravind.productsandcategories.models.Product;
import com.aravind.productsandcategories.services.CategoryService;
import com.aravind.productsandcategories.services.ProductService;

@Controller
public class MainController {
	private final CategoryService categoryService;
	private final ProductService productService;
	
	public MainController(CategoryService categoryService, ProductService productService) {
		this.categoryService = categoryService;
		this.productService = productService;
	}
	
	@GetMapping("/")
	public String indexView() {
		return "/index.jsp";
	}
	
	@GetMapping("/products/new")
	public String newProductView(@ModelAttribute("product") Product product) {
		return "/newProductPage.jsp";
	}
	
	@PostMapping("/products/create")
	public String createProduct(@Valid @ModelAttribute("product") Product product, BindingResult result) {
		if(result.hasErrors()) {
			return "/newProductPage.jsp";
		} else {
			productService.createProduct(product);
			return "redirect:/products/" + product.getId();
		}
	}
	
	@GetMapping("/products/{id}")
	public String productView(@ModelAttribute("product") Product product, @PathVariable("id") Long id, Model model) {
		Product currentProduct = productService.readOneProductById(id);
		model.addAttribute("product", currentProduct);
		model.addAttribute("categories", categoryService.readUncontainedCategories(currentProduct));
		return "/productViewPage.jsp";
	}
	
	@GetMapping("/categories/new")
	public String newCategoryView(@ModelAttribute("category") Category category) {
		return "/newCategoryPage.jsp";
	}
	
	@PostMapping("/categories/create")
	public String createCategory(@Valid @ModelAttribute("category") Category category, BindingResult result) {
		if(result.hasErrors()) {
			return "/newCategoryPage.jsp";
		} else {
			categoryService.createCategory(category);
			return "redirect:/categories/" + category.getId();
		}
	}
	
}
