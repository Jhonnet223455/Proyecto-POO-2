import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Prueba 1");

        Scanner con = new Scanner(System.in);

        int val1 = 10;
        System.out.println(val1);

        System.out.println("Digite 2  numeros");
        int a = con.nextInt();
        int b = con.nextInt();
        System.out.println(sum(a,b));


    }
    public static int sum(int a, int b){

        int c = Math.max(a,b);
        return c;


    }
}