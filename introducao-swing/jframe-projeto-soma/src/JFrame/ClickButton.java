package JFrame;

import javax.swing.*;
import java.awt.*;

public class ClickButton extends JButton{

    public ClickButton (String text){
        setText(text);
        setBounds(65, 150, 250, 50);
        setFont(new Font("Arial", Font.BOLD,20));
        setForeground(new Color(0));
        setBackground(new Color(0x006DFF));
    }

}
