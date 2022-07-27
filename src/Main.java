import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập 10 số nguyên vào mảng: ");

        for(int i = 0; i < 10; ++i) {
            System.out.println("Số " + (i + 1));
            arr[i] = scanner.nextInt();
        }

        System.out.println("Giá trị lớn nhất là: " + min(arr));
    }

    public static int min(int[] arr) {
        int max = arr[0];

        for(int i = 1; i < arr.length; ++i) {
            if (max < arr[i]) {
                max= arr[i];
            }
        }

        return max;
    }
}
