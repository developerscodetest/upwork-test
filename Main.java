import java.util.Scanner;
import java.util.Stack;

public class Main {
	
	CustomLinkedList list = new CustomLinkedList();
	
	Stack s = new Stack<CustomLinkedList>();
	static boolean test = true;
	public static void main(String args[]){
	
		Main obj = new Main();
			while(test){
				System.out.println("\n");	
				System.out.println("-----------------------");
				System.out.println("Custom LinkedList Menu");
				System.out.println("-----------------------");
				System.out.println("Press 0 to Display data");
				System.out.println("Press 1 to Add value");
				System.out.println("Press 2 to Remove the Tail value");
				System.out.println("Press 3 to Clear data");
				System.out.println("Press 4 to Exit");
				obj.show();
			}
	}
public void show(){

		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		
		switch(num){
			case 0: 
				System.out.println("list: "+s);
				break;
			case 1: 
				System.out.println("enter a int value:");	
				int val = in.nextInt();
				s.add(val);
				System.out.println(val+" added to list.");	
				System.out.println(s);
				break;
			case 2:
				s.pop();
				System.out.println("tail value removed.");
				System.out.println(s);
				break;
			case 3:
				s.clear();
				System.out.println("list cleared successfully.");
				System.out.println(s);
				break;
			case 4:
				test = false;
				break;
			default:
				// System.out.println(s);
				test = false;
				break;
				
		}
		
	}

	}



class CustomLinkedList {
	int value;
}


// public class Main {  
// 	int id;//field or data member or instance variable  
// 	String name;  
	 
// 	public static void main(String args[]){  
// 		Main s1=new Main();//creating an object of Student  
// 	 System.out.println(s1.id);//accessing member through reference variable  
// 	 System.out.println(s1.name);  
// 	}  
// }  