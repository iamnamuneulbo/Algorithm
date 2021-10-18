import java.util.Arrays;

public class _77484 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1,2,3,4,5,6}, new int[]{38, 19, 20, 40, 15, 25})));
    }

    public static int[] solution(int[] lottos, int[] win_nums) {
        int hit = 0;
        int zeroCnt = 0;

        for (int lotto : lottos) {
            if (lotto == 0) {
                zeroCnt++;
                continue;
            }

            for (int winNum : win_nums) {
                if (lotto == winNum) {
                    hit++;
                    break;
                }
            }
        }

        return new int[] {Math.min((7 - (hit + zeroCnt)), 6), Math.min((7 - hit), 6)};
    }

}
