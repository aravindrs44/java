package com.aravind.languages.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.aravind.languages.models.Language;
import com.aravind.languages.repositories.LanguageRepository;


@Service
public class LanguageService {
	private final LanguageRepository languageRepository;
	
	public LanguageService(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}
	
	public Language createLanguage(Language lang) {
		return languageRepository.save(lang);
	}
	
	public List<Language> allLanguages() {
		return languageRepository.findAll();
	}
	
	public Language findLanguage(Long id) {
		Optional<Language> optionalLanguage = languageRepository.findById(id);
		if(optionalLanguage.isPresent()) {
			return optionalLanguage.get();
		} else {
			return null;
		}
	}
	
	public Language updateLanguage(Language lang) {
		return languageRepository.save(lang);
	}
	
	public void deleteLanguage(Long id) {
		languageRepository.deleteById(id);
	}
}

