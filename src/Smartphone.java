
public class Smartphone extends Phone{
	
	public void call(String num) {
		System.out.printf("%s ���� %s ��ȣ�� �����մϴ�!\n",this.number,num);
	}
	public void turnOn(boolean power) {
		if (power == true) {
			System.out.println("������ �����ϴ�.");
	}  else if  ( power == false) {
		System.out.println("������ �����ϴ�.");
	}

	}
	public void searchInternet(String url) {
		System.out.printf("%s �ּҷ� �̵��մϴ�.\n",url);
	}

}
