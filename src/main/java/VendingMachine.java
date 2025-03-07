public class VendingMachine {
    private  String description;
    private  int minValue;
    private  int maxValue;
    private int value;
    private char code;

    public VendingMachine(int value) {
        if (value < 32 ||  value > 52) {
            System.out.println("Valor invalido");
        }else {
            this.value = value;
        }

        if (value <= 36) {
            this.description = "Pequeno";
            this.minValue=32;
            this.maxValue=36;
            this.code = 'S';
        }

        if (value >=37 && value <= 44) {
            this.description = "Medio";
            this.minValue=37;
            this.maxValue=44;
            this.code = 'M';
        }

        if (value >= 45 && value <= 52) {
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


