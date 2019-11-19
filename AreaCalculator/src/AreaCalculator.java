public class AreaCalculator {
    public static double area(double radius) {
        if (radius < 0) { //no radius less than 0
            return -1.0;
        }
        double areaOfCircle = radius * radius * Math.PI; //using math.pi to calculate area of circle
        return areaOfCircle;
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0){
            return -1.0; //can't have a side less than 0
        }
        double areaOfRect = x * y; // area of a rectangle = base * height
        return areaOfRect;
    }
}
