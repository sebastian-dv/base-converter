import javax.swing.JFrame;
import javax.swing.JLabel;

public class UI {

    private JLabel from;
    private JLabel to;
    private JLabel number;
    private JLabel result;
    converter converter;

    public UI() {

    }

    public void create(JFrame frame) {

    }

    public void setConverter(converter converter) {
        this.converter = converter;
    }

    public void setFrom(JLabel from) {
        this.from = from;
    }

    public void setTo(JLabel to) {
        this.to = to;
    }

    public void setNumber(JLabel number) {
        this.number = number;
    }

    public void setResult(JLabel result) {
        this.result = result;
    }

    public JLabel getFrom() {
        return from;
    }
}