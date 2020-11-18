package exercise8;

public class Point {
   public double x;
   public double y;

    public Point() {
        x = 0;
        y = 0;
    }

    public Point(double x, double y) {
        x = x;
        y = y;
    }

    public Point(Point otherPoint) {
        x = x;
        y = y;
    }

    public void initialize() {
       System.out.print("Enter x: ");
       x = INPUT.nextDouble();
       System.out.println();
       System.out.print("Enter y: ");
       y = INPUT.nextDouble();
       System.out.println();
    }

    public void translate(double xDelta, double yDelta) {
        System.out.println("Enter coordinates for translation: ");
        System.out.print("x: ");
        x = INPUT.nextDouble;
        System.out.println();
        System.out.print("y: ");
        y = INPUT.nextDouble;
        System.out.println();
    }

    public Point createNewTranslatedPoint(double xDelta, double yDelta) {
        Point pointTranslated = new Point();
        translate(x, y);
        return null;
    }

    public boolean equals(Point otherPoint) {
        
        return false;
    }

    public String toString() {
        // Represent attributes as string
        return null;
    }
}
