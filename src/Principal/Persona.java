package Principal;

public class Persona {
	
	private String nombre;
	private String apellidos;
	private int nip;
	
	public Persona(String nombre, String apellidos, int nip) {
		
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nip = nip;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getNip() {
		return nip;
	}

	public void setNip(int nip) {
		this.nip = nip;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", nip=" + nip + "]";
	}

	public String mostrarDatos(int longitudLinea) {
		
		int tamnom, tamape, tamnip;
		String puntos="";
		String x = 	Integer.toString(nip);
		
		tamnom= nombre.length();
		tamape= apellidos.length();
		tamnip= x.length();
		
		
		
		for (int i = 0; i < longitudLinea-tamnom-tamape-tamnip; i++) {
			
			puntos+=".";
			
		}
		
		String datos=apellidos + "," + nombre + puntos + nip;
		
		return datos;
		
	}
	
	
	

}
