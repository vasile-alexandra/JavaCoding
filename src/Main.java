import Task1.Calculator;
import Task1.Operatii;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Calculator calculator = new Calculator(5, 10);
        calculator.setTermenUnu(2);
        calculator.setTermenDoi(5);


//        String operatie = scanner.next().toUpperCase();
//        if(Operatii.ADUNARE.toString().equals(operatie)){
//            System.out.println(calculator.adunare());
//        } else if (Operatii.SCADERE.toString().equals(operatie)){
//            System.out.println(calculator.scadere());
//        } else {
//            System.out.println("Valoarea introdusa invalida!");
//        }

//        System.out.println(calculator.adunare());
//        System.out.println(calculator.scadere());

//        System.out.println("Introduceti codul operatiei dorite: 1 sau 2");
//        int cod = scanner.nextInt();
//        if (Operatii.ADUNARE.getCod() == cod) {
//            System.out.println(calculator.adunare());
//        } else if (Operatii.SCADERE.getCod() == cod) {
//            System.out.println(calculator.scadere());
//        } else {
//            System.out.println("Valoarea nu este valida");
//        }
        System.out.println(calculator.numereImpare());
    }


}