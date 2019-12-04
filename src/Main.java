import java.io.BufferedReader;
import java.io.Console;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;
import java.io.IOException;


public class Main {
	
	public static void main(String[] args) {

		
		System.out.println("Helloworld");
		
		Generics g = new Generics();
		g.print();
		
		
		
//		/*
//		 * If super class constructor is private. Then base class constructor with same parameter cannot be called or used to create object.
//		 */
//		
//		BaseClassB b = new BaseClassB(3); //calling base class with super(5) //It can be called as parameterized constructor of base class is called in the first line of this constructor like super(5)
//		//BaseClassB b = new BaseClassB(); //It cannot be called as default constructor of base class is private.
//
//		System.out.println(b.b);
//		System.out.println(b.getA());
		
		
//		Logger logger = Logger.getLogger(Main.class.getName()); 
//		
//		try {
//			// FILE_SIZE = 1024, declared below main(), 5 files will be created, with size of each one set to 1024 bytes, with a specific pattern for file name and append set to true.
//			FileHandler handler = new FileHandler("sample.log", FILE_SIZE, 3, true);
//			
//			handler.setFormatter(new SimpleFormatter());
//			
//			logger.addHandler(handler);
//			
//			logger.setUseParentHandlers(false);
//			
//			logger.warning("Sample log entry.");
//			
//		}catch(IOException e) {
//			logger.warning("Failed to initialize logger handler.");
//		}
		
//		/*
//		 * Java.util.Logging, Java logger, how to use logging in java.
//		 */
//		// Pass Current class name
//		Logger logger = Logger.getLogger(Main.class.getName()); 
//		
//		try {
//			// FILE_SIZE = 1024, declared below main(), 5 files will be created, with size of each one set to 1024 bytes, with a specific pattern for file name and append set to true.
//			FileHandler handler = new FileHandler("sample.log", FILE_SIZE, 5, true);
//			
//			handler.setFormatter(new SimpleFormatter());
//			
//			logger.addHandler(handler);
//			
//			logger.setUseParentHandlers(false);
//			
//		}catch(IOException e) {
//			logger.warning("Failed to initialize logger handler.");
//		}
//		
//		//logger.info("Logging info message");
//		for(int i=0;i<9000;i++) {
//			logger.warning("Logging warning message: "+i);
//		}
		
		
		
//		/*
//		 * Using Iterator & ListIterator(it can add as well) 
//		 */
//		ArrayList<Integer> a = new ArrayList<>(List.of(1,2,3,4,5,6,7));
//		System.out.println(a);
//		Iterator it = a.iterator();
//		while(it.hasNext()) {
//			Integer i = (Integer)it.next();
//			//System.out.print(i+" ");
//			if(i%2==0) {
//				it.remove();
//			}
//		}
//		System.out.println(a);
//		//ListIterator can be used in same way but it can add as well in list and can only be used with lists, but Iterator can remove but cannot add in list.

		
//		/*
//		 * Inheritance of private variable
//		 */
//		BaseClassB baseClassB=new BaseClassB(5);
//		System.out.println(baseClassB.getA()+" "+baseClassB.b);
		
		
//		/*
//		 * Taking input from user
//		 */
//		//Using scanner
//		Scanner sc = new Scanner(System.in);
//		String guess = sc.nextLine();
//		System.out.println("Inputted Line: "+guess);
//		//Using Buffered Reader
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String guess1 = sc.nextLine();
//		System.out.println("Inputted Line: "+guess1);
//		//Using System console - it does not work on some IDE's
//		Console console = System.console();
//		String guess2 = console.readLine();
//		System.out.println("Inputted Line: "+guess2);
		
		
		
//		/*
//		 * Random number generation
//		 */
//		int i4 = (int)(Math.random()*5);  // 0 to 4
//		System.out.println("Random number: "+ i4);


//		/*
//		 * Object.equals()
//		 */
//		Abc i1 = new Abc(5); Abc i2 = new Abc(6); Abc i3 = new Abc(5);
//		
//		if(i1 == i3)
//			System.out.println("i1==i3"); //wrong
//		else
//			System.out.println("i1!=i3"); //correct
//		
//		if(i1.equals(i3))
//			System.out.println("i1==i3"); //correct
//		else
//			System.out.println("i1!=i3"); //wrong
		
				
//		/*
//		 * Array initialization
//		 */
//		int[] a = new int[] {2,4,6,8,10};
//		a = new int[]{3,5,7,9,11};
//		System.out.println(Arrays.toString(a));

		
	}
	
	// Logger file size
	public static final int FILE_SIZE = 1024;

	static class Abc{
		int a;
		
		Abc(int a){
			this.a = a;
		}
		
		@Override
		public boolean equals(Object obj) {

			return this.a == ((Abc)obj).a;
		}
	}
}

class SuperClassA{
	private int a;
	
	private SuperClassA() {
		a = 1;
	}
	
	public SuperClassA(int a) {
		//this();
		this.a = a;
	}

	public int getA() {
		return a;
	}
	
	public static void fun() {
		System.out.println("A's Static fun method");
	}
}

class BaseClassB extends SuperClassA{
	int b;

	BaseClassB(int b) {
		super(5);
		this.b = b;
	}
	public static void fun() {
		System.out.println("B's Static fun method");
	}
}