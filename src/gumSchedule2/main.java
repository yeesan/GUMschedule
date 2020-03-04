package gumSchedule2;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] test1 = {"00" , "00", "00" , "00" , "00"};
		String[] test2 = {"10" , "11", "00" , "10" , "10"};
		String[] test3 = {"01" , "11", "01" , "01" , "00"};
		String[] test4 = {"00" , "11", "00" , "11" , "00"};
		String[] test5 = {"00" , "00", "00" , "00" , "01"};
		/*
		 * service 1:1,3,0,2,1
		 * Service 2:1,3,1,2,1
		 */
		
		Person person1 = new Person(0, test1);
		Person person2 = new Person(1, test2);
		Person person3 = new Person(2, test3);
		Person person4 = new Person(3, test4);
		Person person5 = new Person(4, test5);
		
		Person[] testSample = {person1, person2, person3, person4, person5};
		
		ScheduleTool st = new ScheduleTool(testSample);
		st.test();
		/*
		//testing code
		System.out.println("ID =" + person2.getID());
		System.out.println("Available On Day 1 =" + person2.getAvailableOnDay(0));
		System.out.println("Availability =" + person2.getStillAvailable());
		person2.setStillAvailable();
		System.out.println("Availability =" + person2.getStillAvailable());
		*/

	}

}
