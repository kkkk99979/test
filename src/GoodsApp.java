
public class GoodsApp {

	public static void main(String[] args) {
		Goods[] lgArr = new Goods[3];
		Goods[] mugArr = new Goods[5];
		for (int i = 0; i < lgArr.length; i++) {
			lgArr[i] = new Goods("LG±×·¥-"+(i+1),900000+(i*60000));
			lgArr[i].show();
		}
		for (int i=0; i<mugArr.length;i++) {
			mugArr[i] = new Goods("¸Ó±×ÄÅ-"+(i+1),1000+(i*900));
			mugArr[i].show();
		}
		

	}

}
