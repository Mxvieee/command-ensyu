import java.util.*;
public class Bmi {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("真(m)真真真真真;
    double height = sc.nextDouble();
    System.out.print("真(kg)真真真真真");
    double weight = sc.nextDouble();
    
    double bmi = weight / (height*height);
    System.out.println("BMI真?"+bmi+"真?");
  

    System.out.print("真(m)真真真真真;
    double hei = sc.nextDouble();
    System.out.print("真(kg)真真真真真");
    double wei = sc.nextDouble();

    double b = wei / (hei*hei);
    System.out.println("BMI真?"+b+"真?");
  }
}

