
public class OrderData {
	private int Order_id,quantity,Rs;
	private String Order_date,Address,pizza_name;
	private float Total_Price;
	
	public int getOrder_id() {
		return Order_id;
	}
	public void setOrder_id(int order_id) {
		Order_id = order_id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getRs() {
		return Rs;
	}
	public void setRs(int rs) {
		Rs = rs;
	}
	public String getOrder_date() {
		return Order_date;
	}
	public void setOrder_date(String order_date) {
		Order_date = order_date;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getPizza_name() {
		return pizza_name;
	}
	public void setPizza_name(String pizza_name) {
		this.pizza_name = pizza_name;
	}
	public float getTotal_Price() {
		return Total_Price;
	}
	public void setTotal_Price(float total_Price) {
		Total_Price = total_Price;
	}

}
