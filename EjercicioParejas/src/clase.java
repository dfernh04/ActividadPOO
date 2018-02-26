
public class clase {
	private double piso;
	private int numero;
	private boolean proyector;
	private boolean ordenadores;
	private double temperatura;
	private boolean reservar;
//GETTERS Y SETTERS
	public double getPiso() {
		return piso;
	}
	public boolean isReservar() {
		return reservar;
	}
	public void setReservar(boolean reservar) {
		this.reservar = reservar;
	}
	public void setPiso(double piso) {
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
//CONSTRUCTOR
	public clase(double piso, int numero, boolean proyector, boolean ordenadores, double temperatura) {
		super();
		this.piso = piso;
		this.numero = numero;
		this.proyector = proyector;
		this.ordenadores = ordenadores;
		this.temperatura = temperatura;
	}
//METODOS
	
}
