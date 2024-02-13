import java.util.Scanner;


class Shape2D {
    double area;

    public Shape2D(double area) {
        this.area = area;
    }

    public double calculateCost() {
        return 40 * area;
    }
}


class Shape3D extends Shape2D {
    private double volume;
    public Shape3D(double area, double volume) {
        super(area);
        this.volume = volume;
    }
    @Override
    public double calculateCost() {
        return 60 * volume;
    }
}

public class PlasticCostCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter the area of 2D sheet in square feet:");
        double sheetArea = scanner.nextDouble();
        Shape2D sheet = new Shape2D(sheetArea);
        double sheetCost = sheet.calculateCost();
        System.out.println("Cost of 2D sheet: Rs " + sheetCost);

        
        System.out.println("Enter the area of the base of the 3D box in square feet:");
        double boxBaseArea = scanner.nextDouble();
        System.out.println("Enter the height of the 3D box in feet:");
        double boxHeight = scanner.nextDouble();
        double boxVolume = boxBaseArea * boxHeight;
        Shape3D box = new Shape3D(boxBaseArea, boxVolume);
        double boxCost = box.calculateCost();
        System.out.println("Cost of 3D box: Rs " + boxCost);

        scanner.close();
    }
}
