public class DIP
{   
    // Abstraction
    public interface PaymentProcessor 
    {
        void process();
    }

    // High-level module
    class PaymentService 
    {
        private PaymentProcessor paymentProcessor;
        
        public PaymentService(PaymentProcessor paymentProcessor) 
        {
            this.paymentProcessor = paymentProcessor;
        }
        
        public void processPayment() 
        {
            paymentProcessor.process();
        }
    }

    // Low-level module
    class PayPalPaymentProcessor implements PaymentProcessor 
    {
        public void process() 
        {
            // process payment with PayPal
        }
    }
}