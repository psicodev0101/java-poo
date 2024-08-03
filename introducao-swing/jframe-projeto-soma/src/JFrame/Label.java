package JFrame;

import javax.swing.*;
import java.awt.*;

public class Label extends JLabel {

    public Label (String text, int positionVert){
        setBounds(70, positionVert, 100, 30);
        setFont(new Font("Arial", Font.PLAIN, 14));
        setText(text);
    }


}
