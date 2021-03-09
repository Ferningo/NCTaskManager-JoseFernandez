package mx.edu.j2se.Fernandez.evaluation;

import java.text.DecimalFormat;

public class Circle {

    private double radius;


    // A default constructor that sets the radius to 1.
    public Circle(){
        this.radius = 1;
    }

    //A constructor that takes the value of the radius and throws an IllegalArgumentException exception if
    //the radius is invalid.
    public Circle(double radius) throws IllegalArgumentException{
        setRadius(radius);
    }

    // getArea() use Math.PI for the value of π.
    public double getArea(){
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        double area = Math.pow(this.radius,2)*Math.PI;
        double formatedArea = Double.parseDouble(numberFormat.format(area));
        return formatedArea;
    }



    public void setRadius(double radius) throws IllegalArgumentException {
            this.radius = (double) radius;
            if (radius <= 0){
                throw new IllegalArgumentException();
            }
    }

    public double getRadius() {
        return this.radius;
    }


}
