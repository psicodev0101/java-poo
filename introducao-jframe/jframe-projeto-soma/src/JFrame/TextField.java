package JFrame;

import javax.swing.*;

public class TextField extends JTextField {

    public TextField (int positionVert){
    /* configuracoes do espaco de texto padrao, permitindo alterar a posicao
    * do espaco no eixo vertical */
        setBounds(150, positionVert, 150, 30);
    }


}
