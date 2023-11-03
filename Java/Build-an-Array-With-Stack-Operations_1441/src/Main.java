import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(buildArray(new int[]{1, 3}, 3).toArray()));
    }

    public static List<String> buildArray(int[] target, int n) {
        List<String> operations = new ArrayList<>(2*n);
        for (int i = 1; (i <= n) && (i <= target[target.length-1]); i++) {
            operations.add("Push");
            if(Arrays.binarySearch(target, i) < 0) {
                operations.add("Pop");
            }
        }
        return operations;
    }
}
