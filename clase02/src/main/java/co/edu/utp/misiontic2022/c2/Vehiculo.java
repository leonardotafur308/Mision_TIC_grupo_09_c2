package co.edu.utp.misiontic2022.c2;

public class Vehiculo {
    // atributos
    private String color;
    private Integer numSerie;

    // constructor
    public Vehiculo(){
    }

    public Vehiculo(String color,Integer numSerie){
        this.color = color;
        this.numSerie = numSerie;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public Integer getNumSerie(){
        return numSerie;
    }

    public void setNumSerie(Integer numSerie){
        this.numSerie = numSerie;
    }



}
