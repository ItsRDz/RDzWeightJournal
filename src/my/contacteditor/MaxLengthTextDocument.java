/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.contacteditor;
import javax.swing.text.*;

/**
 *
 * @author Richard Depaz
 */
public class MaxLengthTextDocument extends PlainDocument {
    private int maxChars;
    
    public MaxLengthTextDocument(int limit) {
        this.maxChars = limit;
    }
    @Override
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
        // The length of the string that will be created is getLength() + str.length()
        if(str != null && (getLength() + str.length() <= maxChars)){
            super.insertString(offs, str, a);
        }
    }
}