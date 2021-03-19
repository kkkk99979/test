
public class Person {
	public String name;
	public int age;
	
	public Person(String name) {
		super();
		System.out.println("Person积己1");
		this.name = name;
	}

	public Person() { 
		System.out.println("Person积己2");
	}

	public Person(String name,int age) {
		super();
		System.out.println("Person积己3");
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void showInfo() {
		System.out.println("Person showInfo");
		System.out.printf("捞抚: %s 唱捞: %d\n",getName(),getAge());
	}
}
