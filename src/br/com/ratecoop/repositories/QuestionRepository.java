package br.com.ratecoop.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.ratecoop.domain.Question;

public interface QuestionRepository extends MongoRepository<Question, String> {

	Question findById(String id);
}

