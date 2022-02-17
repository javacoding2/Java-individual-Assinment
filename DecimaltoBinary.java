package individualassinment;

public class DecimaltoBinary {
    public static void decimaltobinary(int decimal) {
        int binary[] = new int[40];
        int index = 0;
        while(decimal > 0){
            binary[index++] = decimal%2;
            decimal = decimal/2;
        }
        for(int i = index-1;i >= 0;i--){
            System.out.print(binary[i]);
        }
        System.out.println();//new line
    }
    public static void main(String args[]){
        System.out.println("Decimal of 33 is: ");
        decimaltobinary(33);
        System.out.println("Decimal of 44 is: ");
        decimaltobinary(44);
        System.out.println("Decimal of 31 is: ");
        decimaltobinary(31);

    }
}
