
public class Smartphone extends Phone{
	
	public void call(String num) {
		System.out.printf("%s 에서 %s 번호로 연결합니다!\n",this.number,num);
	}
	public void turnOn(boolean power) {
		if (power == true) {
			System.out.println("전원이 켜집니다.");
	}  else if  ( power == false) {
		System.out.println("전원이 꺼집니다.");
	}

	}
	public void searchInternet(String url) {
		System.out.printf("%s 주소로 이동합니다.\n",url);
	}

}
