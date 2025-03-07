public class teste {
    public static void main(String[] args) {
        VendingMachine v1 = new VendingMachine(Size.SMALL);
        System.out.println(v1.getMaxValue());
        System.out.println(v1.getMinValue());
        System.out.println(v1.getDescription());
        System.out.println(v1.getCode());

    }
}
