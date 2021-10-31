public class _12916 {
    public static void main(String[] args) {
        System.out.println(solution("pPoooyY"));
    }

    public static boolean solution(String s) {
        return s.replaceAll("[^pP]", "").length() == s.replaceAll("[^yY]", "").length();
    }
}