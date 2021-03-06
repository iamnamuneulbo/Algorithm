import java.util.Arrays;

public class _12982 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 3, 2, 5, 4}, 9));
    }

    public static int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);

        for (int n : d) {
            if (budget >= n) {
                answer++;
                budget -= n;
            }
            else {
               break;
            }
        }

        return answer;
    }
}