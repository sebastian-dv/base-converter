import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class window {

    private JFrame frame;
    private converter converter;

    private static  JLabel from = new JLabel("From Base: ");
    private static  JLabel to = new JLabel("To Base: ");
    private static  JLabel number = new JLabel("Number: ");
    private static  JLabel result = new JLabel("Result: ");

    private JTextField inputFrom = new JTextField();
    private JTextField inputTo = new JTextField();
    private JTextField inputNumber = new JTextField();

    private static JButton button = new JButton("Convert");
    
    
    public window() {
        frame = new JFrame("Base Converter");
    }

    public void create(converter converter) {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(425, 250);
        frame.setResizable(false);
        frame.setVisible(true);
        this.converter = converter;
        frame.setLayout(null);
    }

    public void start() {
        from.setBounds(20, 10, 100, 30);
        number.setBounds(20, 45, 100, 30);
        to.setBounds(20, 80, 100, 30);
        result.setBounds(20, 150, 400, 30);
        frame.add(from);
        frame.add(to);
        frame.add(number);
        frame.add(result);

        inputFrom.setBounds(100, 10, 300, 30);
        inputTo.setBounds(100, 80, 300, 30);
        inputNumber.setBounds(100, 45, 300, 30);
        frame.add(inputFrom);
        frame.add(inputTo);
        frame.add(inputNumber);

        button.setBounds(20, 115, 100, 30);
        frame.add(button);
        frame.validate();

        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                converter.setBaseFrom(Integer.parseInt(inputFrom.getText()));
                converter.setBaseTo(Integer.parseInt(inputTo.getText()));
                converter.setNumber(inputNumber.getText());
                converter.setResult(converter.convert());
                printResult();
            }
        });
    }

    public void printResult () {
        result.setText("Result: " + converter.getResult());
        frame.validate();
    }
}
