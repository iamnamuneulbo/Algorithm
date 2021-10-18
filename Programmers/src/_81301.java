public class _81301 {
    public static void main(String[] args) {
        System.out.println(solution("one4seveneight"));
    }

    public static int solution(String s) {
        String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < arr.length; i++) {
            s = s.replaceAll(arr[i], Integer.toString(i));
        }

        return Integer.parseInt(s);
    }
}
