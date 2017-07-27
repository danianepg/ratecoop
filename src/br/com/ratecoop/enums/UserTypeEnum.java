package br.com.ratecoop.enums;

public enum UserTypeEnum {
	
	PATIENT("Paciente"), OPERATOR("Operadora");
	
	private String description;
	
	UserTypeEnum(String description) {
		this.description = description;
	}

	public UserTypeEnum getUserTypeEnumByDescription(String description) {
		
		if(description != null) {
			for(UserTypeEnum u: UserTypeEnum.values()) {
				if(u.getDescription().equals(description)) {
					return u;
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
