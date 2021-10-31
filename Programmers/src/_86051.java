public class _86051 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4, 6, 7, 8, 0}));
    }

    public static int solution(int[] numbers) {
        int answer = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9;

        for (int num : numbers) {
            answer -= num;
        }

        return answer;
    }
}
