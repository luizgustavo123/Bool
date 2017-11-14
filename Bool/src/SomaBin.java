/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Alunos
 */
public class SomaBin {
    
        private boolean a;
        private boolean b;
        private boolean t;
        
        
        public SomaBin(boolean a, boolean b, boolean t){
            this.a=a;
            this.b=b;
            this.t=t;
        }
        
        

    public boolean rum(){
        
        return (a&b) | t&(a^b);
        
        
    }
            
            
            
        
        
        
    
    
}
