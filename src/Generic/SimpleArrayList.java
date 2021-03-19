package Generic;

public class SimpleArrayList {

	private int size;
	private Object[] elementData = new Object[100];

	public void add(Object value) {
		elementData[size++] = value;
	}

	public Object get(int idx) {
		return elementData[idx];
	}

}
