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
public class operationfactory {
     public static operation get(int key){
    if(key==1){
    return new Add();
    }else if(key==2){
    return new Sub();
    }else if(key==3){
    return new Mul();
    }else if(key==4){
    return new Div();
    }else if(key==5){
    return new Max();
    }else if(key==6){
    return new Min();
    }else if(key==7){
    return new Power();
    }else if(key==8){
    return new multab();
    }
    else
        return null;
        
        
    }
    
}
