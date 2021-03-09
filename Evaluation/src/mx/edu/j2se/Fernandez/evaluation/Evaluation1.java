package mx.edu.j2se.Fernandez.evaluation;

public class Evaluation1 {

    public static int biggestCircle(Circle[] circles){
        Circle biggestCircle = circles[0];
        int biggestCircleIndex = 0;

        for (int i = 1; i<circles.length;i++){
            if(biggestCircle.getArea() < circles[i].getArea()){
                biggestCircle = circles[i];
                biggestCircleIndex = i;
            }
        }
        return biggestCircleIndex;
    }

    public static void main(String[] args){

        // Create an invalid circle and catch the exception thrown to print a user friendly message.
        try{
            Circle badCircle = new Circle(-8);
        }
        catch (IllegalArgumentException e){
            System.out.println("\nPlease try a valid value :)\n");
        }

        // Create an array of three valid Circles and send it to the biggestCircle() method.
        Circle circleA = new Circle(5);
        Circle circleB = new Circle(12);
        Circle circleC = new Circle(9);
        Circle[] circles = {circleA,circleB,circleC};
        int biggestCircleIndex = biggestCircle(circles);

        //Print the radius of the largest circle.
        System.out.println("The radius of the largest circle is: "+circles[biggestCircleIndex].getRadius());
    }
}
