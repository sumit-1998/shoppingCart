package userModel;

public class Cart 
{
    int cartId;
    String cartTotal;
    String shippingCost;
    String paymentMode;
    int fkUserId;
    int fkCardId;
    public int getFkUserId() {
		return fkUserId;
	}
	public void setFkUserId(int fkUserId) {
		this.fkUserId = fkUserId;
	}
	public int getFkCardId() {
		return fkCardId;
	}
	public void setFkCardId(int fkCardId) {
		this.fkCardId = fkCardId;
	}
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public String getCartTotal() {
		return cartTotal;
	}
	public void setCartTotal(String cartTotal) {
		this.cartTotal = cartTotal;
	}
	public String getShippingCost() {
		return shippingCost;
	}
	public void setShippingCost(String shippingCost) {
		this.shippingCost = shippingCost;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
    
}
