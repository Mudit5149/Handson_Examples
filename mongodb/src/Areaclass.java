package java_class_examples;

class Tommy{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Running from the enemy");
    }
    public void fire(){
        System.out.println("Firing on the enemy");
    }
}


public class Areaclass {
	
	    public static void main(String[] args) {
	    	Tommy player1 = new Tommy();
	        player1.fire();
	        player1.run();
	        player1.hit();

	    }

	}


