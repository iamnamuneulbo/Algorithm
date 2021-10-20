public class _12977 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 7, 6, 4}));
    }

    public static int solution(int[] nums) {
        int answer = 0;

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (isPrimeNum(nums[i] + nums[j] + nums[k])) {
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
}