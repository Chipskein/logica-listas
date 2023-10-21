import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex10 extends JPanel {
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        for (int v = 0; v <= 400; v = v + 20) {
            //parte esquerda
            g.drawLine(200 - v/2, v, v, 400);
            //parte direita
            g.drawLine(200 + v/2, v, 400-v, 400);
            //parte de cima
            g.drawLine(200-v/2,v,400-v/2,400-v);
            g.drawLine(200+v/2,v,v/2,400-v);
        }
    }


    public static void main(String[] args) {
        
        JFrame janela = new JFrame("Figuras retas");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(410, 440);

        Ex10 painel = new Ex10();
        painel.setBounds(0, 0, 400, 400);
        
        janela.add(painel);
        janela.setVisible(true);
        
    }

}
