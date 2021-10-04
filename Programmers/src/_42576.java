import java.util.HashMap;

public class _42576 {
    public static void main(String[] args) {
        String[] arr1 = {"leo", "kiki", "eden"};
        String[] arr2 = {"kiki", "eden"};

        System.out.println(solution(arr1, arr2));
    }

    public static String solution(String[] participant, String[] completion) {
        String result = "";
        HashMap<String, Integer> hashMap = new HashMap<>();

        for (String comp : completion) {
            hashMap.put(comp, hashMap.getOrDefault(comp, 0) + 1);
        }

        for (String part : participant) {
            if (hashMap.getOrDefault(part, 0) == 0) {
                result = part;
                break;
            }
            else {
                hashMap.put(part, hashMap.get(part) - 1);
            }
        }

        return result;
    }
}
