
public class Telephone extends Phone{
	
	public void call(String num) {
		System.out.printf("%s ���� %s ��ȣ�� �����մϴ�.\n",this.number,num);
	}
	public void power(boolean power) {
		if(power==true) {
			System.out.println("������ �����ϴ�.");
		} else if (power==false) {
			System.out.println("������ �����ϴ�.");
		}
	}

		
	}

