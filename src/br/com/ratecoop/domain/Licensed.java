package br.com.ratecoop.domain;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import br.com.ratecoop.enums.LicensedTypeEnum;
import br.com.ratecoop.enums.SpecialityEnum;

@Document
public class Licensed {

	@Id
	private String id;

	@NotNull(message = "Nome deve ser informado!")
	@NotEmpty(message = "Nome não pode ser vazio!")
	private String name;

	private LicensedTypeEnum type;

	private String address;
	private String phone;
	private SpecialityEnum speciality;
	
	private BigDecimal rate;

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

	public LicensedTypeEnum getType() {
		return type;
	}

	public void setType(LicensedTypeEnum type) {
		this.type = type;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public SpecialityEnum getSpeciality() {
		return speciality;
	}

	public void setSpeciality(SpecialityEnum speciality) {
		this.speciality = speciality;
	}

	public BigDecimal getRate() {
		return rate;
	}

	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}
	
	

}
