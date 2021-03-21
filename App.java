import javax.swing.*;
import java.lang.Math;
/** Esto es un comentario para probar el javadoc
* este texto aparecerá en el archivo HTML generado.
* <strong>Realizado en agosto 2021</strong>
*
* @author Urtzi Arana
* @version 1.0
*/
public class App { // nueva clase
    public static void main(String[] args) throws Exception {
        System.out.println("Mi primer programa");
        String texto =JOptionPane.showInputDialog("Escriba un número entero");
        int n = Integer.parseInt(texto); //parseamos el texto a integer
        double x = Math.pow(n,3); // elevamos n a 3
        System.out.println(x);
    }
}
