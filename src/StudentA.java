
public class StudentA extends Person {
	private String SchoolName;

	public StudentA() {
	}

	public StudentA(String schoolName) {
		System.out.println("Student������1");
		SchoolName = schoolName;
	}

	public StudentA(int age, String SchoolName) {
		super.setAge(age);
		this.SchoolName = SchoolName;
	}

	public StudentA(String name, int age, String SchoolName) {
		System.out.println("Student������2");
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
		System.out.printf("�̸�: %s ����: %d �б�: %s\n", super.name, super.age, getSchoolName());
	}
}
