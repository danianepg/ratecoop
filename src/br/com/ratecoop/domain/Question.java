package br.com.ratecoop.domain;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Question {

	@Id
	private String id;

	@NotNull(message = "Pergunta deve ser informada")
	@NotEmpty(message = "Pergunta não pode ser vazia")
	private String name;

	@NotNull(message = "Peso deve ser informado")
	@Min(value = 0, message = "Peso deve possuir valores de 0 a 10")
	@Max(value = 10, message = "Peso deve possuir valores de 0 a 10")
	private Integer value;

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

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}
	
	
}
