package com.aravind.dojooverflow.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.aravind.dojooverflow.models.Answer;

public interface AnswerRepository extends CrudRepository<Answer, Long>{
	List<Answer> findAll();
}
