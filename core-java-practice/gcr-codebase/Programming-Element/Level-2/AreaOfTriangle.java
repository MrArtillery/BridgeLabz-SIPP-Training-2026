import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double base = sc.nextDouble();
        double height = sc.nextDouble();

        double areaCm = 0.5 * base * height;
        double areaIn = areaCm / 6.4516;

        System.out.println("The Area of the triangle in sq in is "
                + areaIn + " and sq cm is " + areaCm);
    }
}
