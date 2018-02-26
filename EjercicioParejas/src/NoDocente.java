
public class NoDocente extends Personal {
	
	private String area;
	
	/**
	 * @param nombre
	 * @param apellidos
	 * @param dni
	 * @param id
	 * @param salario
	 */
	public NoDocente(String nombre, String apellidos, String dni, int id, int edad, double salario
			, String area) {
		super(nombre, apellidos, dni, id, edad, salario);
		this.area = area;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	

	
	
	
	
	

}
