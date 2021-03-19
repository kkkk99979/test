package interfac;

public class LeastJob implements scheduler{

	@Override
	public void getNextCall() {
		System.out.println("상담전화를 순서대로 가져옵니다.");
	}

	@Override
	public void sendCalltoAgent() {
		System.out.println("현재 상담 업무가 없거나 대기가 가장 적은 상담원에게 할당합니다.");
	}
	

}
