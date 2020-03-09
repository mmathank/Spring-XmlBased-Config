package spring.sample;

public class BasketBall implements Sports{

	MedicalService medicalService;
	String teamName;
	
	public void setMedicalService(MedicalService medicalService) {
		this.medicalService = medicalService;
	}

	
	public String getTeamName() {
		return teamName;
	}


	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}


	@Override
	public String provideInfo() {
		return "Played between two teams of 5 Players";
	}

	@Override
	public String getFirstAidInfo() {
		return medicalService.assist();
	}

}
