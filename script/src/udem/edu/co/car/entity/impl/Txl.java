package udem.edu.co.car.entity.impl;

public class Txl extends Toyota {
    private String Color;
    private String Placa;

    @Override
    public String toString() {
        return "txl{" +
                "Color='" + Color + '\'' +
                ", Placa='" + Placa + '\'' +
                '}';
    }

    public Txl(String color, String placa) {
        super();
        Color = color;
        Placa = placa;
    }
    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String placa) {
        Placa = placa;
    }

    @Override
    public void mover() {

    }
}
