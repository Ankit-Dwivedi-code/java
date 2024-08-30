import java.util.Scanner;

/**
 * product
 */
 class product {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the product name: ");
        String productName = in.nextLine();
        System.out.println("Enter product price: ");
        double productPrice = in.nextDouble();
        double discount = 0.0;
        double netBill = 0.0;
        System.out.println("The product name is " + productName);
        if(productPrice > 1000 && productPrice  <= 10000)
        {
            discount += productPrice*(5.0/100);
            if(productPrice == 5000)
            {
                discount = discount + productPrice*(3.0/100);
            }
            System.out.println("Your discounted price is" + discount);
        }
        else if(productPrice > 10000)
        {
            discount += productPrice*(7.0/100);
            if(productPrice == 25000 || productPrice == 35000 || productPrice == 50000)
            {
                discount = discount + productPrice*(5.0/100);
            }
        }
        else
        {
            discount = 0.0;
        }
        netBill = productPrice - discount;
        System.out.println("Product name: " + productName + "\nPrice = " + productPrice + "\nDiscount = " + discount);
        System.out.println("Net Payable amount: " + netBill);
        in.close();
    }
}