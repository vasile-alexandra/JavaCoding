import Task1.Calculator;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator(5,10);
        calculator.setTermenUnu(2.1f);
        calculator.setTermenDoi(5);

        System.out.println(calculator.adunare());
    }
}