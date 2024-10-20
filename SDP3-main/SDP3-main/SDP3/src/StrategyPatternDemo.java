public class StrategyPatternDemo {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();

        // Pay with Credit Card
        paymentProcessor.setPaymentStrategy(new CreditCardPayment());
        paymentProcessor.processPayment(100.0);

        // Pay with PayPal
        paymentProcessor.setPaymentStrategy(new PayPalPayment());
        paymentProcessor.processPayment(200.0);
    }
}