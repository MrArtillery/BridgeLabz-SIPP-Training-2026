package Level1;

public class prob4 {
    public static void main(String[] args) {
        double cp = 129;
        double sp = 191;
        double profit = sp - cp;
        double profitPercentage = (profit / cp) * 100;

        System.out.println(
                "The Cost Price is INR " + cp +
                        " and Selling Price is INR " + sp +
                        "\nThe Profit is INR " + profit +
                        " and the Profit Percentage is " + profitPercentage
        );
    }
}
