import java.util.Scanner;

public class _5622 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] arr = input.toCharArray();
        int time = 0;

        for (char c : arr) {
            time = time + ((c - 'A') / 3) + 3;

            if (c == 'S' || c == 'V' || c == 'Y' || c == 'Z') {
                time--;
            }
        }

        System.out.println(time);
    }
}
