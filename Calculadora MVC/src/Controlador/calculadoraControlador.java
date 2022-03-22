package Controlador;

import Modelo.calculadoraModelo;
import Vista.calculadora;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculadoraControlador implements ActionListener{
    
    private calculadora vista;
    private calculadoraModelo modelo;
    
    public calculadoraControlador (calculadora vista, calculadoraModelo modelo) {
        this.vista = vista;
        this.modelo = modelo;
        
        this.vista.btnSumar.addActionListener(this);
        this.vista.btnRestar.addActionListener(this);
        this.vista.btnMultiplicar.addActionListener(this);
        this.vista.btnDividir.addActionListener(this);
        this.vista.btnBorrar.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        
        modelo.setNum1(Integer.valueOf(vista.txtNum1.getText()));
        modelo.setNum2(Integer.parseInt(vista.txtNum2.getText()));

        if (e.getSource()==vista.btnSumar){ 
            modelo.Sumar();
            System.out.println("a: "+e.getSource());
        }
        
        if (e.getSource()==vista.btnRestar){ 
            modelo.Restar();
        }
        
        if (e.getSource()==vista.btnMultiplicar){ 
            modelo.Multiplicar();
        }
        
        if (e.getSource()==vista.btnDividir){ 
            modelo.Dividir();
        }
        
        vista.txtRes.setText(String.valueOf(modelo.getRes()));
        
        if (e.getSource()==vista.btnBorrar){ 
            this.vista.txtNum1.setText("");
            this.vista.txtNum2.setText("");
            this.vista.txtRes.setText("");
        }   
    }
}
