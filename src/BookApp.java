import java.util.Scanner;

public class BookApp {

	public static void main(String[] args) {
		Book[] books = new Book[10];
		books[0] = new Book(1, "Ʈ���϶���", "�����Ĵϸ��̾�");
		books[1] = new Book(2, "����", "�����Ĵϸ��̾�");
		books[2] = new Book(3, "��Ŭ����", "�����Ĵϸ��̾�");
		books[3] = new Book(4, "�극��ŷ��", "�����Ĵϸ��̾�");
		books[4] = new Book(5, "�Ƹ���", "������");
		books[5] = new Book(6, "�����׵�", "�赿��");
		books[6] = new Book(7, "�����ϱ� û���̴�", "�賭��");
		books[7] = new Book(8, "��õ", "õ��");
		books[8] = new Book(9, "�¹���", "������");
		books[9] = new Book(10, "Ǯ�Ͽ콺", "������");

		System.out.println("*****���� ���� ����ϱ�******");
		displayBookInfo(books);
		Scanner scanner = new Scanner(System.in);
		System.out.print("�뿩 �ϰ� ���� å�� ��ȣ�� �Է��ϼ���:");
		int num = scanner.nextInt();
		if (num > books.length || num <= 0) {
			while (num > books.length || num <= 0) {
				System.out.print("���� ��ȣ �Դϴ�.�ٽ� �Է��ϼ���: ");
				num = scanner.nextInt();
			}
		}
		scanner.close();
		books[num - 1].rent();// (1) �Էµ� ��ȣ�� �´� å�� ã�� �뿩 �Ǿ���(�����ڵ�=0)�� üũ �մϴ�.
		System.out.println("*****���� ���� ����ϱ�******");
		displayBookInfo(books);
	}
	// (2)���޹��� �迭�� ��� ����ϴ� �޼ҵ�
	private static void displayBookInfo(Book[] books) {
		for (int i = 0; i < books.length; i++) {
			System.out.printf("å��ȣ: %d å�̸�: %s �۰�: %s �뿩����: %s\n", books[i].getBookNo(), books[i].getTitle(), books[i].getAuthor(), books[i].print());

		}
	}

}
	