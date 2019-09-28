import java.util.Date;
import java.util.List;

import org.omg.PortableServer.POA;

public class CustomerTransaction implements Accounting, Reporting {
	
	public CustomerTransaction(Customer customer, List<Product> products) {
		this.customer = customer;
		this.products = products;
	}

	private Customer customer;
	private List<Product> products;
	
	/* (non-Javadoc)
	 * @see Reporting#getName()
	 */
	@Override
	public String getName() {
		return customer.getName();
	}
	
	/* (non-Javadoc)
	 * @see Reporting#getDate()
	 */
	@Override
	public Date getDate() {
		return new Date();
	}
	
	/* (non-Javadoc)
	 * @see Reporting#getProductBreakDown()
	 */
	@Override
	public String getProductBreakDown() {
		String reportList = null;
		for (Product product: products) {
			reportList += product.getProductId();
		}
		return reportList;
	}
	
	/* (non-Javadoc)
	 * @see Accounting#prepareInvoice()
	 */
	@Override
	public void prepareInvoice() {
		System.out.println("invoice prepared");
	}
	
	/* (non-Javadoc)
	 * @see Accounting#chargeCustomer()
	 */
	@Override
	public void chargeCustomer() {
		System.out.println("charged the customer");
	}
}