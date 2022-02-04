package Ejercicio3;

public class Country implements ICountry, Comparable<Country> {
    private String countryName;
    private String continentName;
    private String capitalName;
    private Integer populationQuantity;

    public Country(String countryName, String continentName, String capitalName, Integer populationQuantity) {
        this.countryName = countryName;
        this.continentName = continentName;
        this.capitalName = capitalName;
        this.populationQuantity = populationQuantity;
    }

    @Override
    public void setContinentName(String continentName) {
        this.continentName = continentName;
    }

    @Override
    public void setCapitalName(String capitalName) {
        this.capitalName = capitalName;
    }

    @Override
    public void setPopulationQuantity(Integer populationQuantity) {
        this.populationQuantity = populationQuantity;
    }

    @Override
    public String getCountryName() {
        return countryName;
    }

    @Override
    public String getContinentName() {
        return continentName;
    }

    @Override
    public Integer cantidadPoblacion() {
        return populationQuantity;
    }

    @Override
    public String geNombretCapital() {
        return capitalName;
    }

    @Override
    public void setCountryName(String countryName) {
    }

    public int compareTo(Country country) {
        return this.continentName.compareTo(country.continentName);
    }

}
