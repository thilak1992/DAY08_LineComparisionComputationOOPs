/* compare two lines based on the end points, So that I know
   one line is equal, greater or less than the other line.
        - Using Java compareTo method to compare 2 Lengths is preferable.
 */


package com.Bridgelabz.Day08LineComparisonComputationOOPs;

import java.util.Scanner;

class Point3 {
    public double x;// co-ordinate x
    public double y;// co-ordinate y

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}

public class LineComparisionComputationOOPsUC3 {
    static void equalityCheck() {
        double lineLength1 = lineLength();
        double lineLength2 = lineLength();
        if (lineLength1 == lineLength2) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }

    static void compareTo() {
        double lineLength1 = lineLength();
        double lineLength2 = lineLength();
        if (lineLength1 == lineLength2) {
            System.out.println("Length of Line 1 is equal to Length of Line 2");
        } else if (lineLength1 > lineLength2) {
            System.out.println("Length of Line 1 is greater than Length of Line 2");
        } else {
            System.out.println("Length of Line 2 is greater than Length of Line 1");
        }
    }

    public static double lineLength() {
        Point3 point = new Point3();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of x1: ");
        point.setX((scanner.nextInt()));
        double x1 = point.getX();
        System.out.println("Enter the value of x2: ");
        point.setX((scanner.nextInt()));
        double x2 = point.getX();
        System.out.println("Enter the value of y1: ");
        point.setY((scanner.nextInt()));
        double y1 = point.getY();
        System.out.println("Enter the value of y2: ");
        point.setY((scanner.nextInt()));
        double y2 = point.getY();
        double x = Math.pow((x1 - x2), 2);
        double y = Math.pow((y1 - y2), 2);
        double length = Math.sqrt(x + y);
        return length;
    }

    public static void main(String[] args) {
        compareTo();
    }
}
