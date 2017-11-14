/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author Alunos
 */
public class Boolean {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        
        Scanner entradaA = new Scanner(System.in);
        boolean a;
        
        System.out.println("Digite um numero para A: ");
        a = entradaA.nextBoolean();
        
        
        
        Scanner entradaB = new Scanner(System.in);
        boolean b;
        
        System.out.println("Digite um numero para B: ");
        b = entradaB.nextBoolean();
        

                
                
                
        Scanner entradaT = new Scanner(System.in);
        boolean t;
        
        System.out.println("Digite um numero para T: ");
        t = entradaT.nextBoolean();
        

        SomaBin sb = new SomaBin(a,b,t);
        
        boolean res = sb.rum();
        
        if(res == false){
        System.out.println("false");
        }
        else {
            System.out.println("true");
        }
        }
    }
        
    
    

