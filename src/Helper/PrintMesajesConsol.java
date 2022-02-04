package Helper;

public class PrintMesajesConsol {

    public void printMenuPractica4(){
        System.out.println(Colors.Blue+"----------------------------------------------------- OPCIONES ----------------------------------------------------");
        System.out.println("> Digite el numero de una de las pociones, "+ Colors.Red+"0 "+Colors.Blue+" para salir del programa en cualquier momento");
        System.out.println(">"+ Colors.Red+" 1"+Colors.Blue+" Almacenar una cantidad N de la serie fibonacci en un Arraylist y mostrarlo");
        System.out.println(">"+ Colors.Red+" 2"+Colors.Blue+" Almacenar una cantidad N de la serie fibonacci en un Arraylist, transformarlo a un LinkedList y mostrarlo");
        System.out.println(">"+ Colors.Red+" 3"+Colors.Blue+" ver una serie de paises ordenados por continente los cuales se encontraban en 2 Hasmap, se los unio y ordeno"+Colors.Default);
        System.out.print(Colors.Blue+"Opcion> "+Colors.Default);
    }

    public void printNumeroInvalido(){
        System.out.println("x El dato ingresado es invalido digite un numero entero positivo");
    }

    public void printOpcioinInvalida(){
        System.out.println("x La opcion indicada es incorrecta");
    }

    public void printProcesootransformacion(){
        System.out.println("Primer y ultimo elemento de la serie fibonacci almacenado en un Linked List: ");
    }

    public void printNRangoFibo(){
        System.out.println(Colors.Blue+"Opcion> "+Colors.Default+" Ingrese la cantida N para la serie fibonacci");
        System.out.print(Colors.Blue+"Cantidad> "+Colors.Default);
    }
    public void printTitulo(){
        System.out.println("**************************************** PRACTICA 4****************************************");
    }

    public void printPaiseContinentes(){
        System.out.println(Colors.Red+"Paises y continentes del mundo:"+Colors.Default);
    }
    public void printNoRangoFibo(){
        System.out.println(Colors.Red+"No registro el rango de la serie fibonacci para que se almacene en el arreglo"+Colors.Default);
    }

    public void printTitulos(){
        System.out.println("*******************************************");
        System.out.printf("%-10s%-20s%-20s\n", "CLAVE", "CONTINENTE", "PAIS");
        System.out.println("*******************************************");
    }
}
