package br.com.ratecoop.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.ratecoop.domain.User;

public interface UserRepository extends MongoRepository<User, String> {

	User findById(String id);
}

