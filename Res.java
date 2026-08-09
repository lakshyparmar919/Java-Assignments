import java.io.*;

class Evalu {
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  int marks_s, marks_m, marks_c, marks_b, marks_e,total;
  double percentage;
  
  void input() throws IOException {
    System.out.println("enter your marks of physics: ");
    marks_s = Integer.parseInt(br.readLine());
    System.out.println("enter the marks of maths: ");
    marks_m = Integer.parseInt(br.readLine());
    System.out.println("enter the marks of chemistry: ");
    marks_c = Integer.parseInt(br.readLine());
    System.out.println("enter the marks of biology: ");
    marks_b = Integer.parseInt(br.readLine());
    System.out.println("enter the marks of english: ");
    marks_e = Integer.parseInt(br.readLine());
    
    if(marks_s > 100 || marks_m > 100 || marks_c > 100 || marks_b > 100 || marks_e > 100){
      System.out.println("invalid input");
      return;
    }
  }
  void total(){
    total = marks_s + marks_m + marks_c + marks_b + marks_e;
    System.out.println("The total marks obtained = " + total);
  }
  void percentage(){
    percentage = total/5.0;
    System.out.println("the total percentage you got : " + percentage);
    if(percentage >= 90 && percentage <=100){
      System.out.println("A+ grade");
    }
    else if(percentage <=89 && percentage >=80){
      System.out.println("A grade");
    }
    else if(percentage >=70 && percentage <=79){
      System.out.println("B grade");
    }
    else if(percentage <=69 && percentage >=60){
      System.out.println("C garde");
    }
    else if(percentage <=59 && percentage >=50){
      System.out.println("D garde");
    }
    else{
      System.out.println("failed");
    }
  }
}

public class Res {
    public static void main(String args[]) throws IOException {
        Evalu e = new Evalu();
        e.input();
        e.total();
        e.percentage();
    }
}