package br.com.ratecoop.enums;

public enum LicensedTypeEnum {
	
	CLINIC(1, "Cl�nica"), DOCTOR(2, "M�dico"), LAB(3, "Laborat�rio"), HOSPITAL(4, "Hospital");
	
	private Integer code;
	private String description;
	
	LicensedTypeEnum(Integer code, String description) {
		this.code = code;
		this.description = description;
	}
	
	public LicensedTypeEnum getLicensedTypeEnumByCode(Integer code) {
		
		if(code != null) {
			for(LicensedTypeEnum l : LicensedTypeEnum.values()) {
				if(l.getCode() == code) {
					return l;
				}
			}
		}
		
		return null;
	}

	public LicensedTypeEnum getLicensedTypeEnumByDescription(String description) {
		
		if(description != null) {
			for(LicensedTypeEnum l : LicensedTypeEnum.values()) {
				if(l.getDescription().equals(description)) {
					return l;
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
