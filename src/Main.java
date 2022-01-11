import java.util.Scanner;

public class Main {

    public static void  main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Armstrong Sayı Bulma Programı");
        System.out.print("Bir Sayı Girin : ");
        int num = scanner.nextInt();

        Main main = new Main();
        /**
         * Armstrong Sayı Bulan Metod
         */
        main.isArmstrongNumber(num);

        /**
         * Basamak Sayısı Bulan Metod
         */
        System.out.println(main.numberOfDigits(num));



    }

    public int numberOfDigits(int num){
        int digits = 0;
        while(num != 0){
            digits++;
            num /= 10;
        }
        return digits;
    }

    public void isArmstrongNumber(int num){
        int numberOfDigits = 0;
        int tempNum = num;
        int result = 0;

        while(tempNum != 0){
            tempNum /= 10;
            numberOfDigits++;
        }
        tempNum = num;
        System.out.println("Basamak Sayısı : " + numberOfDigits);

        while(tempNum != 0){
            int digitValue = tempNum%10;
            int digitPow = 1;
            for(int i = 1; i <= numberOfDigits; i++){
                digitPow *= digitValue;
            }
            result += digitPow;
            tempNum /= 10;
        }
        if(result == num){
            System.out.println("Girdiğiniz " + num + " sayısı bir Armstrong sayıdır.");
        }else{
            System.out.println("Girdiğiniz " + num + " sayısı bir Armstrong sayı değildir.");
        }
    }
}
