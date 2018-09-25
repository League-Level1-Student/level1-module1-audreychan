
public class PersonRunner {
	public static void main(String[] args) {
		Person captainAmerica = new Person();
		captainAmerica.setName("Steve Rogers");
		captainAmerica.setSuperpower("Super Strength");
		System.out.println(captainAmerica.toString());
		Person thor = new Person();
		thor.setName("Thor Odinson");
		thor.setSuperpower("Thunder");
		System.out.println(thor.toString());
		Person scarletWitch = new Person();
		scarletWitch.setName("Wanda Maximoff");
		scarletWitch.setSuperpower("Mind power");
		System.out.println(scarletWitch.toString());
	}

}
