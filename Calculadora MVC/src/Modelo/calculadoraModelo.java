package Modelo;

import javax.swing.JOptionPane;

public class calculadoraModelo {
    private int num1;
    private int num2;
    private int res;
    
// G E T ===============  S E T
    
    public int getNum1() {
        return num1;
    }
    public void setNum1(int num1) {
        this.num1 = num1;
    }
    public int getNum2() {
        return num2;
    }
    public void setNum2(int num2) {
        this.num2 = num2;
    }
    public int getRes() {
        return res;
    }
    public void setRes(int res) {
        this.res = res;
    }
    
//  ===============  
    
    public int Sumar(){
        res = this.num1 + this.num2;
        return res;
    }  
    public int Restar(){
        res = this.num1 - this.num2;
        return res;
    } 
    public int Dividir(){
        if(num2==0){
            JOptionPane.showMessageDialog(null, "Error, Nos e puede divir entre 0");
        }else{
            res = this.num1 / this.num2;
        }
        return res;
    }  
    public int Multiplicar(){
        res = this.num1 * this.num2;
        return res;
    }
}
