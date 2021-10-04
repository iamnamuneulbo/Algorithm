import java.util.Arrays;

public class _12917 {

    public static void main(String[] args) {
        System.out.println(solution("Zbcdefg"));
    }

    public static String solution(String s) {
        char[] arr = s.toCharArray();

        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder(new String(arr));

        return sb.reverse().toString();
    }
}