
public class CConverterApp {

	public static void main(String[] args) {
		double dollar;
		double won;
		
		CConverter.setRate(1099);
		dollar = CConverter.toDoller(1000000);
		won = CConverter.toKRW(100);

		System.out.printf("백만원은 %.2f 달러입니다.\n",dollar);
		System.out.printf("백달러는 %.2f 원입니다.",won);

	}

}
