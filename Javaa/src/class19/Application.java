package class19;

public class Application {

	public static void main(String[] args) {

		Animals anim = new Animals();
		
		System.out.println("This is anim" );
		
		System.out.println(anim.age);
		System.out.println(anim.weight);
		System.out.println(anim.breed);
		System.out.println(anim.name);
		
		
		System.out.println(anim.canBark());
		
		
		System.out.println(Animals.isWild());
		
		
		anim.name = "Joe";
		anim.age = 40;
		System.out.println(anim.age);
		
Animals anim2 = new Animals();		

System.out.println("This is anim2" );

		System.out.println(anim2.age);
		System.out.println(anim2.weight);
		System.out.println(anim2.breed);
		System.out.println(anim2.name);
		
		


		
		Animals anim3 = new Animals();		

		System.out.println("This is anim3" );

				System.out.println(anim3.age);
				System.out.println(anim3.weight);
				System.out.println(anim3.breed);
				System.out.println(anim3.name);


				int my_array[] = { -1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
				 int[] array = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
				System.out.println("Printing the minimum value");
				
				System.out.println(Minimum.minOfValues(my_array));
				System.out.println(Minimum.maxOfValues(array));

				Minimum min = new Minimum();
				min.print();
		
	}

}
