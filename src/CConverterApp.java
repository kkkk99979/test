
public class CConverterApp {

	public static void main(String[] args) {
		double dollar;
		double won;
		
		CConverter.setRate(1099);
		dollar = CConverter.toDoller(1000000);
		won = CConverter.toKRW(100);

		System.out.printf("�鸸���� %.2f �޷��Դϴ�.\n",dollar);
		System.out.printf("��޷��� %.2f ���Դϴ�.",won);

	}

}
