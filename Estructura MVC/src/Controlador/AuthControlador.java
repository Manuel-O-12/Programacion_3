package Controlador;

import Vista.AuthVista;

public class AuthControlador {
	
	private AuthVista vista;

	public AuthControlador() {
		// TODO Auto-generated constructor stub
		vista = new AuthVista();
	}
	
	public void Login() {
		vista.Login();
	}
	
	public void Register() {
		vista.Register();
	}

}
