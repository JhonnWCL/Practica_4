package Ejercicio1;

import java.util.ArrayList;

public class Pr1SerieFibonacci {
    ArrayList<Integer> contenedor;
    int a, b;
    String res;

    public Pr1SerieFibonacci() {
    }

    public ArrayList<Integer> serieFibonacci(int n) {
        contenedor = new ArrayList<>();
        a = 0;   b = 1;        res = "";
        for (int i = 1; i <= n; i++) {
            contenedor.add(a);
            res += a + " ";
            a = a + b;
            b = a - b;
        }
        System.out.print("Serie Fibonacci: \n" + res+"\n");
        return contenedor;
    }
}
