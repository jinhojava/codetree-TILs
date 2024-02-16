import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String z = sc.nextLine();

        StringTokenizer st = new StringTokenizer(s);
        int s1 = Integer.parseInt(st.nextToken());
        String s2 = st.nextToken();

        StringTokenizer st1 = new StringTokenizer(z);
        int z1 = Integer.parseInt(st1.nextToken());
        String z2 = st1.nextToken();

        if(s1>=19&&s2.equals("M")){
            System.out.println(1);
        } else if (z1>=19&&z2.equals("M")) {
            System.out.println(1);
        }
        else System.out.println(0);
    }

}