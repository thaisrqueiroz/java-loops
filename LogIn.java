import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        //Escribe un programa que pida al usuario ingresar un nombre de usuario y una constraseña, escribe un bucle que siga ejecutándose y devuelva 'Datos incorrectos por favor vuelve a intentar' mientras el nombre de usuario o la contraseña sean incorrectos.
        //Cuando el usuario y la constraseña sean correctos imprime en terminal: ¡Acceso concedido!

        String correctUsername = "Pepita";
        String correctPassword = "pepi123";
        String username;
        String password;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Usuario: ");
            username = scanner.nextLine();
            System.out.println("Contraseña: ");
            password = scanner.nextLine();

            if (!username.equals(correctUsername) || !password.equals(correctPassword)) {
                System.out.println("Datos incorrectos por favor vuelve a intentar.");
            }
        } while (!username.equals(correctUsername) || !password.equals(correctPassword));
        System.out.println("¡Acceso concedido!");
        scanner.close();
    }
}
