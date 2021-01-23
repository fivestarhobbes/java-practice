public class Puppy {
	int puppyAge;
	String puppyName;
	
	public Puppy(String name) {
		puppyName = name;
		puppyAge = 0;
	}
	
	public Puppy(String name, int age) {
		puppyName = name;
		puppyAge = age;
	}
	
	public int getAge() {
		return puppyAge;
	}
	
	public String toString() {
		return puppyName + " is " + puppyAge + " years old";
	}
	
	public static void main(String []args) {
		Puppy spot = new Puppy("Spot", 3);
		
		System.out.println(spot.toString());
	}
	
}
