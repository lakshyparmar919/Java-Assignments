  import java.io.*;
public class SalaryManagement {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        System.out.print("Enter number of employees: ");
        int n = Integer.parseInt(br.readLine());

        int id[] = new int[n];
        String name[] = new String[n];
        double basic[] = new double[n];
        double da[] = new double[n];
        double hra[] = new double[n];
        double pf[] = new double[n];
        double gross[] = new double[n];
        double net[] = new double[n];

        // Input employee details
        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter details of Employee " + (i + 1));

            System.out.print("Employee ID: ");
            id[i] = Integer.parseInt(br.readLine());

            System.out.print("Employee Name: ");
            name[i] = br.readLine();

            System.out.print("Basic Salary: ");
            basic[i] = Double.parseDouble(br.readLine());

            // Salary calculations
            da[i] = basic[i] * 0.40;
            hra[i] = basic[i] * 0.20;
            pf[i] = basic[i] * 0.12;

            gross[i] = basic[i] + da[i] + hra[i];
            net[i] = gross[i] - pf[i];
        }

        // Find highest and lowest paid employee
        int highest = 0;
        int lowest = 0;
        double totalSalary = 0;

        for (int i = 0; i < n; i++) {

            totalSalary = totalSalary + net[i];

            if (net[i] > net[highest]) {
                highest = i;
            }

            if (net[i] < net[lowest]) {
                lowest = i;
            }
        }

        double average = totalSalary / n;

        // Display employee details
        System.out.println("\n---------------- EMPLOYEE SALARY DETAILS ----------------");

        System.out.printf("%-8s %-15s %-10s %-10s %-10s %-10s %-12s %-12s%n",
                "ID", "Name", "Basic", "DA", "HRA", "PF", "Gross", "Net");

        System.out.println("--------------------------------------------------------------------------");

        for (int i = 0; i < n; i++) {

            System.out.printf("%-8d %-15s %-10.2f %-10.2f %-10.2f %-10.2f %-12.2f %-12.2f%n",
                    id[i], name[i], basic[i], da[i], hra[i],
                    pf[i], gross[i], net[i]);
        }

        // Display highest, lowest and average
        System.out.println("\nHighest Paid Employee:");
        System.out.println("Name: " + name[highest]);
        System.out.println("Net Salary: " + net[highest]);

        System.out.println("\nLowest Paid Employee:");
        System.out.println("Name: " + name[lowest]);
        System.out.println("Net Salary: " + net[lowest]);

        System.out.println("\nAverage Salary of All Employees: ₹" + average);
    }
}

