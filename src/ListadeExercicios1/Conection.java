package ListadeExercicios1;

public class Conection {

	private String nome;
	private String url;
	private String user;
	private String pass;

	private static Conection instance;

	private Conection() {
		this.nome = "";
		this.url = "";
		this.user = "";
		this.pass = "";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public static Conection getInstance() {
		if (Conection.instance == null) {
			Conection.instance = new Conection();
		}
		return Conection.instance;
	}

	public static void setInstance(Conection instance) {
		Conection.instance = instance;
	}

}