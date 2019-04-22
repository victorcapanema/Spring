package springdemo;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "As vezes nada da certo,but keep going";
	}

}
