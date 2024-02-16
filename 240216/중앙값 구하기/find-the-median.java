import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        int i1 = sc.nextInt();
        int i2 = sc.nextInt();

        int[] array = {i, i1, i2};

        Arrays.sort(array);

        System.out.println(array[1]);
        }

    }