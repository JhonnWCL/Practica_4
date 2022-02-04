package Controlador;

import Ejercicio1.Pr1SerieFibonacci;
import Ejercicio2.FibonacciLinkedList;
import Ejercicio3.Pais;
import Helper.PrintMesajesConsol;
import Helper.Registros.Paises;
import Helper.Validaciones;

import java.util.*;
import java.util.HashMap;

public class ProcesoInfromacion {
    private int opcionValida;
    private PrintMesajesConsol consola;
    private Validaciones validacion;
    private Pr1SerieFibonacci pr1;
    private FibonacciLinkedList pr2;
    private Paises paises;
    private ArrayList<Integer> fibo;

    public ProcesoInfromacion() {
        consola = new PrintMesajesConsol();
        validacion = new Validaciones();
        pr1 = new Pr1SerieFibonacci();
        fibo = new ArrayList<>();
        pr2 = new FibonacciLinkedList();
        paises = new Paises();
    }

    public void run() {
        while (true) {
            consola.printMenuPractica4();
            procesarOpciones();
            System.out.println("\n");
        }
    }

    private void procesarOpciones() {
        opcionValida = validacion.getOpcionValida(3);
        switch (opcionValida) {
            case 1:
                SerieFiboArray();
                break;
            case 2:
                primerUltimoFiboList();
                break;
            case 3:
                printPaiseContinentes();
                break;
        }
    }

    private void SerieFiboArray() {
        consola.printNRangoFibo();
        opcionValida = validacion.getOpcionValida(100);
        fibo = pr1.serieFibonacci(opcionValida);
    }

    private void primerUltimoFiboList() {
        if (fibo.size() != 0) {
            consola.printProcesootransformacion();
            String res = pr2.getFrLsFibo(fibo);
            System.out.println(res);
        } else {
            consola.printNoRangoFibo();
            SerieFiboArray();
            consola.printProcesootransformacion();
            System.out.println(pr2.getFrLsFibo(fibo));
        }
    }

    private void printPaiseContinentes() {
        HashMap<String, Pais> lista = paises.getPaises1();
        lista.putAll(paises.getPaises2());
        consola.printPaiseContinentes();
        ordenarPorContinente(lista);
    }

    private void ordenarPorContinente(HashMap<String, Pais> list) {
        consola.printTitulos();
        list.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(x -> System.out.printf("%-10s%-20s%-10s\n", x.getKey(), x.getValue().getNombreContinente(), x.getValue().getNombrePais()));
        System.out.println("*******************************************");
    }

}
