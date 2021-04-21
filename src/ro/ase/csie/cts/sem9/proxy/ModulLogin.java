package ro.ase.csie.cts.sem9.proxy;

public class ModulLogin implements InterfataModulLogin {

	String ipServer;
	int port;

	public ModulLogin(String ipServer, int port) {
		super();
		this.ipServer = ipServer;
		this.port = port;
	}

	@Override
	public boolean login(String username, String password) {
		if (username.equals("admin") && password.equals("admin123"))
			return true;
		else
			return false;
	}

	@Override
	public boolean verificaStatusServer() {
		return true;
	}

}
