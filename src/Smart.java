
public class Smart extends MusicPhone {
	
	public void execute(String str) {
		
		if("��".equals(str)) {
			playApp();
		} else {
			super.execute(str);
		}
	}
	protected void playApp() {
		System.out.println("�۽���");
	}

}
