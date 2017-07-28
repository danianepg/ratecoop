package br.com.ratecoop.domain;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import br.com.ratecoop.enums.UserTypeEnum;

@Document
public class User {
	
	@Id
	private String id;

	@NotNull(message = "Nome deve ser informado!")
	@NotEmpty(message = "Nome não pode ser vazio!")
	private String name;
	
	private UserTypeEnum type;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public UserTypeEnum getType() {
		return type;
	}

	public void setType(UserTypeEnum type) {
		this.type = type;
	}
	
}
