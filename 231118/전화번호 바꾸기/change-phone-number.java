import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        String substring = a.substring(4, 8);
        String substring1 = a.substring(9);

        System.out.println("010"+"-"+substring1+"-"+substring);
    }}