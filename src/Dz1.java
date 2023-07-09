import java.util.Scanner;

public class Dz1 {
    public static void main(String[] args) {
        Scanner iScaner = new Scanner(System.in);
        System.out.println(" n= ");
        Integer n = iScaner.nextInt();
        int t = (n*(n+1))/2;
        int fact = 1;
        for (int i =1; i <= n; i++){
            fact = fact*i;
        }
        System.out.println("Треугольное число= " + t);
        System.out.println(n+"!= " + fact);
        iScaner.close();
    }
}
