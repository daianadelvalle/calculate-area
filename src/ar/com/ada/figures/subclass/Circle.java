package ar.com.ada.figures.subclass;

import ar.com.ada.figures.superclass.Figure;

import java.util.Objects;

public class Circle extends Figure {
    //attr
    private Double radio;
    //Constructors
    public Circle() {}
    public Circle(Double radio) {
        this.radio = radio;
    }
    public Circle(Double area, Double radio) {
        super(area);
        this.radio = radio;
    }
    //getter and setter
    public Double getRadio() {
        return radio;
    }
    public void setRadio(Double radio) {
        this.radio = radio;
    }
    @Override
    public Double calculateArea() {
        area = ( Math.PI * Math.pow(radio, radio));
        return area;
    }
    @Override
    public int hashCode() {
        return -45 * Objects.hash(this.radio);
    }
    @Override
    public boolean equals(Object obj) {
        if (this==obj) return true;
        if (obj==null || getClass() != obj.getClass()) return false;
        Circle that = (Circle) obj;
        return super.equals(that) && this.radio.equals(that.area);
    }
    @Override
    public String toString() {
        return "UN CIRCULO: " + "\n El radio es de : " +  radio + "cm";
    }
}
