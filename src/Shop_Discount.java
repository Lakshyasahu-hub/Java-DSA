import java.util.Scanner;
public class Shop_Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter price");
        double price = sc.nextDouble();
        double discount = 0.0;

        if(price >0 && price <=5000 ){
            discount = (price * 0)/100;
        } else if (price >5000 && price <=7000) {
            discount = (price * 5)/100;
        } else if (price > 7000 && price <= 9000) {
            discount = (price * 10)/100;
        } else if (price>9000) {
            discount = (price * 20)/100;
        }
        System.out.println("Final Price = " +  (price-discount));
    }
}
