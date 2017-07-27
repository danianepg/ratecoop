package br.com.ratecoop.enums;

public enum SpecialityEnum {
	
	CARDIOLOGIST("Cardiologista"), GERAL("Clínico Geral"),  GINECOLOGIST("Ginecologista");
	
	private String description;
	
	SpecialityEnum(String description) {
		this.description = description;
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
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	

}
