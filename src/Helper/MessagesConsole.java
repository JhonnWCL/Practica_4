package Helper;

public class MessagesConsole {

    public void showOptionsMenu(){
        System.out.println(Colors.Blue+"----------------------------------------------------- OPCIONES ----------------------------------------------------");
        System.out.println("> Digite el numero de una de las pociones, "+ Colors.Red+"0 "+Colors.Blue+" para salir del programa en cualquier momento");
        System.out.println(">"+ Colors.Red+" 1"+Colors.Blue+" Almacenar una cantidad N de la serie fibonacci en un Arraylist y mostrarlo");
        System.out.println(">"+ Colors.Red+" 2"+Colors.Blue+" Almacenar una cantidad N de la serie fibonacci en un Arraylist, transformarlo a un LinkedList y mostrarlo");
        System.out.println(">"+ Colors.Red+" 3"+Colors.Blue+" ver una serie de paises ordenados por continente los cuales se encontraban en 2 Hasmap, se los unio y ordeno"+Colors.Default);
        System.out.print(Colors.Blue+"Opcion> "+Colors.Default);
    }

    public void showMsjInvalidNumber(){
        System.out.println("x El dato ingresado es invalido digite un numero entero positivo");
    }

    public void showMsjInvalidOption(){
        System.out.println("x La opcion indicada es incorrecta");
    }

    public void showAnswerFibo(){
        System.out.println("Primer y ultimo elemento de la serie fibonacci almacenado en un Linked List: ");
    }

    public void showMsjRangeF(){
        System.out.println(Colors.Blue+"Opcion> "+Colors.Default+" Ingrese la cantida N para la serie fibonacci");
        System.out.print(Colors.Blue+"Cantidad> "+Colors.Default);
    }
    public void showTitle(){
        System.out.println("**************************************** PRACTICA 4****************************************");
    }

    public void showTitleCountries(){
        System.out.println(Colors.Red+"Paises y continentes del mundo:"+Colors.Default);
        System.out.println(Colors.Yellow+"-------------------------------------------------------"+Colors.Default);
        System.out.printf("%-25s%-30s%-20s\n", Colors.Blue+"CONTINENTE"+Colors.Yellow, "      PAIS", Colors.Default+"     CLAVE");
        System.out.println(Colors.Yellow+"-------------------------------------------------------"+Colors.Default);
    }
    public void showMsjNotFibo(){
        System.out.println(Colors.Red+"No registro el rango de la serie fibonacci para que se almacene en el arreglo"+Colors.Default);
    }
}
