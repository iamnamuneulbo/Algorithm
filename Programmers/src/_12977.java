import java.util.ArrayList;

public class _12977 {
    static ArrayList<Boolean> primeNumList;

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 7, 6, 4}));
    }

    public static int solution(int[] nums) {
        int answer = 0;

        getPrimeNum(1000 * 3);

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (primeNumList.get(nums[i] + nums[j] + nums[k])) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }

    public static boolean isPrimeNum(int num) {
        if (num == 1 || num % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void getPrimeNum(int range) {
        int end = (int) Math.sqrt(range);

        primeNumList = new ArrayList<>(range + 1);

        primeNumList.add(false); // 0
        primeNumList.add(false); // 1

        for (int i = 2; i <= range; i++) {
            primeNumList.add(i, true);
        }

        for (int i = 4; i <= range; i += 2) {
            primeNumList.set(i, false);
        }

        for (int i = 3; i <= end; i += 2) {
            if (primeNumList.get(i)) {
                for (int j = i * 2; j <= range; j += i) {
                    primeNumList.set(j, false);
                }
            }
        }
    }
}