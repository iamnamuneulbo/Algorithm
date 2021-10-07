import java.util.Arrays;
import java.util.Stack;

public class _67256 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2}, "left"));
        System.out.println("LRLLRRLLLRR");
    }

    public static String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();
        boolean flag = true;
        int lPos = 10;
        int rPos = 12;

        for (int num : numbers) {
            if (num == 1 || num == 4 || num == 7) {
                flag = true;
            }
            else if (num == 3 || num == 6 || num == 9) {
                flag = false;
            }
            else {
                if (num == 0) {
                    num = 11;
                }

                int lDisp = Math.abs(lPos - num);
                int rDisp = Math.abs(rPos - num);

                lDisp = lDisp >= 3 ? lDisp % 3 + lDisp / 3 : lDisp;
                rDisp = rDisp >= 3 ? rDisp % 3 + rDisp / 3 : rDisp;

                if (lDisp < rDisp) {
                    flag = true;
                }
                else if (lDisp > rDisp) {
                    flag = false;
                }
                else {
                    flag = hand.equals("left");
                }
            }

            if (flag) {
                answer.append("L");
                lPos = num;
            }
            else {
                answer.append("R");
                rPos = num;
            }
        }

        return answer.toString();
    }
}