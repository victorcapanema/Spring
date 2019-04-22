package springdemo;

public class Application {

	public static void main(String[] args) {
		
		Coach theCoach= new TrackCoach();
		
		System.out.println(theCoach.getDailyWorkout());

	}

}
