package com.aravind.dojosandninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.aravind.dojosandninjas.models.Dojo;
import com.aravind.dojosandninjas.repositories.DojoRepository;

@Service
public class DojoService {
	private final DojoRepository repo;
	
	public DojoService(DojoRepository dojoRepository) {
		this.repo = dojoRepository;
	}
	
	public List<Dojo> readAllDojos() {
		return repo.findAll();
	}
	
	public Dojo readOneDojo(Long id) {
		Optional<Dojo> optionalDojo = repo.findById(id);
		if(optionalDojo.isPresent()) {
			return optionalDojo.get();
		} else {
			return null;
		}
	}
	
	public Dojo createDojo(Dojo dojo) {
		return repo.save(dojo);
	}
}
