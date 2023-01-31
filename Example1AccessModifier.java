//Modifier-Specifier where a Property is Accessible


package access_Modifier;

class Employee{
	private int id;
	private String name;
	
	
	 public String getName(){
	        return name;
	    }
	    public void setName(String n){
	        this.name = n;
	    }
	    public void setId(int i){
	        this.id = i;
	    }
	    public int getId(){
	        return id;
	    }
}


public class Example1AccessModifier {
	public static void main(String[] args) {
		Employee rajat = new Employee();
        
        rajat.setName("CodeWithRajat");
        System.out.println(rajat.getName());
        rajat.setId(234);
        System.out.println(rajat.getId());
    }

}
