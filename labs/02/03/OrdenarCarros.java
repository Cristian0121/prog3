
package parte3;

class Carro {
    private String marca;
    private String modelo;
    private String color;
    private double kilometraje;

    public Carro(String marca, String modelo, String color, double kilometraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.kilometraje = kilometraje;
    }

    public String getModelo() {
        return modelo;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    @Override
    public String toString() {
        return "Marca: " + marca + ", Modelo: " + modelo + ", Color: " + color + ", Kilometraje: " + kilometraje;
    }
}



