import java.util.Arrays;
import java.util.HashSet;

public class 68644 {

    public static void main(String[] args) {
        int[] a = {2,1,3,4,1};
        int[] b = {5,0,2,7};

        solution(a);
        solution(b);
    }

    public static Integer[] solution(int[] numbers) {
        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                hs.add(numbers[i] + numbers[j]);
            }
        }

        Integer[] res = hs.toArray(new Integer[0]);

        Arrays.sort(res);

        return res;
    }
}
