package Ejercicio3;

public class Pais implements IPais, Comparable<Pais> {
    private String nombrePais;
    private String nombreContinente;
    private String nombreCapital;
    private Integer cantidadPoblacion;

    public Pais(String nombrePais, String nombreContinente, String nombreCapital, Integer cantidadPoblacion) {
        this.nombrePais = nombrePais;
        this.nombreContinente = nombreContinente;
        this.nombreCapital = nombreCapital;
        this.cantidadPoblacion = cantidadPoblacion;
    }

    @Override
    public void setNombreContinente(String nombreContinente) {
        this.nombreContinente = nombreContinente;
    }

    @Override
    public void setNombreCapital(String nombreCapital) {
        this.nombreCapital = nombreCapital;
    }

    @Override
    public void setCantidadPoblacion(Integer cantidadPoblacion) {
        this.cantidadPoblacion = cantidadPoblacion;
    }

    @Override
    public String getNombrePais() {
        return nombrePais;
    }

    @Override
    public String getNombreContinente() {
        return nombreContinente;
    }

    @Override
    public Integer cantidadPoblacion() {
        return cantidadPoblacion;
    }

    @Override
    public String geNombretCapital() {
        return nombreCapital;
    }

    @Override
    public void setNombrePais(String nombrePais) {
    }

    public int compareTo(Pais pais) {
        return this.nombreContinente.compareTo(pais.nombreContinente);
    }

}
