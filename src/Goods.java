
public class Goods {

	private String name;
	private int price;
	
	public Goods(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void show() {
		System.out.printf("이름: %s\n 가격: %d\n",getName(),getPrice());
		System.out.println("-------------------------");
	}
	
	
}
