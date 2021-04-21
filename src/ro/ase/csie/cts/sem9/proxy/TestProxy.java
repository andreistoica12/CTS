package ro.ase.csie.cts.sem9.proxy;

public class TestProxy {

	public static void main(String[] args) {

		InterfataModulLogin login = new ModulLogin("10.0.0.1", 127);

		login = new ProxyLogin(login);

		if (login.login("admin", "admin123"))
			System.out.println("Hello, admin!");

//		String[] parole = new String[]{"1234", "123456", "admin", "root", "admin123"};
//		String[] parole = new String[]{"1234", "123456", "admin123", "admin", "root"};
		String[] parole = new String[] { "1234", "admin123", "123456", "admin", "admin123" };
		for (String parola : parole) {
			if (login.login("admin", parola))
				System.out.println("Parola gasita: " + parola);
		}

		System.out.println("Log out");

	}
}
