/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc_Logic;

import javax.ejb.Stateless;

/**
 *
 * @author juand
 */
@Stateless
public class calculator implements calculatorLocal {
    int result = 0;

    public int getResult() {
        return result;
    }
    
    @Override
    public Integer add(int a, int b) {
        result = a+b;
        return result;
    }

    @Override
    public Integer substract(int a, int b) {
        result = a-b;
        return result;
    }
    
    

    @Override
    public Integer divide(int a, int b) {
        result = a/b;
        return result;
    }

    @Override
    public Integer module(int a, int b) {
        result = a%b;
        return result;
    }

    @Override
    public Integer multiply(int a, int b) {
        result = a*b;
        return result;
    }

    @Override
    public Integer power(int a, int b) {
        result = (int)Math.pow(a, b);
        return result;
    }
}
