public class converter {
    private int baseFrom;
    private int baseTo;  
    private String number;
    private String result;
    private static final int MAX_BASE = 36;
    private static final int MIN_BASE = 2;
    
    public converter() {
        this.baseFrom = 0;
        this.baseTo = 0;
        this.number = "";
        this.result = "";
    }

    public void start() {

    }

    public void setBaseFrom(int baseFrom) {
        this.baseFrom = baseFrom;
    }

    public void setBaseTo(int baseTo) {
        this.baseTo = baseTo;
    }
}
