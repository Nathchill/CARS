package udem.edu.co.car.entity.impl;

public class Sandero extends Renault {
    private String Color;
    private String Placa;

    @Override
    public String toString() {
        return "sandero{" +
                "Color='" + Color + '\'' +
                ", Placa='" + Placa + '\'' +
                '}';
    }

    public Sandero(String color, String placa) {
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
