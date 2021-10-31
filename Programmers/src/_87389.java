public class _87389 {
    public static void main(String[] args) {
        System.out.println(solution(12));
    }

    public static int solution(int n) {
        int x = 2;

        while (n % x != 1) {
            x++;
        }

        return x;
    }
}