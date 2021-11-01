import java.util.ArrayList;

public class _17681 {
    public static void main(String[] args) {
        System.out.println(solution(5, new int[]{9, 20, 28, 18, 11}, new int[]{30, 1, 21, 17, 28}));
    }

    public static ArrayList<String> solution(int n, int[] arr1, int[] arr2) {
        ArrayList<String> answer = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String map = String.format("%" + n + "s", Integer.toBinaryString(arr1[i]|arr2[i]));

            answer.add(map.replaceAll("1", "#").replaceAll("0", " "));
        }

        return answer;
    }
}
