package br.com.ratecoop.enums;

public enum SpecialityEnum {
	
	CARDIOLOGIST(1, "Cardiologista"), 
	GERAL(2, "Clínico Geral"),  
	GINECOLOGIST(3, "Ginecologista");
	
	private Integer code;
	private String description;
	
	SpecialityEnum(Integer code, String description) {
		this.code = code;
		this.description = description;
	}

	public SpecialityEnum getSpecialityEnumByCode(Integer code) {
		
		if(code != null) {
			for(SpecialityEnum s : SpecialityEnum.values()) {
				if(s.getCode() == code ) {
					return s;
				}
			}
		}
		
		return null;
	}
	
	public SpecialityEnum getSpecialityEnumByDescription(String description) {
		
		if(description != null) {
			for(SpecialityEnum s : SpecialityEnum.values()) {
				if(s.getDescription().equals(description)) {
					return s;
				}
			}
		}
		
		return null;
	}
	
	
	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	

}
