package clasesDatos;

public class Empleado {
	private String dni;
	private String nombre;
	private String apellido;
	private String categoria;
	private int edad;
	private boolean clubSocial; //Indica si el empleado está en el club social de la empresa
	private float sueldo;
	/**
	 * @param dni
	 * @param nombre
	 * @param apellido
	 * @param categoria
	 * @param edad
	 * @param clubSocial
	 * @param sueldo
	 */
	public Empleado(String dni, String nombre, String apellido, String categoria, int edad, boolean clubSocial,
			float sueldo) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.categoria = categoria;
		this.edad = edad;
		this.clubSocial = clubSocial;
		this.sueldo = sueldo;
	}

	// Constructor vacio
	public Empleado() {
		super();
		this.dni = "";
		this.nombre = "***********";
		this.apellido = "*******";
		this.categoria = "Base";
		this.edad = 0;
		this.clubSocial = false;
		this.sueldo = (float) 0.0;
	}

	// Constructor  
	/**
	 * @param dni
	 * @param nombre
	 * @param apellido
	 */
	public Empleado(String dni, String nombre, String apellido) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.categoria = "Base";
		this.edad = 0;
		this.clubSocial = false;
		this.sueldo = (float) 0.0;
	}
	
	
}