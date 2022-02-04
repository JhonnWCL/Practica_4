package Helper;

import java.util.Scanner;

public class Validation {
    private Scanner sc;
    private boolean flag;
    private MessagesConsole printMsj;
    private int dataNumber;
    private String input;

    public Validation() {
        sc = new Scanner(System.in);
        flag = true;
        printMsj = new MessagesConsole();
        dataNumber = 0;
    }

    //validacion de ingreso de datos en un intervalo definido
    public int getValidOption(int numMax) {
        while (flag) {
            getNumber();
            if (dataNumber == 0) System.exit(0);
            else {
                if (dataNumber > 0 && dataNumber <= numMax) flag = false;
                else printMsj.showMsjInvalidOption();
            }
        }
        flag = true;
        return dataNumber;
    }

    //verificacion de que el ingresos de dato es un numero entero positivo
    private void getNumber() {
        while (true) {
            input = sc.nextLine();
            try {
                dataNumber = Integer.parseInt(input);
                break;
            } catch (Exception e) {
                printMsj.showMsjInvalidNumber();
            }
        }
    }
}
