import java.util.Scanner;

public class Main {
    public static void main (String args[]) {
        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      int d = a+b+c;
      int e = d/3;
      int f = d-e;

        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }
}