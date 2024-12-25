public class Cube implements ThreeDShape{
    double side;
    public Cube(){

    }
    Cube(double side){
        this.side = side;
    }

    public void getVolume(){
        System.out.println("Volume of Cube is " + side*side*side+ " Cu. Unit");
    }
    public void getCurvedSurfaceArea(){
        System.out.println("Curved Surface Area of Cube is "+ 4*side*side+" Sq. Unit");
    }

    public void getTotalsurfaceArea(){
        System.out.println("Total Surface Area of Cube is "+ 6*side*side+ " Sq. Unit");
    }
}
