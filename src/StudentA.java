
public class StudentA extends Person {
	private String SchoolName;

	public StudentA() {
	}

	public StudentA(String schoolName) {
		System.out.println("Student생성자1");
		SchoolName = schoolName;
	}

	public StudentA(int age, String SchoolName) {
		super.setAge(age);
		this.SchoolName = SchoolName;
	}

	public StudentA(String name, int age, String SchoolName) {
		System.out.println("Student생성자2");
		super.setAge(age);
		super.setName(name);
		this.SchoolName = SchoolName;
	}

	public String getSchoolName() {
		return SchoolName;
	}

	public void setSchoolName(String schoolName) {
		SchoolName = schoolName;
	}

	public void showInfo() {
		System.out.println("Student showInfo");
		System.out.printf("이름: %s 나이: %d 학교: %s\n", super.name, super.age, getSchoolName());
	}
}
