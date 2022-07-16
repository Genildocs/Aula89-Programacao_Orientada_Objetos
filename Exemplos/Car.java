package Exemplos;

public class Car {
    //Declarando os atributos
    protected String placaDoCarro;
    private String modelo;
    private String marca;
    private Integer ano;

    //Construtor
    public Car(){
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.placaDoCarro = placaDoCarro;
    }
    //getters
    public String getModelo(){
        return this.modelo;
    }

    public String getMarca(){
        return this.marca;
    }

    public Integer getAno(){
        return this.ano;
    }

    public String getPlacaDoCarro() {
        return placaDoCarro;
    }

    //setter
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setAno(Integer ano){
        this.ano = ano;
    }

    public void setPlacaDoCarro(String placaDoCarro){
        this.placaDoCarro = placaDoCarro;
    }




}
