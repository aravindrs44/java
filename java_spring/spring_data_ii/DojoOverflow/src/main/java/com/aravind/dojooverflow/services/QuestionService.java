package com.aravind.dojooverflow.services;

import com.aravind.dojooverflow.models.Question;
import com.aravind.dojooverflow.repositories.QuestionRepository;

public class QuestionService {
	private final QuestionRepository repo;
	
	public QuestionService(QuestionRepository questionRepository) {
		this.repo = questionRepository;
	}
	
	public Question createQuestion(Question question) {
		return repo.save(question);
	}
}
