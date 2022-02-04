package Helper;

import java.util.Scanner;

public class Validaciones {
    private Scanner sc;
    private boolean bandera;
    PrintMesajesConsol printMsj;
    private int datoNum;
    private String input;

    public Validaciones() {
        sc = new Scanner(System.in);
        bandera = true;
        printMsj = new PrintMesajesConsol();
        datoNum = 0;
    }

    public int getOpcionValida(int numMax) {
        while (bandera) {
            getNumero();
            if (datoNum == 0) System.exit(0);
            else {
                if (datoNum > 0 && datoNum <= numMax) bandera = false;
                else printMsj.printOpcioinInvalida();
            }
        }
        bandera = true;
        return datoNum;
    }

    private void getNumero() {
        while(true){
            input = sc.nextLine();
            try{
               datoNum=Integer.parseInt(input);
               break;
            }catch (Exception e){
               printMsj.printNumeroInvalido();
            }
        }
    }
}
