package JFrame;

import javax.swing.*;

public class Screen extends JFrame {
    public Screen (String title, int largura, int altura) {
        setTitle(title);
        setVisible(true);
        setSize(largura,altura);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);


        add(new ClickButton("teste"));
    }
}
