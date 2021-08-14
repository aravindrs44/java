package com.aravind.relationships.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.aravind.relationships.models.License;
import com.aravind.relationships.repositories.LicenseRepository;

@Service
public class LicenseService {
	private final LicenseRepository repository;
	
	public LicenseService(LicenseRepository licenseRepository) {
		this.repository = licenseRepository;
	}
	
	public License createLicense(License license) {
		return repository.save(license);
	}
	
	public License findOneLicense(Long id) {
		Optional<License> optionalLicense = repository.findById(id);
		if(optionalLicense.isPresent()) {
			return optionalLicense.get();
		} else {
			return null;
		}
	}
}
