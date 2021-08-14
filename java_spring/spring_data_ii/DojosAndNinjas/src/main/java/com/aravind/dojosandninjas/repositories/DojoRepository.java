package com.aravind.dojosandninjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.aravind.dojosandninjas.models.Dojo;

public interface DojoRepository extends CrudRepository<Dojo, Long> {
	List<Dojo> findAll();
}
