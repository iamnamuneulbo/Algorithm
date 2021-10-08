import java.util.Scanner;

public class _8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();

        for (int i = 0; i < cnt; i++) {
            String input = sc.next();
            int score = 0;
            int answerCnt = 0;

            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) == 'O') {
                    score += ++answerCnt;
                }
                else {
                    answerCnt = 0;
                }
            }

            System.out.println(score);
        }
    }
}