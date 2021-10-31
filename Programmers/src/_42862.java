import java.util.Arrays;

public class _42862 {
    public static void main(String[] args) {
        /*
        n=5, lost=[1,2], reserve=[2,3], return=4
        n=5, lost=[5,4,2], reserve=[2,4], return=4
        */
        System.out.println(solution(5, new int[]{1, 2}, new int[]{2, 3}));
    }

    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;

        Arrays.sort(lost);
        Arrays.sort(reserve);

        for (int i = 0; i < lost.length; i++) {
            int idx = Arrays.
            if () {
                lost[i] = -1;
                reserve[idx] = -1;
                answer++;
            }
        }

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] != -1 && reserve[j] != -1) {
                    if (Math.abs(lost[i] - reserve[j]) == 1) {
                        lost[i] = -1;
                        reserve[j] = -1;
                        answer++;

                        break;
                    }
                }
            }
        }

        return answer;
    }
}