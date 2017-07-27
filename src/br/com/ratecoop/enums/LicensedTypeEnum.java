package br.com.ratecoop.enums;

public enum LicensedTypeEnum {
	
	DOCTOR("M�dico"), CLINIC("Cl�nica"), LAB("Laborat�rio"), HOSPITAL("Hospital");
	
	private String description;
	
	LicensedTypeEnum(String description) {
		this.description = description;
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
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
