package Ejercicio1;

import java.util.ArrayList;

public class Pr1FibonacciSeries {
    ArrayList<Integer> containerSeries;
    int a, b;
    String result;

    public ArrayList<Integer> serieFibonacci(int n) {
        containerSeries = new ArrayList<>();
        a = 0;   b = 1;        result = "";
        for (int i = 1; i <= n; i++) {
            containerSeries.add(a);
            result += a + " ";
            a = a + b;
            b = a - b;
        }
        System.out.print("Serie Fibonacci: \n" + result +"\n");
        return containerSeries;
    }
}
