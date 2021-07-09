package co.edu.utp.misiontic2022.c2;

public class Coche extends Vehiculo {
    private Integer numRuedas;

    public Coche(){ 
        super();       
    }

    public Coche(String color,Integer numSerie, Integer numRuedas){ 
        super(color,numSerie);
        this.numRuedas = numRuedas;
    }

    public Integer getNumRuedas(){
        return numRuedas;
    }

    public void setNumRuedas(Integer numRuedas){
        this.numRuedas = numRuedas;
    }

}
