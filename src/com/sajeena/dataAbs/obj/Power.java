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
public class Power extends operation {
      @Override
    public int operate(int x, int y) {
        return((int) Math.pow(x,y));
    }
}