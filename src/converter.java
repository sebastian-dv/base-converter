import java.util.HashMap;
import static java.util.Map.entry;
import java.util.Map;

public class converter {
    private int baseFrom;
    private int baseTo;  
    private String number;
    private String result;

    private static final int MAX_BASE = 36;
    private static final int MIN_BASE = 2;
    private static final Map<Character, Integer> map = Map.ofEntries(
        entry('a', 10), entry('b', 11), entry('c', 12),
        entry('d', 13), entry('e', 14), entry('f', 15), 
        entry('g', 16), entry('h', 17), entry('i', 18),
        entry('j', 19), entry('k', 20), entry('l', 21),
        entry('m', 22), entry('n', 23), entry('o', 24),
        entry('p', 25), entry('q', 26), entry('r', 27),
        entry('s', 28), entry('t', 29), entry('u', 30),
        entry('v', 31), entry('w', 32), entry('x', 33),
        entry('y', 34), entry('z', 35)
    );
    
    public converter() {
        this.baseFrom = 0;
        this.baseTo = 0;
        this.number = "";
        this.result = "";
    }

    public void start() {
        window window = new window();
        window.create(this);
        window.start();
    }

    public void setBaseFrom(int baseFrom) {
        this.baseFrom = baseFrom;
    }

    public void setBaseTo(int baseTo) {
        this.baseTo = baseTo;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public int getBaseFrom() {
        return baseFrom;
    }

    public int getBaseTo() {
        return baseTo;
    }

    public String getNumber() {
        return number;
    }

    public String getResult() {
        return result;
    }

    public String convert() {
        String num = getNumber();
        int baseFrom = getBaseFrom();
        int baseTo = getBaseTo();
        try {
            setResult(Integer.toString(Integer.parseInt(num, baseFrom), baseTo));
        } catch (Exception e) {
            return "Error: Invalid input";
        }
        return getResult();
    }
}
