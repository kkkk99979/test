
public class MusicPhone extends ProblemPhone{
	
	public void execute(String str)  {
		if("����".equals(str)) {
			playMusic();
		} else {
			super.execute(str);
		}
	}
	protected void playMusic() {
		System.out.println("Mp3�÷��̾�� �������");
		
	}

}
