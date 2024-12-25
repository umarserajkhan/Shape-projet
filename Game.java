import java.util.Scanner;
public class Game {
    Game(){

    }

    public int selectShape(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 for 2DShape");
        System.out.println("Press 2 for 3DShape");
        int choice = sc.nextInt();
        if(choice==1)
              return 1;
        else if(choice==2)
                 return 2;
        else{
            System.out.println("Invalid Choice");
            return selectShape();
        }
    }

    public TwoDShape selectTwoDShape(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Select 1 for Circle");
        System.out.println("Select 2 for Traingle");
        int choice = sc.nextInt();
        if(choice==1){
            System.out.println("Enter Radius of Circle");
            double Radius = sc.nextDouble();
            return new Circle(Radius);
        }else if(choice==2){
            System.out.println("Enter the Side1 of Triangle");
            double side1 = sc.nextDouble();
            System.out.println("Enter the Side2 of Triangle");
            double side2 = sc.nextDouble();
            System.out.println("Enter the Side2 of Triangle");
            double side3 = sc.nextDouble();
            return new Triangle(side1, side2,side3);
        }else{
            System.out.println("Invalid Choice! Try again");
            return selectTwoDShape();
        }
    }

    public ThreeDShape selectThreeDShape(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Select 1 for cube");
        System.out.println("Select 2 for Cylinder");
        int choice = sc.nextInt();
        if(choice==1){
            System.out.println("Enter the Side of Cube");
            double side = sc.nextDouble();
            return new Cube(side);
        }else if(choice==2){
            System.out.println("Enter the Height of Cylinder");
            double h = sc.nextDouble();
            System.out.println("Enter the Radius of Cylinder");
            double r = sc.nextDouble();
            return new Cylinder(r, h);
        }else{
            System.out.println("Invalid Choice! Try again");
            return selectThreeDShape();
        }
    }

}
