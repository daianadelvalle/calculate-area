package ar.com.ada.figures.subclass;

import ar.com.ada.figures.superclass.Figure;

import java.util.Objects;

public class Triangle extends Figure {
    //attr
    private Double base;
    private Double height;

    //constructors
    public Triangle() {
    }

    public Triangle(Double base, Double height) {
        this.height= height;
        this.base = base;
    }

    public Triangle(Double area, Double base, Double height) {
        super(area);
        this.base = base;
        this.height = height;
    }

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
        area = (base * height) / 2;
        return area;
    }
    @Override
    public int hashCode() {
        return -56 * Objects.hash(this.area, this.base, this.height);
    }
    @Override
    public boolean equals(Object obj) {
        if (this==obj) return true;
        if (obj==null || getClass() != obj.getClass()) return false;
        Triangle that = (Triangle) obj;
        return super.area.equals(that) && this.base.equals(that.base) && this.height.equals(that.height);
    }
    @Override
    public String toString() {
        return "Un TRIANGULO: " + "\n La base es: " + base + " y la altura: " + height;
    }

}
