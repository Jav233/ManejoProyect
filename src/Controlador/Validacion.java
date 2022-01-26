package Controlador;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author usuario
 */
public abstract class Validacion {

    public void validateOnlyNumbers(java.awt.event.KeyEvent evt, JTextField txt, JLabel jlb) {
        char character = evt.getKeyChar();
        if (Character.isLetter(character)) {
            txt.setEditable(false);
            jlb.setText("Solo numeros!");
        } else {
            txt.setEditable(true);
        }
    }
    
    public void emptyFields(JPanel pnl){
        JTextField box;
        for (int i = 0; i < pnl.getComponentCount(); i++) {
            if (pnl.getComponent(i).getClass().getName().equals("javax.swing.JTextField")) {
                box = (JTextField) pnl.getComponent(i);
                box.setText("");
            }
        }
    }

    public abstract void emptyFields(java.awt.event.ActionEvent evt, JPanel pnl, JLabel jlbOnlyNumbersCedula, JLabel jlbOnlyNumbersCellphone, JLabel jlbValidateEmail);

    public abstract void emptyFields(java.awt.event.ActionEvent evt, JPanel pnl, JLabel jlbOnlyNumbersCellphone);


}
