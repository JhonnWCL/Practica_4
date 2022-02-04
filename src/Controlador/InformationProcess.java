package Controlador;
import Ejercicio1.Pr1FibonacciSeries;
import Ejercicio2.FibonacciLinkedList;
import Ejercicio3.Country;
import Helper.Colors;
import Helper.MessagesConsole;
import Helper.RegisteredCountries;
import Helper.Validation;
import java.util.*;

public class InformationProcess {
    private int validOption;
    private MessagesConsole messagesConsole;
    private Validation validacion;
    private Pr1FibonacciSeries practice1;
    private FibonacciLinkedList practice2;
    private RegisteredCountries registeredCountries;
    private ArrayList<Integer> fibo;

    public InformationProcess() {
        messagesConsole = new MessagesConsole();
        validacion = new Validation();
        practice1 = new Pr1FibonacciSeries();
        fibo = new ArrayList<>();
        practice2 = new FibonacciLinkedList();
        registeredCountries = new RegisteredCountries();
    }

    public void run() {
        while (true) {
            messagesConsole.showOptionsMenu();
            processOptions();
            System.out.println("\n");
        }
    }

    private void processOptions() {
        validOption = validacion.getValidOption(3);
        switch (validOption) {
            case 1:
                fiboArraySeries();
                break;
            case 2:
                fiboListFirtsLast();
                break;
            case 3:
                showCountriesContinets();
                break;
        }
    }

    private void fiboArraySeries() {
        messagesConsole.showMsjRangeF();
        validOption = validacion.getValidOption(100);
        fibo = practice1.serieFibonacci(validOption);
    }

    private void fiboListFirtsLast() {
        if (fibo.size() != 0) {
            messagesConsole.showAnswerFibo();
            String res = practice2.getFrLsFibo(fibo);
            System.out.println(res);
        } else {
            messagesConsole.showMsjNotFibo();
            fiboArraySeries();
            messagesConsole.showAnswerFibo();
            System.out.println(practice2.getFrLsFibo(fibo));
        }
    }

    private void showCountriesContinets() {
        HashMap<String, Country> lista = registeredCountries.getCountries1();
        lista.putAll(registeredCountries.getCountries2());
        messagesConsole.showTitleCountries();
        sortByContinent(lista);
        System.out.println(Colors.Yellow+"-----------------------------------------------------"+Colors.Default);
    }

    private void sortByContinent(HashMap<String, Country> list) {
        list.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(x -> System.out.printf("%-20s%-30s%-20s\n", x.getValue().getContinentName(), x.getValue().getCountryName(),x.getKey()));
    }
}
