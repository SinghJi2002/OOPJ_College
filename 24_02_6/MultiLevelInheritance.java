import java.util.Scanner;
class Plate {
    protected double length;
    protected double width;

    public Plate(double length, double width) {
        this.length = length;
        this.width = width;
        System.out.println("The length,width and height of the constructor are "+this.length+" "+this.width);
    }
}
class Box extends Plate {
    protected double height;

    public Box(double length, double width, double height) {
        super(length, width);
        this.height = height;
        System.out.println("The length,width and height of the constructor are "+this.length+" "+this.width+" "+this.height);
    }
}
class WoodBox extends Box {
    protected double thickness;

    public WoodBox(double length, double width, double height, double thickness) {
        super(length, width, height);
        this.thickness = thickness;
        System.out.println("The length,width and height of the constructor are "+this.length+" "+this.width+" "+this.height+" "+this.thickness);
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter dimensions for Plate (length width):");
        double plateLength = scanner.nextDouble();
        double plateWidth = scanner.nextDouble();
        Plate plate = new Plate(plateLength, plateWidth);
        System.out.println("Enter dimensions for Box (length width height):");
        double boxLength = scanner.nextDouble();
        double boxWidth = scanner.nextDouble();
        double boxHeight = scanner.nextDouble();
        Box box = new Box(boxLength, boxWidth, boxHeight);
        System.out.println("Enter dimensions for WoodBox (length width height thickness):");
        double woodBoxLength = scanner.nextDouble();
        double woodBoxWidth = scanner.nextDouble();
        double woodBoxHeight = scanner.nextDouble();
        double woodBoxThickness = scanner.nextDouble();
        WoodBox woodBox = new WoodBox(woodBoxLength, woodBoxWidth, woodBoxHeight, woodBoxThickness);
    }
}
