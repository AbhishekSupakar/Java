import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int a,r,c,s,k;
      System.out.print("Enter the digit: ");
      a = scanner.nextInt();
      // System.out.println("Enter the number of rows: ");
      // r = scanner.nextInt();
      // System.out.println("Enter the number of columns: ");
      // r = scanner.nextInt();
      for(r=1;r<=a;r++){
        for(s=1;s<=a-r;s++){
          System.err.print(" ");
        }
        for(c=1;c<=r;c++){
          System.out.print("*");
        }
        for(k=2;k<=r;k++){
          System.out.print("*");
        }
        System.out.println();
      }
      System.out.println("Hello World java!");
    }
  }
  