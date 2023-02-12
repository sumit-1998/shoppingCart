package userModel;

public class CartEntry 
{
     int cartEntryId;
     int fkCartId;
     int fkProductId;
	public int getCartEntryId() {
		return cartEntryId;
	}
	public void setCartEntryId(int cartEntryId) {
		this.cartEntryId = cartEntryId;
	}
	public int getFkCartId() {
		return fkCartId;
	}
	public void setFkCartId(int fkCartId) {
		this.fkCartId = fkCartId;
	}
	public int getFkProductId() {
		return fkProductId;
	}
	public void setFkProductId(int fkProductId) {
		this.fkProductId = fkProductId;
	}
}
