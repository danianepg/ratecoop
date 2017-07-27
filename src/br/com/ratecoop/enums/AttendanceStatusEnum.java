package br.com.ratecoop.enums;

public enum AttendanceStatusEnum {
	
	PENDING("Pendente"), FINISHED("Finalizado");
	
	private String description;
	
	AttendanceStatusEnum(String description) {
		this.description = description;
	}

	public AttendanceStatusEnum getAttendanceStatusEnumByDescription(String description) {
		
		if(description != null) {
			for(AttendanceStatusEnum u: AttendanceStatusEnum.values()) {
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
