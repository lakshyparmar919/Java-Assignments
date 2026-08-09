import java.io.*;

public class Array  {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        int arr[] = new int[10];

        System.out.println("Enter 10 integers:");

        for (int i = 0; i < 10; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < 10; i++) {
            if (arr[i] > max)
                max = arr[i];

            if (arr[i] < min)
                min = arr[i];
        }

        int sum = 0;

        for (int i = 0; i < 10; i++) {
            sum = sum + arr[i];
        }

        double average = (double) sum / 10;

        int even = 0;
        int odd = 0;

        for (int i = 0; i < 10; i++) {
            if (arr[i] % 2 == 0)
                even++;
            else
                odd++;
        }

        System.out.print("Enter number to search: ");
        int search = Integer.parseInt(br.readLine());

        boolean found = false;

        for (int i = 0; i < 10; i++) {
            if (arr[i] == search) {
                found = true;
                break;
            }
        }

        System.out.println("\n----- ARRAY STATISTICS -----");
        System.out.println("Maximum Element = " + max);
        System.out.println("Minimum Element = " + min);
        System.out.println("Average = " + average);
        System.out.println("Even Numbers = " + even);
        System.out.println("Odd Numbers = " + odd);

        if (found)
            System.out.println(search + " is present in the array.");
        else
            System.out.println(search + " is not present in the array.");


        System.out.print("Array in reverse order: ");

        for (int i = 9; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}