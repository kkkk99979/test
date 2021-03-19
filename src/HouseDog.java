
public class HouseDog extends Dog {
	public void sleep() {
		System.out.println(this.name + " zzz in house");
	}

	public void sleep(int hour) {
		System.out.println(this.name + " zzZz in house for " + hour + " hours");
	}

	public static void main(String[] args) {
		HouseDog housedog = new HouseDog();
		housedog.setName("happy");
		housedog.sleep();
		housedog.sleep(3);

	}

}
