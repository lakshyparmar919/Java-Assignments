import java.io.*;

 class ElectricityBill {
    public static void main(String args[]) throws IOException {
     CalculateBill b = new CalculateBill();
     b.Input();
     b.Calc();
     b.Show();
    }
}

    class CalculateBill{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String name;
        int consumerNo, units;
        double bill = 0;
        double surcharge = 0;
        void Input()throws IOException{
        System.out.println("Enter Consumer Name: ");
        name = br.readLine();

        System.out.println("Enter Consumer Number: ");
        consumerNo = Integer.parseInt(br.readLine());

        System.out.println("Enter Units Consumed: ");
        units = Integer.parseInt(br.readLine());
        }
        void Calc(){
        if (units <= 100) {
            bill = units * 3;
        }
        else if (units <= 200) {
            bill = (100 * 3) + ((units - 100) * 5);
        }
        else if (units <= 500) {
            bill = (100 * 3) + (100 * 5) + ((units - 200) * 7);
        }
        else {
            bill = (100 * 3) + (100 * 5) + (300 * 7)
                    + ((units - 500) * 10);
        }
        if (bill > 5000) {
            surcharge = bill * 0.05;
            bill = bill + surcharge;
        }
    }
    void Show(){
        System.out.println(" ELECTRICITY BILL  ");
        System.out.println("Surcharge: " + surcharge);
        System.out.println("Total Bill: " + bill);
    }
}
