public class _12926 {
    public static void main(String[] args) {
        System.out.println(solution("TUV", 10));
    }

    public static String solution(String s, int n) {
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != ' ') {
                boolean isUprCase = Character.isUpperCase(arr[i]);

                arr[i] = (char) (arr[i] + n);

                if (arr[i] > 'z' || arr[i] > 'Z' && isUprCase) {
                    arr[i] = (char) (arr[i] - 26);
                }
            }
        }

        StringBuilder sb = new StringBuilder(new String(arr));

        return sb.toString();
    }
}
