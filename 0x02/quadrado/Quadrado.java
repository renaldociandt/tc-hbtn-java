public final class Quadrado{ 
	public static double area(double lado) {
        
        	if(lado < 0)
 
			throw new java.lang.IllegalArgumentException("Lado deve possuir valor positivo");
            
            
		return lado*lado;
        }

       
}
