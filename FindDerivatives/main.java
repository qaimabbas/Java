//Find derivative second order
// equation = X0=pi/2, fx=(cosX).
public class Main {

    public static void main(String[] args) {
	// write your code here
       double  x0=Math.PI/2;
       double dx=0.01;
       double f1;
       double f2;
       double m;

        double dr;
           f1=Math.cos(x0+dx);
           f2=Math.cos(x0-dx);
           m= Math.cos(x0)*2;
        dr=((f1)-(m)+(f2))/(dx*dx);

                System.out.println(dr);


    }
}
