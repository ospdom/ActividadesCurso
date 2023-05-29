package actividadesenclase;

public class Usuario {

		private int id;
		private String nombre,apellido;
		
		//constructor por defecto
		public Usuario() {
			this.id = 0;
			this.nombre = "";
			this.apellido = "";
		}
		//constructor copia
		public Usuario(Usuario u) {
			this.id = u.id;
			this.nombre = u.nombre;
			this.apellido = u.apellido;
		}
		//constructor personalizado
		public Usuario(int id, String nombre, String apellido) {
			super();
			this.id = id;
			this.nombre = nombre;
			this.apellido = apellido;
		}
		public void print() {
			System.out.println("******Usuario******");
			System.out.println("id: " + this.id);
			System.out.println("Nombre: " + this.nombre);
			System.out.println("Apellidos: " + this.apellido);
			
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getApellido() {
			return apellido;
		}
		public void setApellido(String apellido) {
			this.apellido = apellido;
		}
	}


