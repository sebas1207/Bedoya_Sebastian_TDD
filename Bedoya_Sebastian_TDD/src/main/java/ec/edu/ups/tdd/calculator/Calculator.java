package ec.edu.ups.tdd.calculator;

public class Calculator {


    private int ans;
    public int addition(int a, int b) {
        return a+b;
    }
    public int additionTime(int a, int b) {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return a+b;
    }

    public int subtraction(int a, int b) {
        return a-b;
    }
    public int subtractionTime(int a, int b) {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return a-b;
    }

    public int multiply(int a, int b) {
        return a*b;
    }

    public int multiplyTime(int a, int b) {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
           throw new RuntimeException(e);
        }
        return a*b;
    }

    public int divide(int a, int b) {
        return a/b;
    }
    public int divideTime(int a, int b) {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return a/b;
    }

    public int getAns() {
        return ans;
    }

    public void setAns(int ans) {
        this.ans = ans;
    }

}

