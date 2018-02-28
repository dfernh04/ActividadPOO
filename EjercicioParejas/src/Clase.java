
public class Clase {
	private int piso;
	private int numero;
	private boolean proyector;
	private boolean ordenadores;
	private double temperatura;
	private boolean reservar;
	
	//CONSTRUCTOR
	public Clase(int numero, int piso, boolean proyector, boolean ordenadores, double temperatura, boolean reservar) {
		super();
		this.numero = numero;
		this.piso = piso;
		this.proyector = proyector;
		this.ordenadores = ordenadores;
		this.temperatura = temperatura;
		this.reservar = reservar;
	}
	
	//FUNCIONES
	
	
	//GETTERS Y SETTERS
	public int getPiso() {
		return piso;
	}
	public boolean isReservar() {
		return reservar;
	}
	public void setReservar(boolean reservar) {
		this.reservar = reservar;
	}
	public void setPiso(int piso) {
		this.piso = piso;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public boolean isProyector() {
		return proyector;
	}
	public void setProyector(boolean proyector) {
		this.proyector = proyector;
	}
	public boolean isOrdenadores() {
		return ordenadores;
	}
	public void setOrdenadores(boolean ordenadores) {
		this.ordenadores = ordenadores;
	}
	public double getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}


}
