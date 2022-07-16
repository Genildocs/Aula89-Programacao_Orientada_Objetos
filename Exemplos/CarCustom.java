package Exemplos;

public class CarCustom {
    public static void main(String[] args) {
        Car carro = new Car();
        Car carro2 = new Car();

        carro.setModelo("Uno");
        carro.setMarca("Fiat");
        carro.setAno(2010);
        carro.setPlacaDoCarro("ufni89");

        System.out.println("Carro 1:");
        System.out.println("Modelo: " + carro.getModelo() + " Marca: " +
                carro.getMarca() +" Ano: " + carro.getAno() + " Placa: " + carro.getPlacaDoCarro());

        System.out.println("\nCarro 2:");
        carro2.setModelo("Civic");
        carro2.setMarca("Honda");
        carro2.setAno(2023);
        carro2.setPlacaDoCarro("ufli95");

        System.out.println("Modelo: " + carro2.getModelo() + " Marca: " +
                carro2.getMarca() +" Ano: " + carro2.getAno() + " Placa: " + carro2.getPlacaDoCarro());






    }
}
