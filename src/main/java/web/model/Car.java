package web.model;

import java.util.Objects;

public class Car {

    private String model;
    private String color;
    private int price;

    public Car (){};

    public Car (String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public String getModel() {return model;}
    public void setModel(String model) {this.model = model;}
    public String getColor() {return color;}
    public void setColor(String color) {this.color = color;}
    public int getPrice() {return price;}
    public void setPrice(int price) {this.price = price;}

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return getPrice() == car.getPrice() && Objects.equals(getModel(), car.getModel()) && Objects.equals(getColor(), car.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getModel(), getColor(), getPrice());
    }
}
