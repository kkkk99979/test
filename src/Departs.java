
public class Departs extends Employee {
	String part;

	public Departs(String part) {
		super();
		this.part = part;
	}
	

	public Departs(String name, int salary, String part) {
		super.setName(name);
		super.setSalary(salary);
		this.setPart(part);
	}


	public String getPart() {
		return part;
	}

	public void setPart(String part) {
		this.part = part;
	}
	public void getInformation() {
		System.out.println("이름:"+ super.getName() +" 연봉:" + super.getName() + " 부서:"+ this.getPart());
	}
	
}
