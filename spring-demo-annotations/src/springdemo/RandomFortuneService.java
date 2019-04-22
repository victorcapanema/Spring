package springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private String[] data = { "Vai dar certo", "Vai conseguir sim", "Pensamento positivo" };

	private Random myRandom = new Random();

	@Override
	public String getFortune() {

		int index = myRandom.nextInt(data.length);

		String theFortune = data[index];
		
		return theFortune;
	}

}
