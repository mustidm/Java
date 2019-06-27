package class19_2;

public class MainClass {
	
	public static void main(String[] args)
	   {
	       X x = new X();
	       
	       X x1 = new X();
	       X x2 = new X();
	       X x3 = new X();

	       System.out.println(x.i);
	       
	      x1.i = 200;
	       
	       System.out.println(x1.i);

	       x.methodOfX();
	   }

}
