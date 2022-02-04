package Ejercicio2;

import java.util.ArrayList;
import java.util.LinkedList;

public class FibonacciLinkedList {
    LinkedList<Integer> fibonacciList;
    public  FibonacciLinkedList(){
        fibonacciList = new LinkedList<>();
    }
    public String getFrLsFibo(ArrayList<Integer> fibo){
        fibo.forEach((e)->fibonacciList.add(e));
    return "\n"+fibonacciList.getFirst()+" como primero y "+fibonacciList.getLast()+" como ultimo valor";
    }
}
