
public class Student {
	private String studentID;
	private String studentName;
	private String studentGender;
	private double studentCredit;
	
	public Student() {}
	
	public Student(String studentName, String studentID, String studentGender, double studentCredit) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.studentGender = studentGender;
		this.studentCredit = studentCredit;
	}
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentGender() {
		return studentGender;
	}
	public void setStudentGender(String studentGender) {
		this.studentGender = studentGender;
	}
	public double getStudentCredit() {
		return studentCredit;
	}
	public void setStudentCredit(double studentCredit) {
		this.studentCredit = studentCredit;
	}
	public void showInfo() {
		System.out.println("------------------------");
		System.out.printf("이름 : %s\n",getStudentName());
		System.out.printf("학번 : %s\n",getStudentID());
		System.out.printf("성별 : %s\n",getStudentGender());
		System.out.printf("학점 : %s\n",getStudentCredit());
		
	}
	
	
}
