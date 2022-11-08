import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("¿¿(m)¿¿¿¿¿¿¿¿¿¿;
    double height = sc.nextDouble();
    System.out.print("¿¿(kg)¿¿¿¿¿¿¿¿¿¿");
    double weight = sc.nextDouble();
    
    double bmi = weight / (height*height);
    System.out.println("BMI¿¿¿"+bmi+"¿¿¿");
  

    System.out.print("¿¿(m)¿¿¿¿¿¿¿¿¿¿;
    double hei = sc.nextDouble();
    System.out.print("¿¿(kg)¿¿¿¿¿¿¿¿¿¿");
    double wei = sc.nextDouble();

    double b = wei / (hei*hei);
    System.out.println("BMI¿¿¿"+b+"¿¿¿");
  }
}

