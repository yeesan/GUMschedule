package gumSchedule2;

public class ScheduleTool {
	Person[] person;
	int[] service1 = new int[5];
	int[] service2 = new int[5];
	int serv1LeastAvaDay;
	int serv2LeastAvaDay;
	String[] output = { "Day1 Servie 1: ", "Day1 Servie 2: ", "Day2 Servie 1: ", "Day2 Servie 2: ", "Day3 Servie 1: ",
			"Day3 Servie 2: ", "Day1 Servie 4: ", "Day4 Servie 2: ", "Day5 Servie 1: ", "Day5 Servie 2: ", };

	/**
	 * Constructor
	 * 
	 * @param GUMer = Person object
	 */
	public ScheduleTool(Person[] GUMer) {
		person = new Person[GUMer.length];
		for (int i = 0; i < GUMer.length; i++)
			person[i] = GUMer[i];

	}

	/**
	 * find least available day for each service serv1LeastAvaDay = service 1 least
	 * available person day serv2LeastAvaDay = service 2 least available person day
	 */
	public void numberAvailableOnDay() {
		try {
			serv1LeastAvaDay = 0;
			serv2LeastAvaDay = 0;
			while (service1[serv1LeastAvaDay] == -1 && serv1LeastAvaDay < 5)
				serv1LeastAvaDay++;

			while (service2[serv2LeastAvaDay] == -1 && serv2LeastAvaDay < 5)
				serv2LeastAvaDay++;

			// 1st service
			for (int i = 0; i < 5; i++) {
				if (service1[i] != -1 && service1[i] <= service1[serv1LeastAvaDay])
					serv1LeastAvaDay = i;
			}

			// 2nd service
			for (int i = 0; i < 5; i++) {
				if (service2[i] != -1 && service2[i] <= service2[serv2LeastAvaDay])
					serv2LeastAvaDay = i;
			}

			service1[serv1LeastAvaDay] = -1;
			service2[serv2LeastAvaDay] = -1;
		} catch (Exception e) {
			System.out.println("all day scheudled");
		}
	}

	/**
	 * find how many people are available on each day service1[] = # of available on
	 * service 1 for each day service2[] = # of available on service 2 for each day
	 */
	private void findAvailableOnEachDay() {
		// make sue service1 and service 2 init as 0;
		for (int a = 0; a < 5; a++) {
			service1[a] = 0;
			service2[a] = 0;
		}

		for (int i = 0; i < person.length; i++) {

			if (person[i].getStillAvailable() == true) {

				for (int j = 0; j < 5; j++) {
					if (person[i].getAvailableOnDay(j).charAt(0) == '1')
						service1[j]++;

					if (person[i].getAvailableOnDay(j).charAt(1) == '1')
						service2[j]++;

				}

			}

		}

	}

	// schedule least available day first
	public void schedule() {

	}

	public void test() {
		// testing code
		// System.out.println("ID =" + person[1].getID());
		// System.out.println("Available On Day 1 =" + person[1].getAvailableOnDay(0));
		// System.out.println("Availability =" + person[1].getStillAvailable());
		// person[1].setStillAvailable();//<-- rmb to change this
		// System.out.println("Availability =" + person[1].getStillAvailable());
		findAvailableOnEachDay();
		System.out.println("service1:");
		for (int i = 0; i < 5; i++) {
			System.out.print(service1[i] + ",");
		}
		System.out.println('\n');
		System.out.println("service2:");
		for (int i = 0; i < 5; i++) {
			System.out.print(service2[i] + ",");
		}

		numberAvailableOnDay();
		System.out.println("\n\nserv1LeastAva = " + serv1LeastAvaDay);
		System.out.println("serv2LeastAva = " + serv2LeastAvaDay);


	}

}
