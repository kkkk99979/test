package interfac;

public class LeastJob implements scheduler{

	@Override
	public void getNextCall() {
		System.out.println("�����ȭ�� ������� �����ɴϴ�.");
	}

	@Override
	public void sendCalltoAgent() {
		System.out.println("���� ��� ������ ���ų� ��Ⱑ ���� ���� �������� �Ҵ��մϴ�.");
	}
	

}
