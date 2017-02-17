/**
 * Created by yamaguci on 2017/02/16.
 */
package com.example.gr;

import javax.swing.*;
import java.awt.*;


public class Gr1 {

    private static final String HELLO_STRING = "Hello from inside the Application";

    
    public static void main(String[] args) {
        Toolkit.getDefaultToolkit().beep();
        System.out.println(HELLO_STRING);
        JOptionPane.showMessageDialog(null, HELLO_STRING);

    }
}