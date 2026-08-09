 import java.io.*;
public class Operations{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        System.out.print("Enter a number: ");
        int n = Integer.parseInt(br.readLine());
        int choice;
        do {
            System.out.println("\n----- NUMBER ANALYSIS TOOL -----");
            System.out.println("1. Check Prime");
            System.out.println("2. Check Palindrome");
            System.out.println("3. Check Armstrong");
            System.out.println("4. Sum of Digits");
            System.out.println("5. Reverse Number");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(br.readLine());

            switch (choice) {
                case 1:
                    boolean prime = true;
                    if (n < 2) {
                        prime = false;
                    }
                    else {
                        for (int i = 2; i < n; i++) {
                            if (n % i == 0) {
                                prime = false;
                                break;
                            }
                        }
                    }
                    if (prime)
                        System.out.println(n + " is a Prime Number");
                    else
                        System.out.println(n + " is not a Prime Number");
                    break;
                case 2:
                    int temp = n;
                    int reverse = 0;
                    while (temp != 0) {
                        int digit = temp % 10;
                        reverse = reverse * 10 + digit;
                        temp = temp / 10;
                    }
                    if (n == reverse)
                        System.out.println(n + " is a Palindrome");
                    else
                        System.out.println(n + " is not a Palindrome");

                    break;

                case 3:
                    temp = n;
                    int sum = 0;

                    while (temp != 0) {
                        int digit = temp % 10;
                        sum = sum + (digit * digit * digit);
                        temp = temp / 10;
                    }

                    if (n == sum)
                        System.out.println(n + " is an Armstrong Number");
                    else
                        System.out.println(n + " is not an Armstrong Number");

                    break;

                case 4:
                    temp = n;
                    sum = 0;

                    while (temp != 0) {
                        int digit = temp % 10;
                        sum = sum + digit;
                        temp = temp / 10;
                    }

                    System.out.println("Sum of digits = " + sum);
                    break;

                case 5:
                    temp = n;
                    reverse = 0;

                    while (temp != 0) {
                        int digit = temp % 10;
                        reverse = reverse * 10 + digit;
                        temp = temp / 10;
                    }

                    System.out.println("Reverse of " + n + " = " + reverse);
                    break;

                case 6:
                    System.out.println("Program Exited.");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 6);
    }
}

