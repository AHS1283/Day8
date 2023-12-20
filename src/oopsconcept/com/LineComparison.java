package oopsconcept.com;

import java.util.Scanner;

public class LineComparison {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            System.out.println("Enter coordinates for Line 1:");
            System.out.print("x1: ");
            double x1 = scanner.nextDouble();
            System.out.print("y1: ");
            double y1 = scanner.nextDouble();
            System.out.print("x2: ");
            double x2 = scanner.nextDouble();
            System.out.print("y2: ");
            double y2 = scanner.nextDouble();


            Line line1 = new Line(x1, y1, x2, y2);

            System.out.println("\nEnter coordinates for Line 2:");
            System.out.print("x1: ");
            double x3 = scanner.nextDouble();
            System.out.print("y1: ");
            double y3 = scanner.nextDouble();
            System.out.print("x2: ");
            double x4 = scanner.nextDouble();
            System.out.print("y2: ");
            double y4 = scanner.nextDouble();


            Line line2 = new Line(x3, y3, x4, y4);


            double length1 = line1.calculateLength();
            double length2 = line2.calculateLength();

            System.out.println("\nLength of Line 1: " + length1);
            System.out.println("Length of Line 2: " + length2);


            if (length1 == length2) {
                System.out.println("Both lines are of equal length.");
            } else if (length1 > length2) {
                System.out.println("Line 1 is longer than Line 2.");
            } else {
                System.out.println("Line 2 is longer than Line 1.");
            }

            scanner.close();
        }
    }
