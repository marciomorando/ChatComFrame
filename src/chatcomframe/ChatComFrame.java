/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chatcomframe;

import javax.swing.JOptionPane;

/**
 *
 * @author marcio.morando
 */
public class ChatComFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String  ip = (String)JOptionPane.showInputDialog("Informe o IP","192.168.0.");
        int porta = Integer.parseInt(JOptionPane.showInputDialog("Informe a Porta","5555"));
        
        Conexao c = new Conexao(ip, porta);
        
        JanelaChat j = new JanelaChat(c);
        j.setLocationRelativeTo(null);
        j.setVisible(true);
        //testesteste
    }
}
