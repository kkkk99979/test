package Generic;

public class SimpleArrayListForString {
	private int size;
	private String[] elementData = new String[5];
	
	public void add(String value) {
		elementData[size++] = value;
	}
	public String get(int idx) {
		return elementData[idx];
	}
}