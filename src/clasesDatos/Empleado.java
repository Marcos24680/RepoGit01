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

	/**
	 * GETers and SETers
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * @return the categoria
	 */
	public String getCategoria() {
		return categoria;
	}

	/**
	 * @param categoria the categoria to set
	 */
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * @return the clubSocial
	 */
	public boolean isClubSocial() {
		return clubSocial;
	}

	/**
	 * @param clubSocial the clubSocial to set
	 */
	public void setClubSocial(boolean clubSocial) {
		this.clubSocial = clubSocial;
	}

	/**
	 * @return the sueldo
	 */
	public float getSueldo() {
		return sueldo;
	}

	/**
	 * @param sueldo the sueldo to set
	 */
	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}
	
	
	
	
	
	
	
	
	
	
	
}