/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util.buttoms;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author diogo
 */
public class somenteNumeros extends PlainDocument {

    public enum TipoEntrada{
        NUMEROINTEIRO, NUMERODECIMAL;
    }
    
    private int qtdeCaracteres;
    private TipoEntrada tpEntrada;

    public somenteNumeros(int qtdeCaracteres, TipoEntrada tpEntrada) {
        this.qtdeCaracteres = qtdeCaracteres;
        this.tpEntrada = tpEntrada;
    }

    @Override
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
        if (str == null || getLength() == qtdeCaracteres) {
            return;
        }
        int totalCaracters = getLength() + str.length();
        
        String regex = "";
        switch (tpEntrada) {
            case NUMEROINTEIRO:
                regex = "[^0-9]";
                break;
            case NUMERODECIMAL:
                regex = "[^0-9.]";
                break;
        }
        
        str = str.replaceAll(regex, "");
        
        if (totalCaracters <= qtdeCaracteres) {
             super.insertString(offs, str, a);
        }
    }
    
}
