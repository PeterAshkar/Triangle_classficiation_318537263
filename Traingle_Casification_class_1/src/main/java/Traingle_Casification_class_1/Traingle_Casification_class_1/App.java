package Traingle_Casification_class_1.Traingle_Casification_class_1;


/**
 * Hello world!
 *
 */

enum Triangle_Types {
    EQUILATERAL,
    ISOSCELES,
    SCALENE,
    NOT_TRIANGLE,
    ERROR
}

class TriangleClassifier {

    private static Triangle_Types triangle;

    public static void classifyTriangle(int a, int b, int c) {
        if (isEquilateral(a, b, c)) {
            triangle = Triangle_Types.EQUILATERAL;
        } else if (isIsosceles(a, b, c)) {
            triangle = Triangle_Types.ISOSCELES;
        } else if (isTriangle(a, b, c)) {
            triangle = Triangle_Types.SCALENE;
        } else {
            triangle = Triangle_Types.NOT_TRIANGLE;
        }
    }
    


    private static boolean isTriangle(int a, int b, int c) {
        return (a + b > c && a + c > b && b + c > a);
    }

    private static boolean isIsosceles(int a, int b, int c) {
        return (a + b > c && a + c > b && b + c > a) && (a == b || b == c || c == a);
    }

    private static boolean isEquilateral(int a, int b, int c) {
        return (a + b > c && a + c > b && b + c > a ) && (a == b && b == c);
    }

    public static Triangle_Types get_type() {
        return triangle;
    }
}