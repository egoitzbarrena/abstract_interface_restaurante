package restaurante;

public abstract class Restaurante implements Cocina,Comedor{

	public void cocinar(){
		System.out.println("Los cocineros cocinan");
	}
	
	public void comer(){
		System.out.println("Los cocineros comen antes de empezar el servicio");
		
	}
	
	public Restaurante (){
	}
}
