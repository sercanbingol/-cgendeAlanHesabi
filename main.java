import java.util.Scanner;

 class alanHesabi {
    public static void main(String[] args) {

        double kenar1, kenar2, kenar3, u, alan;


        Scanner girdi1 = new Scanner(System.in);
        System.out.println("1. kenarı giriniz : ");
        kenar1 = girdi1.nextDouble();

        Scanner girdi2 = new Scanner(System.in);
        System.out.println("2. kenarı giriniz : ");
        kenar2 = girdi2.nextDouble();

        Scanner girdi3 = new Scanner(System.in);
        System.out.println("3. kenarı giriniz : ");
        kenar3 = girdi3.nextDouble();
        u = (kenar1 + kenar2 + kenar3) / 2;

        alan =Math.sqrt(u * (u - kenar1)* (u - kenar2) * (u - kenar3)) ;

        System.out.print("alan : " + alan);
    }
}