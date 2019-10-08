package ar.com.ada.figures.superclass;

import java.util.Objects;

public abstract class Figure {
    //attr
    protected Double area;

    //constructors
    public Figure() {
    }

    public Figure(Double area) {
        this.area = area;
    }

    //getter and setter
    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    //methods
    public abstract Double calculateArea();

    //
    @Override
    public int hashCode() {
        return -54 * Objects.hash(this.area);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Figure that = (Figure) obj;
        return this.area.equals(that.area);
    }

    @Override
    public String toString() {
        return "El area de la figura es: " + area;
    }

}
