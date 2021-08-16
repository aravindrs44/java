package com.aravind.productsandcategories.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.aravind.productsandcategories.models.Category;
import com.aravind.productsandcategories.models.Product;
import com.aravind.productsandcategories.repositories.ProductRepository;

@Service
public class ProductService {
	private final ProductRepository repo;
	
	public ProductService(ProductRepository productRepository) {
		this.repo = productRepository;
	}
	
	public Product createProduct(Product product) {
		return repo.save(product);
	}
	
	public Product readOneProductById(Long id) {
		Optional<Product> optionalProduct = repo.findById(id);
		if(optionalProduct.isPresent()) {
			return optionalProduct.get();
		} else {
			return null;
		}
	}
	
	public List<Product> readAllProductsByCategories(Category category) {
		return repo.findAllByCategories(category);
	}
	
	public List<Product> readUncontainedProducts(Category category) {
		return repo.findByCategoriesNotContains(category);
	}
}
