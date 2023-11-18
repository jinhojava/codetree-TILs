public class Main {
    public static void main(String[] args){

        int a = 5;
        int b = 6;
        int c = 7;
        
        int tmp=b;
        b=a;
        int tmc=c;
        c=tmp;
        a=tmc;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
}}