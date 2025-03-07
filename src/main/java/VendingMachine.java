public class VendingMachine {
    private  String description;
    private  int minValue;
    private  int maxValue;
    private int value;
    private char code;
    private Size size;

    public VendingMachine(Size size) {
        this.size = size;

        if (this.size == Size.SMALL) {
            this.description = "Pequeno";
            this.minValue=32;
            this.maxValue=36;
            this.code = 'S';
        }

        if (this.size == Size.MEDIUM) {
            this.description = "Medio";
            this.minValue=37;
            this.maxValue=44;
            this.code = 'M';
        }

        if (this.size == Size.LARGE) {
            this.description = "Grande";
            this.minValue=45;
            this.maxValue=52;
            this.code = 'S';
        }
    }

    public String toString(){
        return this.description;
    }

    public int getMinValue(){
        return this.minValue;
    }

    public String getDescription(){
        return this.description;
    }

    public int getMaxValue(){
        return this.maxValue;
    }

    public char getCode(){
        return this.code;
    }
}


