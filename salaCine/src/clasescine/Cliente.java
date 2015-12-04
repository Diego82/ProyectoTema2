package clasescine;

public class Cliente {

	private String usuario;
	private String password;
	private String email;
	/**
	 * @param usuario
	 * @param password
	 * @param email
	 */
	public Cliente(String usuario, String password, String email) {
		super();
		this.usuario = usuario;
		this.password = password;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Cliente [usuario=" + usuario + ", password=" + password + ", email=" + email + "]";
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
