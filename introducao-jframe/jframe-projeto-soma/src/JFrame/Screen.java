package JFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Screen extends JFrame {
//atributos ---------------------------------------------------------------------
    Label labelA;
    Label labelB;
    Label labelC;
    TextField textFieldA;
    TextField textFieldB;
    TextField textFieldC;
    ClickButton clickButtonSOMA;

//construtores ---------------------------------------------------------------------
    public Screen (String title, int largura, int altura) {
        /* configuracoes da tela */
        setTitle(title);
        setVisible(true);
        setSize(largura,altura);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        /*-----------------------*/


        //campos de texto insercao
        labelA = new Label("Numero A:", 10);
        add(labelA);
        labelB = new Label("Numero B:", 40);
        add(labelB);
        labelC = new Label("Resultado: ", 70);
        labelC.setAlignmentX(40);
        add(labelC);

        textFieldA = new TextField( 10);
        add(textFieldA);
        textFieldB = new TextField( 40);
        add(textFieldB);

        //campo de texto mostrar resultado
        textFieldC = new TextField( 70);
        add(textFieldC);

        //botao de acao
        clickButtonSOMA = new ClickButton("SOMAR");
        add(clickButtonSOMA);
        clickButtonSOMA.addActionListener(this::action);
    }

//métodos ---------------------------------------------------------------------

    public String processarResultado () {
    /* converte o texto inserido nos campos A e B para inteiros, soma e
    * retorna o resultado como String */
        int numA = Integer.parseInt(textFieldA.getText());
        int numB = Integer.parseInt(textFieldB.getText());
        return String.format("%d", numA + numB);
    }

    private void action(ActionEvent actionEvent) {
    /* configura o botao para acionar o processamento de resultado
    * caso seja clicado, e lança o retorno para o espaço de texto C */
        textFieldC.setText(processarResultado());
    }

}
