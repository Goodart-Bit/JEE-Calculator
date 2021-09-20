/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc_Logic;

import javax.ejb.Local;

/**
 *
 * @author juand
 */
@Local
public interface calculatorLocal {

    Integer add(int a, int b);

    Integer substract(int a, int b);

    Integer divide(int a, int b);

    Integer module(int a, int b);

    Integer multiply(int a, int b);

    Integer power(int a, int b);
}
