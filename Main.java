import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int number;
    System.out.println("Enter a number to count down or up from:");
    number = s.nextInt();
    if (number>0)
      for(int count = number; count>=0; count--)
        System.out.println(count);
        else 
        for (int count = number; count<0; count++)
          System.out.println(count);
          System.out.println("Blast Off!");
  }
}