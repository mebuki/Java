import java.util.Scanner;
class Season {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    System.out.print("季節を求めます。\n何月ですか？");
    int n = stdIn.nextInt();

    if (n >= 3 && n <= 5)
      System.out.println("それは春です");
    else if (n >= 6 && n <= 8)
      System.out.println("それは夏です");
    else if (n >= 9 && n <= 11)
      System.out.println("それは秋です");
    else if (n == 12 || n == 1 || n == 2)
      System.out.println("それは冬です");
  }
}