public class converter {
    private int baseFrom;
    private int baseTo;  
    private String number;
    private String result;
    
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
