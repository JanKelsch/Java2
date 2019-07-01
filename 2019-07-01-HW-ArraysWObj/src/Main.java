import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        Array arr = new Array();
        Array arr2 = new Array();

        HashMap<Array, String> hashMap = new HashMap<>();
         hashMap.put(arr, "Array 1");

        System.out.println(hashMap.get(arr));

        System.out.println(arr.hashCode());

        System.out.println(hashMap.get(arr2));

        arr.add(1);

        System.out.println(hashMap.get(arr));

        System.out.println(hashMap.get(arr2));
        System.out.println(arr2.hashCode());

    }
}