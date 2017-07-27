package br.com.ratecoop.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.ratecoop.domain.Licensed;

public interface LicensedRepository extends MongoRepository<Licensed, String> {

	Licensed findById(String id);
}

