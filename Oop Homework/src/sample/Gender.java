package sample;

public enum Gender {
	MALE, FEMALE("Женщина");
	
	private String personsGender = "Мужчина";

	private Gender(String personsGender) {
		this.personsGender = personsGender;
	}

	private Gender() {
	}

	public String getPersonsGender() {
		return personsGender;
	}

	public void setPersonsGender(String personsGender) {
		this.personsGender = personsGender;
	}

}
