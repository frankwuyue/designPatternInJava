
public class AccountReceivable {
	private Accounting customerTransaction;
	
	public AccountReceivable(Accounting customerTransaction) {
		this.customerTransaction = customerTransaction;
	}
	
	public void postPayment() {
		customerTransaction.chargeCustomer();
	}
	
	public void sendInvoice() {
		customerTransaction.prepareInvoice();
	}
}
