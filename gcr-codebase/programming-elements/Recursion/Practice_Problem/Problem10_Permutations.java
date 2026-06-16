
public class Problem10_Permutations {

    static void permute(String str, int left, int right) {
        if (left == right) {
            System.out.println(str);
            return;
        }

        char[] chars = str.toCharArray();

        for (int i = left; i <= right; i++) {
            swap(chars, left, i);
            permute(new String(chars), left + 1, right);
            chars = str.toCharArray();
        }
    }

    static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        permute("ABC", 0, 2);
    }
}
