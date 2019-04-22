package springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;

	
	public TrackCoach() {
		
	}
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {

		return "Run a hard 5km";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it: " + fortuneService.getFortune();
	}

	
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside method domystartupstuff");
	}
	
	public void doMyCleanupStuff(){
		System.out.println("TrackCoach: inside method domyCleanupstuff");
		
	}
	
	
	
	
}
