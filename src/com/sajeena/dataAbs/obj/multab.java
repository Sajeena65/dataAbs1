/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sajeena.dataAbs.obj;

/**
 *
 * @author Admin
 */
public class multab extends operation {
    @Override
    public void operate(int x, int y) {
        int i;
        for ( i = 1 ; i<= y ; i++ )
         System.out.println(x+"*"+i+" = "+(x*i));
        
    }
    
}
