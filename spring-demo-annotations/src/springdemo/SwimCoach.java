package springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	@Value("${v.email}")
	private String email;
	
	@Value("${v.team}")
	private String team;
	
	
	private FortuneService fortuneService;
	
	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

	public SwimCoach(FortuneService theFortuneService) {
		fortuneService=theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Nada 10km ai tio";
	}

	@Override
	public String getDailyFortune() {
	
		return fortuneService.getFortune();
	}

}
