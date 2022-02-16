import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeWork8 extends JFrame {
    public int value;

    public HomeWork8(int initialValue){
        value = initialValue;
        setTitle("window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(600,600,300,120);
        Font font = new Font("Arial", Font.BOLD, 32);
        JTextField counterValue = new JTextField(String.valueOf(value));
        JButton increaseButton = new JButton(">");
        JButton decreaseButton = new JButton("<");
        counterValue.setFont(font);
        increaseButton.setFont(font);
        decreaseButton.setFont(font);
        counterValue.setHorizontalAlignment(SwingConstants.CENTER);
        add(counterValue, BorderLayout.CENTER);
        add(increaseButton, BorderLayout.EAST);
        add(decreaseButton, BorderLayout.WEST);
        increaseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int value = Integer.parseInt(counterValue.getText());
                value++;
                counterValue.setText(String.valueOf(value));
            }
        });
        decreaseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               int value = Integer.parseInt(counterValue.getText());
                value--;
                counterValue.setText(String.valueOf(value));
            }
        });
        setVisible(true);
    }

    public static void main(String[] args) {
        new HomeWork8(0);
    }
}
