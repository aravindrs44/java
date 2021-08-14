package com.aravind.relationships.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.aravind.relationships.models.Person;
import com.aravind.relationships.repositories.PersonRepository;

@Service
public class PersonService {
	private final PersonRepository repository;
	
	public PersonService(PersonRepository personRepository) {
		this.repository = personRepository;
	}
	
	public Person createPerson(Person person) {
		return repository.save(person);
	}
	
	public List<Person> readAllPersons() {
		return repository.findAll();
	}
	
	public Person readOnePerson(Long id) {
		Optional<Person> optionalPerson = repository.findById(id);
		if(optionalPerson.isPresent()) {
			return optionalPerson.get();
		} else {
			return null;
		}
	}
}
