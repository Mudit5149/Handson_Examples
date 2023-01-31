package java_class_examples;

class employee{
	int id;
	String name;
	int salary;
	public void printDetails() {
		System.out.println("My id is " +id);
		System.out.println("My name is" +name);
	}
	public int getSalary() {
		return salary;
	}
	public void getDetails(){
		
		}
}

public class Class {

	public static void main(String[] args) {
    System.out.println("This is our Custom class");
    employee rahul = new employee();
    employee jayprakash=new employee();
    //setting up the attributes :
    
    rahul.id=1;
    rahul.salary=20000;
    rahul.name= "Rahulsharma";
    
    
    //seeting Attributes of jaypraksh
    jayprakash.id=2;
    jayprakash.name="Jayprakash sharma";
    jayprakash.salary=10000;
    
    rahul.printDetails();
    jayprakash.printDetails();
    int salary = rahul.getSalary();
    
    System.out.print(salary);
    
    
    
	}
	

}
