package test;

public class Auto {
	String modelo;
	int precio;
	Asiento[] asiento;
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;
	
	public int cantidadAsientos() {
		int x = 0;
		for (int i = 0; i < asiento.length; i++) {
			if(asiento.getClass().getName() == "Asiento") {
				x++;
			}
		return x	
		}
	}
	
	public String verificarIntegridad() {
		if(registro == )
	}

}
