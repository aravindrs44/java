package com.aravind.productsandcategories.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.aravind.productsandcategories.models.Category;
import com.aravind.productsandcategories.models.Product;
import com.aravind.productsandcategories.repositories.CategoryRepository;

@Service
public class CategoryService {
	private final CategoryRepository repo;
	
	public CategoryService(CategoryRepository categoryRepository) {
		this.repo = categoryRepository;
	}
	
	public Category createCategory(Category category) {
		return repo.save(category);
	}
	
	public Category readOneCategoryById(Long id) {
		Optional<Category> optionalCategory = repo.findById(id);
		if(optionalCategory.isPresent()) {
			return optionalCategory.get();
		} else {
			return null;
		}
	}
	
	public List<Category> readAllCategoriesByProducts(Product product) {
		return repo.findAllByProducts(product);
	}
	
	public List<Category> readUncontainedCategories(Product product) {
		return repo.findByProductsNotContains(product);
	}
}
