
public class Launcher {
	
	public static void main(String[] args) {
		
		Edificio edificio = new Edificio("Pepirlo", "TIC");
		edificio.listarClases();
		edificio.reservarClase(edificio.getClases().get(20));
		edificio.listarClasesReservadas();
		edificio.reservarClase(20);
		edificio.listarClasesReservadas();
		edificio.quitarReservaClase(21);
		edificio.listarClasesReservadas();
	}

}
