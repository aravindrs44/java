package com.aravind.dojosandninjas.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.aravind.dojosandninjas.models.Ninja;
import com.aravind.dojosandninjas.repositories.NinjaRepository;

@Service
public class NinjaService {
	private final NinjaRepository repo;
	
	public NinjaService(NinjaRepository repo) {
		this.repo = repo;
	}
	
	public List<Ninja> readAllNinjas() {
		return repo.findAll();
	}
	
	public List<Ninja> readAllNinjasOfDojo(Long id) {
		return repo.findByDojoId(id);
	}
	
	public Ninja createNinja(Ninja ninja) {
		return repo.save(ninja);
	}
}
