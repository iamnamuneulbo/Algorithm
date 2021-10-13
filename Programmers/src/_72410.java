public class _72410 {
    public static void main(String[] args) {
        System.out.println(solution("...!@BaT#*..y.abcdefghijklm."));
    }

    public String solution(String new_id) {
        String answer = new_id;

        answer = answer.toLowerCase().replaceAll("[^a-z0-9\\_\\.\\-]", "").replaceAll("\\.+", ".");

        if (answer.charAt(0) == '.') {
            answer = answer.substring(1);
        }
        else if (answer.charAt(answer.length() - 1) == '.') {
            answer = answer.substring(0, answer.length() - 1);
        }

        if ("".equals(answer)) {
            answer = "a";
        }

        if (answer.length() >= 16) {
            answer = answer.substring(0, 15);
        }

        if (answer.charAt(answer.length() - 1) == '.') {
            answer = answer.substring(0, answer.length() - 1);
        }

        while (answer.length() <= 2) {
            answer = answer + answer.charAt(answer.length() - 1);
        }

        return answer;
    }
}