package ar.com.ada.figures.subclass;

import ar.com.ada.figures.superclass.Figure;

import java.util.Objects;

public class Rectangle extends Figure {
    //attr
    private Double base;
    private Double height;
    //constructors
    public Rectangle() {}
    public Rectangle(Double area, Double base, Double height) {
        super(area);
        this.base = base;
        this.height = height;
    }
    //getter and setter
    public Double getBase() {
        return base;
    }
    public void setBase(Double base) {
        this.base = base;
    }
    public Double getHeight() {
        return height;
    }
    public void setHeight(Double height) {
        this.height = height;
    }
    //methods
    @Override
    public Double calculateArea() {
        area = base * height;
        return area;
    }
    //
    @Override
    public int hashCode() {
        return -56 * Objects.hash(this.area, this.base, this.height);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Rectangle that = (Rectangle) obj;
        return super.area.equals(that) && this.base.equals(that.base) && this.height.equals(that.height);
    }
    @Override
    public String toString() {
        return "un RECTANGULO: " + "base: " + base + ", altura: " + height + "cm";
    }


}
