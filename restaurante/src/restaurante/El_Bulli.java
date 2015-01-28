package restaurante;

public class El_Bulli extends Restaurante {
	
	private Integer capacidad;
	private Integer num_trabajadores;
	
	
	
	
	
		public El_Bulli() {
		
	}

		public Integer getCapacidad() {
			return capacidad;
		}

		public void setCapacidad(Integer capacidad) {
			this.capacidad = capacidad;
		}

		public Integer getNum_trabajadores() {
			return num_trabajadores;
		}

		public void setNum_trabajadores(Integer num_trabajadores) {
			this.num_trabajadores = num_trabajadores;
		}

		protected void limpiar(){
			System.out.println("despues de acabar todos los servicios hay que limpiar la cocina");
		}
		
		
		

	



}
