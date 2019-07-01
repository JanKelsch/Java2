import java.util.Iterator;

public class ArrayIterator implements Iterator<Object> {

	Object[] arr;
	int size;
	int currIndex = 0;

	ArrayIterator(Object[] arr, int size) {
		this.arr = arr;
		this.size = size;
	}

	@Override
	public boolean hasNext() {
		return currIndex < size;
	}

	@Override
	public Object next() {
		Object res = arr[currIndex];
		currIndex++;
		return res;
	}
}