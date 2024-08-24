
package com.mycompany.trycatch;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class TryCatch {

    public static void main(String[] args) {
        
        ArrayList <Integer> numbers = new ArrayList ();
        ArrayList <Integer> divs = new ArrayList ();
        
        numbers.add(100); divs.add(5);
        numbers.add(25); divs.add(0);
        numbers.add(30); divs.add(15);
        numbers.add(40);
        
        for (int i = 0; i <= 3; i++) {
            
        
        try {
            Integer result = numbers.get(i) / divs.get(i);
            
            
            System.out.printf("%d / %d = %d\n", numbers.get(i), divs.get(i), result);
            
        } catch(ArithmeticException erro){
            System.out.println("Erro aritmético: " + erro.getMessage());
           
        } catch(IndexOutOfBoundsException erro){
            System.out.println("Erro tamanho array: " + erro.getMessage());
              
        } catch (Exception erro){
            System.out.println("Erro qualquer");
        }
        
      }
        System.out.println("Final");
    }
}
