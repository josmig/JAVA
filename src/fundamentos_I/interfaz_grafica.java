package fundamentos_I;

import javax.swing.JOptionPane;

public class interfaz_grafica {
	  public static void main(String[] args) {

	        String cadena;
	        int entero;
	        char letra;
	        double decimal;

	        cadena = JOptionPane.showInputDialog("Digite una cadena de texto");
	        entero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entero"));
	        letra = JOptionPane.showInputDialog("Digite un caracter").charAt(0);
	        decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite un decimal"));

	        JOptionPane.showMessageDialog(null,"La cadena es : " + cadena);
	        JOptionPane.showMessageDialog(null, "El numero entero es : " + entero);
	        JOptionPane.showMessageDialog(null,"El caracter es : " + letra);
	        JOptionPane.showMessageDialog(null,"El numero decimal es : " + decimal);
	    }
}
