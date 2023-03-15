
package ınfıxtopostf;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Infıxtopostf {

    public static void main(String args[]) {
        String infix;  
        BufferedReader keyboard = new BufferedReader (new InputStreamReader(System.in));  
        System.out.print("\ninfix halini giriniz; ");  
        
        try {
            infix = keyboard.readLine();
        System.out.println("Postfixe dönüşmüş hali: " + inftopostf(infix));
        } catch (IOException ex) {
            Logger.getLogger(Infıxtopostf.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private static String inftopostf(String infix) {

        String postfix = "";
        Stack<Character> operator = new Stack<Character>();
        char popped;

        for (int i = 0; i < infix.length(); i++) {

            char get = infix.charAt(i);

            if (!isOperator(get))
                postfix += get;

            else if (get == ')')
                while ((popped = operator.pop()) != '(')
                    postfix += popped;

            else {
                while (!operator.isEmpty() && get != '(' && oncelık(operator.peek()) >= oncelık(get))
                    postfix += operator.pop();

                operator.push(get);
            }
        }
        while (!operator.isEmpty())
            postfix += operator.pop();

        return postfix;
    }

    private static boolean isOperator(char i) {
        return oncelık(i) > 0;
    }

    private static int oncelık(char i) {

        if (i == '(' || i == ')') return 1;
        else if (i == '-' || i == '+') return 2;
        else if (i == '*' || i == '/') return 3;
        else return 0;
    }
}

