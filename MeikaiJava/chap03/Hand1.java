import java.util.Scanner;
class Hand1 {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    System.out.print("手を選べ（０：グー／１：チョキ／２：パー）：");
    int hand = stdIn.nextInt();

    if (hand == 0)
      System.out.println("グー");
    else if (hand == 1)
      System.out.println("チョキ");
    else if (hand == 2)
      System.out.println("パー");
  }
}