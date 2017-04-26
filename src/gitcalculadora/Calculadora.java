/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gitcalculadora;

/**
 *
 * @author 239651
 */
public class Calculadora {
    public int soma(int a, int b){
        return a + b;
    }
    
    public int subtrair(int a, int b){
        return a - b;
    }
    
    public int multiplicar(int a, int b){
        return a * b;
    }
    
    public double divisao(int a, int b){
        if(a == 0) return 0;
        return a / b;
    }
}
