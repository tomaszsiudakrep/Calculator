package calculator.calculator;

public class Calculator {

    int a = 10;
    int b = 5;
    int sum;
    int sub;

    public void addAToB() {
        sum = a + b;
        System.out.println("a + b = " + sum);
    }

    public void subBFromA() {
        sub = a - b;
        System.out.println("a - b = " + sub);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.addAToB();
        calculator.subBFromA();
    }
}

