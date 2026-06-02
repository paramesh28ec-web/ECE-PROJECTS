import java.util.Scanner;

class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element: ");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        System.out.println("Sum of array elements = " + sum);
    }
}