package springdemo;

public class MagicCoach implements Coach {

	private FortuneService fortuneService;

	public MagicCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Play big or go home";
	}

	@Override
	public String getDailyFortune() {
		return "Magical man: " + fortuneService.getFortune();
	}

}
