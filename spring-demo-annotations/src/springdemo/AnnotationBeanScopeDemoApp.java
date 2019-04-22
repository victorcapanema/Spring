package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Coach theCoach = context.getBean("tennisCoach", Coach.class);

		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

		boolean result = (theCoach == alphaCoach);

		System.out.println("\n Apontando para o mesmo objeto: " + result);

		System.out.println("\n Localização na memoria theCoach: " + theCoach);

		System.out.println("\n Localização na memoria alphaCoach: " + alphaCoach);
	}

}
