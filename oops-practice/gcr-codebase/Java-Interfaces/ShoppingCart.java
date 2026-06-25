interface CouponValidator {

    // Abstract method
    boolean validateCoupon(String code);

    // Static method
    static boolean isLengthValid(String code) {
        return code.length() >= 5;
    }
}

public class ShoppingCart implements CouponValidator {

    @Override
    public boolean validateCoupon(String code) {

        return CouponValidator.isLengthValid(code)
                && code.startsWith("SAVE");
    }

    public static void main(String[] args) {

        String[] coupons = {
                "SAVE10",
                "SAVE20",
                "ABC12",
                "SAVE",
                "SAVE100"
        };

        ShoppingCart cart = new ShoppingCart();

        for (String coupon : coupons) {

            if (cart.validateCoupon(coupon)) {
                System.out.println(coupon + " : Valid Coupon");
            } else {
                System.out.println(coupon + " : Invalid Coupon");
            }
        }
    }
}
