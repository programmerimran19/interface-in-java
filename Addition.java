/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package display;

/**
 *
 * @author Programmer Imran
 */
public class Addition implements MyTest 
{
    
    @Override
    public void calculate(int i, int j)
    {
        System.out.println("The Addition is: " +(i+j));
    }
    
    
}
