package random_exercise_1;

public class Auto {
	private String marca;
	private int cilindrata;
	private String targa;
	private int porte;
	private boolean cambio;
	
	Auto(String marca, int cilindrata, String targa, int porte, boolean cambio){
		
		this.marca = marca;
		this.cilindrata = cilindrata;
		this.targa = targa;
		this.porte = porte;
		this.cambio = cambio;
	}
	
	// MARCA
	public void set_marca(String marca) {
		this.marca = marca;
	}
	
	public String get_marca() {
		return this.marca;
	}
	
	// CILINDRATA
	public void set_cilindrata(int cilindrata) {
		this.cilindrata = cilindrata;
	}
	public int get_cilindrata() {
		return this.cilindrata;
	};
	
	
	// TARGA
	public void set_targa(String targa) {
		this.targa = targa;
	}
	
	public String get_targa() {
		return this.targa;
	}
	
	// PORTE
	public void set_porte(int porte) {
		this.porte = porte;
	}
	
	public int get_porte() {
		return this.porte;
	}
	
	
	// CAMBIO
	public void set_cambio(boolean cambio) {
		this.cambio = cambio;
	}
	
	public void get_cambio() {
		
		if(this.cambio == true) {
			System.out.println("Manuale");
		}else {
			System.out.println("Automatico");
		}
			
	}
	
}
