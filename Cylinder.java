public class Cylinder implements ThreeDShape {
    double r;
    double h;
    public Cylinder(){

    }
    
    Cylinder(double r, double h){
        this.r = r;
        this.h = h;
    }

    public void getVolume(){
        System.out.println("Volume of Cyliner is "+ Math.PI*r*h+ " Cu. Unit");
    }
    
    public void getCurvedSurfaceArea(){
        System.out.println("Curved Surface Area of Cylinder is "+ 2*Math.PI*r*h+" Sq. Unit");
    }

    public void getTotalsurfaceArea(){
        System.out.println("Total Surface Area of Cylinder is " + 2*Math.PI*r*(r+h)+ " Sq. Unit");
    }
}
