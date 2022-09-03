package random_exercise_1;

public class Main {

	public static void main(String[] args) {
		Auto audi_r8 = new Auto("Audi", 33, "CV929IR", 5, false );
		Auto volvo = new Auto("Volvo", 33, "CV929IR", 5, true );
		Auto porche = new Auto("Porche", 33, "CV929IR", 5, false );
		Auto ferrari = new Auto("Ferrari", 33, "CV929IR", 5, true );
		Auto bugatti = new Auto("Bugatti", 33, "CV929IR", 5, false );
		Auto bmw = new Auto("BMW", 33, "CV929IR", 5, true );

		Auto[] macchine = {
				audi_r8,
				volvo,
				porche,
				ferrari,
				bugatti,
				bmw
		};
		
		for(Auto macchina: macchine) {
			
			
			
			System.out.println("Marca: " + macchina.get_marca());
			System.out.println("Cilindrata: " + macchina.get_cilindrata());
			System.out.println("Targa: " + macchina.get_targa());
			System.out.println("N° porte: " + macchina.get_porte());
			System.out.print("Cambio: ");
			macchina.get_cambio();
			System.out.println(" ");
			
		}
		
		
	}
		
	
}
