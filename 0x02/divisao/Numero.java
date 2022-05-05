public class Numero { 
	public static void dividir(int a, int b) {
        
        try{ int divisao = a/b;
        }
        
        catch(Exception e){ 
		System.out.println("Nao eh possivel dividir por zero");
        }
        finally{
		System.out.println(a + " / " + b + " = " + a/b);
        }
       
        
    }   
}
