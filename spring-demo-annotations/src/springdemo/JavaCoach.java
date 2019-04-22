package springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JavaCoach implements Coach {

	
	private FortuneService fortuneService;
	

	
	@Override
	public String getDailyWorkout() {
		return "Praticar java todos os dias";
	}


	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}


}
