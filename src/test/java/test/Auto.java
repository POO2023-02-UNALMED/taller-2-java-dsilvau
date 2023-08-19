package test;

public class Auto {
	String modelo;
	int precio;
	Asiento [] asientos;
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;
	
	public int cantidadAsientos() {
		int x = 0;
		int i = 0;
		for(i= 0; i < asientos.length; i++) {
			if (asientos[i] == null) {
	
			}
			else {
				x++;
			}
		}
		return x;
	}
	
	public String verificarIntegridad() {
		int x = 0;
		int y = 0;
		if(registro == motor.registro) {
			for(int i= 0; i < asientos.length; i++) {
				if (asientos[i] != null) {
					if (asientos[i].registro != registro) {
						return "Las piezas no son originales";
					}
				}
			}
		}
		return "Auto original";
	}
}					
    
