package Helper;

import Ejercicio3.Country;

import java.util.HashMap;


public class RegisteredCountries {

    public HashMap<String, Country> getCountries1() {
        HashMap<String, Country> countries = new HashMap<>();
        countries.put("ANG", new Country("Angola", "Africa", "Luanda", 24300000));
        countries.put("BOL", new Country("Bolivia", "Sud America", "Sucre", 11673021));
        countries.put("BOT", new Country("Botsuana", "Africa", "Gaborone", 2254126));
        countries.put("MEX", new Country("México", "Norte America", "Ciudad de México", 116352000));
        countries.put("AUS", new Country("Australia", "Oceania", "Camberra", 25290000));
        countries.put("CAN", new Country("Canadá", "Norte America", "Ottawa", 35108000));
        countries.put("BRA", new Country("Brasil", "Sud America", "Porto Novo", 212559417));
        countries.put("ARA", new Country("Arabia Saudita", "Asia", "Riad", 34810000));
        countries.put("ARG", new Country("Argentina", "Sud America", "Buenos Aires", 45195774));
        countries.put("EST", new Country("Estados Unidos", "Norte America", "Washington D. C.", 315115000));
        return countries;
    }

    public HashMap<String, Country> getCountries2() {
        HashMap<String, Country> countries = new HashMap<>();
        countries.put("BOL", new Country("Bolivia", "Sud America", "Sucre", 11673021));
        countries.put("KIR", new Country("Kiribati", "Oceania", "Tarawa", 119446));
        countries.put("CHI", new Country("Chile", "Sud America", "Gaborone", 19116201));
        countries.put("FIY", new Country("Fiyi", "Oceania", "Suva", 896444));
        countries.put("ARF", new Country("Afganistan", "Asia", "Kabul", 38930000));
        countries.put("ISL", new Country("Islas Salomón", "Oceania", "Honiara", 686878));
        countries.put("URU", new Country("Uruguay", "Sud America", "Montevideo", 3473730));
        countries.put("ARM", new Country("Armenia", "Asia", "Ereván", 2963000));
        countries.put("PAR", new Country("Paraguay", "Sud America", "Asunción", 7132538));
        countries.put("AZE", new Country("Azerbaiyán", "Asia", "Bakú", 10110000));
        countries.put("ARG", new Country("Argentina", "Sud America", "Buenos Aires", 45195774));
        countries.put("BER", new Country("Benín", "Africa", "Porto Novo", 10598482));
        return countries;
    }
}
