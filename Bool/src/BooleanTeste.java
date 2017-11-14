
import static junit.framework.Assert.assertTrue;
import org.junit.Test;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alunos
 */
public class BooleanTeste {

    
    
    
    boolean a = false;
    boolean b = true;
    boolean t = false;
    
    
 @Test   
  public void  TesteBoolean(){
    
    SomaBin sb = new SomaBin(a,b,t);
        
        boolean res = sb.rum();
    
    assertTrue("teste true",res);
     
  }
    
    
    
    
}
