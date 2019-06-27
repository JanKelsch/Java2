import java.util.Arrays;

public class ArraysApp {

	public static void main(String[] args) {
		int[] array = new int[] {1, 2, 3};
		
	    System.out.println(Arrays.toString(array));
		
		
	}

/*	public boolean addAll(int[] arrToAdd) {
		int[] result = Arrays.copyOf(array, array.length + 1);
	     result[result.length - 1] = value;
	     return true;
	}
*/
	public boolean addAll(int index, int[] arrToAdd) {
		return false;
	}

	public boolean removeRange(int fromIndex, int toIndex) {
		return false;
	}

	public int remove(int index) {
		return index;
	}
}