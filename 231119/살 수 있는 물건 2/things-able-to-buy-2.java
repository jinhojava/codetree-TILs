import java.util.Scanner;

public class Main {
    public static void main (String args[]) {
        // 변수 선언 및 입력
        Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();

      int book = 3000;
      int mask = 1000;
      int pen = 500;

      if(a>=book) System.out.println("book");
      else if(mask<=a&&a<book) System.out.println("mask");
      else if (a>=pen) System.out.println("pen");
      else System.out.println("no");
    }

}