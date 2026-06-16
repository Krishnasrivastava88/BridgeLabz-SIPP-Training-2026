
public class LeetCode5_AddDigits {

    static int addDigits(int num) {
        if (num < 10) return num;

        int sum = digitSum(num);
        return addDigits(sum);
    }

    static int digitSum(int num) {
        if (num == 0) return 0;
        return num % 10 + digitSum(num / 10);
    }

    public static void main(String[] args) {
        System.out.println(addDigits(38));
    }
}
