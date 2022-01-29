package assistedProject2;


public class Polymorphism {
	class Sum 
	{
	    public int sum(int x, int y) 
	    { 
	        return (x + y); 
	    } 
	    public int sum(int x, int y, int z) 
	    { 
	        return (x + y + z); 
	    } 
	    public double sum(double x, double y) 
	    { 
	        return (x + y); 
	    } }
	    public static void main(String args[]) 
	    { 
	    	Polymorphism p=new Polymorphism();
	        Sum s = p. new Sum(); 
	        System.out.println(s.sum(10, 20)); 
	        System.out.println(s.sum(10, 20, 30)); 
	        System.out.println(s.sum(10.5, 20.5)); 
	    } 
	}


