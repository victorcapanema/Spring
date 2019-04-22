package springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;

	private String email;
	private String team;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		System.out.println("CricketCoach> inside setter constructor - setEmail");
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach> inside setter constructor - setTeam");
		this.team = team;
	}

	public CricketCoach() {
		System.out.println("CricketCoach> no arg constructor");
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach> inside setter constructor");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Nosotros habemos";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
