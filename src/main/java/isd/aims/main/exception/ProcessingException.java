package isd.aims.main.exception;

public class ProcessingException extends PaymentException {
    public ProcessingException() {
        super("ERROR: VNPAY đang xử lý giao dịch này (GD hoàn tiền)!");
    }
}