import java.util.Scanner;
class Sort2 {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    System.out.print("変数a:"); int a = stdIn.nextInt();
    System.out.print("変数b:"); int b = stdIn.nextInt();

    if (a > b) {
      int t = a;
      a = b;
      b = t;
    }

    System.out.println("昇順にソートしました");
    System.out.println("変数aは" + a);
    System.out.println("変数bは" + b);
  }
}