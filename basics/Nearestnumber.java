package basics;
public class Nearestnumber {
    public static int Num(int n) {
        char[] digits = String.valueOf(n).toCharArray();

        // Step 1: find the first digit from right that is smaller than the digit after it
        int i = digits.length - 2;
        while (i >= 0 && digits[i] >= digits[i + 1]) {
            i--;
        }

        if (i < 0) {
            // No bigger number possible
            System.out.println("No larger number can be formed");
            return -1; // or n if you want to return original number
        }

        // Step 2: find the first digit from right that is greater than digits[i]
        int j = digits.length - 1;
        while (digits[j] <= digits[i]) {
            j--;
        }

        // Step 3: swap digits[i] and digits[j]
        char temp = digits[i];
        digits[i] = digits[j];
        digits[j] = temp;

        // Step 4: reverse digits after index i
        reverse(digits, i + 1, digits.length - 1);

        // Convert char array back to int
        int result = Integer.parseInt(new String(digits));
        return result;
    }

    private static void reverse(char[] arr, int start, int end) {
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int n = 12876953;
        int next = Num(n);
        System.out.println("Next bigger number with same digits: " + next);
    }
}

