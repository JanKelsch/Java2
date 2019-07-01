import java.util.Arrays;
import java.util.Iterator;

public class Array implements Iterable<Object> {

	private Object[] arr;
	private int size;
	private static final int DEFAULT_CAPACITY = 10;

	Array() {
		arr = new Object[DEFAULT_CAPACITY];
	}

	Array(int capacity) {
		arr = new Object[capacity];
	}

	public int getSize() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public int indexOf(Object obj) {
		for (int i = 0; i < size; i++) {
			if (arr[i] == obj) {
				return i;
			}
		}
		return -1;
	}

	public int lastIndexOf(Object obj) {
		for (int i = size - 1; i >= 0; i--) {
			if (arr[i] == obj) {
				return i;
			}
		}
		return -1;
	}

	public Object get(int index) {
		if (index < size) {
			return arr[index];
		}
		return -1;
	}

	public Object set(int index, Object obj) {
		Object oldValue = -1;
		if (index < size) {
			oldValue = arr[index];
			arr[index] = obj;
		}
		return oldValue;
	}

	public boolean add(Object obj) {
		ensureCapacity();
		arr[size] = obj;
		size++;
		return true;
	}

	public boolean addAtPosition(int index, Object obj) {
		if (index >= size) {
			return false;
		}
		ensureCapacity();
		Object[] oldArr = copyArray(size);
		size++;
		arr[index] = obj;
		for (int i = index + 1; i < size; i++) {
			arr[i] = oldArr[i - 1];
		}
		return true;
	}

	public Object remove(Object obj) {
		int foundIndex = indexOf(obj);
		if (foundIndex == -1) {
			return -1;
		}
		Object[] oldArr = copyArray(size);
		Object oldValue = arr[foundIndex];
		size--;
		for (int i = foundIndex; i < size; i++) {
			arr[i] = oldArr[i + 1];
		}
		return oldValue;
	}

	private void ensureCapacity() {
		if (size == arr.length) {
			int newSize = arr.length * 2;
			arr = copyArray(newSize);
		}
	}

	private Object[] copyArray(int newSize) {
		Object[] newArr = new Object[newSize];
		for (int i = 0; i < size; i++) {
			newArr[i] = arr[i];
		}
		return newArr;
	}

	public void print() {
		for (int i = 0; i < size; i++) {
			System.out.println(arr[i]);
		}
	}

	@Override
	public Iterator<Object> iterator() {
		return new ArrayIterator(arr, size);
	}

	public Object[] getArr() {
		return arr;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.deepHashCode(arr);
		result = prime * result + size;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Array other = (Array) obj;
		if (!Arrays.deepEquals(arr, other.arr))
			return false;
		if (size != other.size)
			return false;
		return true;
	}
}