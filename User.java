import java.util.*;
public class User {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String playAgain;
        do {
            Game g = new Game();
            int choice=g.selectShape();
            if(choice==1){
                System.out.println("You have Selected 2D Shape");
                TwoDShape td = g.selectTwoDShape();
                td.getArea();
                td.getPerimeter();
            }
            else{
                System.out.println("You have Selected 3D");
                ThreeDShape td = g.selectThreeDShape();
                td.getCurvedSurfaceArea();
                td.getTotalsurfaceArea();
                td.getVolume();
            }
            System.out.println("Do you want to playagain press Y/y? Press any other key for exit");
            playAgain = sc.nextLine();
        } while (playAgain.equalsIgnoreCase("Y"));
     
        System.out.println("Thanks for Playing!");
        sc.close();
    }
}
