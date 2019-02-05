/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Test1 {
    public Test1() throws JuanpisException{
        xx();
        try{
            dividebyzero();
        }catch(IllegalArgumentException e){
            System.out.println("No ha liberado memoria en x");
        }
    }
    
    public void xx() throws JuanpisException{
        throw new JuanpisException();
    }
    
    public double dividebyzero(){
        double c = 0;
        try{
            String x = null;
            System.out.println(x.length());
            c=5/0;
            System.out.println("Punto control 1");
        }catch(ArithmeticException e){
            System.out.println("Division por cero");
        }catch(NullPointerException e){
            throw new IllegalArgumentException();
        }
        System.out.println("Punto control 2");
        return c;
    }
    
    public static void main(String[] args) {
        try{
            Test1 x = new Test1();
        }catch(JuanpisException e){
            System.out.println("Juanpis es muy basto gvn");
        }
    }
}
