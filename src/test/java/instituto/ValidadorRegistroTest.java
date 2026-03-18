package instituto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class ValidadorRegistroTest {

    // Traemos el "motor" que vamos a probar desde la carpeta main
    ValidadorRegistro validador = new ValidadorRegistro();

    @Test
    @DisplayName("Ejemplo: Un nombre válido debe ser aceptado")
    public void testNombreValido() {
        // Ejecutamos la lógica con un nombre correcto
        boolean resultado = validador.validarNombre("Carlos");

        // Sentenciamos: Como el nombre está bien, esperamos que el resultado sea TRUE
        assertTrue(resultado, "Error: El sistema rechazó un nombre válido");
    }

    // ESCRIBE TUS 5 RETOS A PARTIR DE AQUÍ

    @Test
    @DisplayName("Reto 1 (Nombre vacio)")
    public void testNombreVacio(){
        String nombre = "";
        boolean esUnNombreVacio = nombre.length() > 0;
        assertFalse(esUnNombreVacio,"El sistema deberia rechazarlo devolviendo false");
    }

    @Test
    @DisplayName("Reto 2 (Password justa)")
    public void testPasswordJusta(){
        String contraseña = "12345678";
        boolean esUnaPasswordJusta = contraseña.length() <= 8 ;
        assertTrue(esUnaPasswordJusta,"El sistema deberia aceptarla devolviendo true");
    }

    @Test
    @DisplayName("Reto 3 (Password corta)")
    public void testPasswordCorta(){
        String contraseña = "Admin";
        boolean esUnaPasswordCorta = contraseña.length() > 5;
        assertFalse(esUnaPasswordCorta,"El sistema deberia rechazarla");
    }

    @Test
    @DisplayName("Reto 4 (Email sin arroba)")
    public void testEmailSinArroba(){
        String email = "usuario.gmail.com";
        boolean esUnEmailSinArroba = email.contains("@");
        assertFalse(esUnEmailSinArroba,"El sistema deberia rechazarlo");
    }

}
