
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author u
 */
public class projeDart {
    
    public static void main(String[] args) {

        Scanner scn=new Scanner(System.in);
         System.out.println("DART GAME!");
        System.out.print("Enter the number of darts to be thrown: ");
        int number_of_dart=scn.nextInt(); // getting the number of darts will be thrown from the user
        double x;
        double y;
        int a=0,b=0,c=0,d=0,e=0,f=0,g=0,u=0; // TO COUNT DARTS IN THE REGIONS
        for(int i=0;i<number_of_dart;i++){
            x=(double) (Math.random()*10.0) + (-5.0); //ASSIGNING X VALUES
            y=(double) (Math.random()*10.0) + (-5.0); //ASSIGNING Y VALUES
            x=(int)(x*10); //TO GET ONE DIGIT AFTER "."
            x/=10; //TO GET ONE DIGIT AFTER "." 
            y=(int)(y*10); 
            y/=10;
            double radius=(double) Math.sqrt((x-(-3.0))*(x-(-3.0)) + (y-3.0)*(y-3.0)); 
            //TO UNDERSTAND THE POINT IS INSIDE OF THE CIRCLE(G) OR NOT
            System.out.println("\nDart "+ (i+1));
            System.out.println("Coordinates: ("+x+" , "+y+")");
            
            if(x>0 && y>0 && x+y<5){ 
                System.out.println("Region: A");
                a++;
            }
            else if(x>0 && y>0 && x+y>5){
                System.out.println("Region: B");
                b++;
            }
            else if (x>0 && y>0 && x+y==5) {
                System.out.println("Region:Undecided");
                u++; 
            }
            else if(x<0 && y<0 && x<y){
                System.out.println("Region: D");
                d++;    
            }
            else if(x<0 && y<0 && x>y){
                System.out.println("Region: E");
                e++;
            }
            else if(x<0 && y<0 && x==y){
                System.out.println("Region: Undecided");
                u++;
            }
            else if(x>0 && y<0){
                System.out.println("Region: F");
                f++;
            }
            else if(x<0 && y>0 && radius<1){
                System.out.println("Region: C");
                c++;
            }
            else if(x<0 && y>0 && radius>1){
                System.out.println("Region: G");
                g++;
            }
            else if(x<0 && y>0 && radius==1){
                System.out.println("Region: Undecided");
                u++;
            }
        }
        //THESE SOUTS ARE PRINTING THE STATISTICS
        //PERCENTAGE TO KEEP PERCENTAGE OF EACH REGIONS 
        double percentage=(100.0*a)/number_of_dart;
        percentage=(int)(percentage*10);
        percentage/=10;
        System.out.println("\nRegion statistics:\n");
        System.out.println("A: "+a+" darts ("+percentage+"%)");
        percentage=(100.0*b)/number_of_dart;
        percentage=(int)(percentage*10);
        percentage/=10;
        System.out.println("B: "+b+" darts ("+percentage+"%)");
        percentage=(100.0*c)/number_of_dart;
        percentage=(int)(percentage*10);
        percentage/=10;
        System.out.println("C: "+c+" darts ("+percentage+"%)");
        percentage=(100.0*d)/number_of_dart;
        percentage=(int)(percentage*10);
        percentage/=10;
        System.out.println("D: "+d+" darts ("+percentage+"%)");
        percentage=(100.0*e)/number_of_dart;
        percentage=(int)(percentage*10);
        percentage/=10;
        System.out.println("E: "+e+" darts ("+percentage+"%)");
        percentage=(100.0*f)/number_of_dart;
        percentage=(int)(percentage*10);
        percentage/=10;
        System.out.println("F: "+f+" darts ("+percentage+"%)");
        percentage=(100.0*g)/number_of_dart;
        percentage=(int)(percentage*10);
        percentage/=10;
        System.out.println("G: "+g+" darts ("+percentage+"%)");
        percentage=(100.0*u)/number_of_dart;
        percentage=(int)(percentage*10);
        percentage/=10;
        System.out.println("Undecided: "+u+" darts ("+percentage+"%)");
    }
}


