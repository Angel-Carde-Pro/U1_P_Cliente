package controlador;

/**
 *
 * @author angel
 */
public class logincontroller {

    private loginview loginView;
    private registercontroller registercontrol;

    public logincontroller(loginview loginView) {
        this.loginView = loginView;
    }

    public void IniciarControl() {
        loginView.setTitle("Login");
        loginView.setVisible(true);
        loginView.setLocationRelativeTo(null);

        loginView.getBtnlogin().addActionListener(l -> IniciarSesion());
        loginView.getBtnregister().addActionListener(l->registrarse());

    }

    public void IniciarSesion() {
       
        String username = loginView.getTxtuser().getText();
        String password = loginView.getTxtpassword().getText();

        // Crear el cliente del servicio web
        Wpeticiones_Service servicio = new Wpeticiones_Service();
        Wpeticiones cliente = servicio.getWpeticionesPort();

        // Llamar al método de inicio de sesión en el servicio web
        UserInfo userInfo = cliente.login(username, password);

        if (userInfo != null) {
            CuentaController cuentaController = new CuentaController(new Cuentaview(), userInfo);
            // Iniciar el controlador de la vista de cuenta y pasar el objeto UserInfo
            cuentaController.IniciarControl(userInfo);
            // Cerrar la vista de inicio de sesión
            loginView.dispose();
        } else {
            // Error en el inicio de sesión
            loginView.getJblingreso().setText("Credenciales incorrectas");
        }
    }
    public void registrarse() {
        // Crea una instancia del servicio web//nueva peticion
        Wpeticiones_Service servicio = new Wpeticiones_Service();
        Wpeticiones wpeticiones = servicio.getWpeticionesPort();
        Registerview registerView = new Registerview();
        registercontrol = new registercontroller(registerView, wpeticiones);
        loginView.dispose();
        registerView.setVisible(true);
    }
    
}
