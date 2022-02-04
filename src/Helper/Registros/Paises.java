package Helper.Registros;

import Ejercicio3.Pais;

import java.util.ArrayList;
import java.util.HashMap;


public class Paises {

    public HashMap<String, Pais> getPaises1() {
        HashMap<String, Pais> paises1 = new HashMap<>();
        paises1.put("ANG", new Pais("Angola", "Africa", "Luanda", 24300000));
        paises1.put("BER", new Pais("Benín", "Africa", "Porto Novo", 10598482));
        paises1.put("BOT", new Pais("Botsuana", "Africa", "Gaborone", 2254126));
        paises1.put("CAN", new Pais("Canadá", "Norte America", "Ottawa", 35108000));
        paises1.put("EST", new Pais("Estados Unidos", "Norte America", "Washington D. C.", 315115000));
        paises1.put("MEX", new Pais("México", "Norte America", "Ciudad de México", 116352000));

        paises1.put("ARG", new Pais("Argentina", "Sud America", "Buenos Aires", 45195774));
        paises1.put("BOL", new Pais("Bolivia", "Sud America", "Sucre", 11673021));
        paises1.put("BRA", new Pais("Brasil", "Sud America", "Porto Novo", 212559417));

        return paises1;
    }

    public HashMap<String, Pais> getPaises2() {
        HashMap<String, Pais> paises2 = new HashMap<>();
        paises2.put("BOL", new Pais("Bolivia", "Sud America", "Sucre", 11673021));
        paises2.put("CHI", new Pais("Chile", "Sud America", "Gaborone", 19116201));
        paises2.put("PAR", new Pais("Paraguay", "Sud America", "Asunción", 7132538));
        paises2.put("URU", new Pais("Uruguay", "Sud America", "Montevideo", 3473730));

        paises2.put("AUS", new Pais("Australia", "Oceania", "Camberra", 25290000));
        paises2.put("FIY", new Pais("Fiyi", "Oceania", "Suva", 896444));
        paises2.put("ISL", new Pais("Islas Salomón", "Oceania", "Honiara", 686878));
        paises2.put("KIR", new Pais("Kiribati", "Oceania", "Tarawa", 119446));

        paises2.put("ARF", new Pais("Afganistan", "Asia", "Kabul", 38930000));
        paises2.put("ARA", new Pais("Arabia Saudita", "Asia", "Riad", 34810000));
        paises2.put("ARM", new Pais("Armenia", "Asia", "Ereván", 2963000));
        paises2.put("AZE", new Pais("Azerbaiyán", "Asia", "Bakú", 10110000));
        return paises2;
    }
}
