package br.com.ratecoop.enums;

public enum UserTypeEnum {
	
	PATIENT(1, "Paciente"), OPERATOR(2, "Operadora");
	
	private Integer code;
	private String description;
	
	UserTypeEnum(Integer code, String description) {
		this.code = code;
		this.description = description;
	}

	public UserTypeEnum getUserTypeEnumByCode(Integer code) {
		
		if(code != null) {
			for(UserTypeEnum u: UserTypeEnum.values()) {
				if(u.getCode() == code) {
					return u;
				}
			}
		}
		
		return null;
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
