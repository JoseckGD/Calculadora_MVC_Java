package calculadora.mvc;

import Modelo.calculadoraModelo;
import Vista.calculadora;
import Controlador.calculadoraControlador;

public class CalculadoraMVC {

    public static void main(String[] args) {
        calculadoraModelo objModelo = new calculadoraModelo();
        calculadora objVista = new calculadora();
        calculadoraControlador objControlador  = new calculadoraControlador(objVista, objModelo);
        objVista.setVisible(true);
        objVista.setLocationRelativeTo(null);
        objVista.setTitle("MVC Calculadora");
    }
}
