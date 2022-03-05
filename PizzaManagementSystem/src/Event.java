import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Event {
	int Order_id = 0, quantity, Rs;
	String Order_date, Address, pizza_name;
	float Total_Price;

	Scanner input = new Scanner(System.in);

	// event val input
	public OrderData take_order() {
		OrderData data = new OrderData();
		System.out.println("Enter Date : ");
		Order_date = input.next();

		System.out.println("Enter Pizza Name : ");
//		pizza_name = input.next();
		data.setPizza_name(input.next());
		
		System.out.println("Enter Delivary Address : ");
		Address = input.next();

		System.out.println("Enter Quantity : ");
		quantity = input.nextInt();

		System.out.println("Enter Pizza Price : ");
		Rs = input.nextInt();

		
		data.setOrder_id(Order_id);
//		data.setPizza_name(pizza_name);
		data.setOrder_date(Order_date);
		data.setAddress(Address);
		data.setQuantity(quantity);
		data.setRs(Rs);
		data.setTotal_Price(Rs * quantity);
		Order_id++;
		return data;
	}

	public void list_orders(ArrayList all_d) {
		System.out.println("\nOrder Id \t Order Date \t Pizza Name \t Address \t Rs \t Quantity  \t Total Price \n");
		Iterator it = all_d.iterator();
		while (it.hasNext()) {
			OrderData od = (OrderData) it.next();
			System.out.println("\n" + od.getOrder_id() + " \t " + od.getOrder_date() + " \t " + od.getPizza_name()
					+ "\t " + od.getAddress() + "\t " + od.getRs() + "\t " + od.getQuantity() + "\t"
					+ od.getTotal_Price() + "\n");
		}
	}

	public void remove_order(ArrayList alldata) {
		int oid;
		System.out.println("Enter Order ID : ");
		oid = input.nextInt();
		Iterator et = alldata.iterator();
		boolean f=false;
		while (et.hasNext()) {
			OrderData od = (OrderData) et.next();
			if (od.getOrder_id() == oid) {
				alldata.remove(od);
				System.out.println(oid + " order remove Succssfully");
				f=true;
				break;
			} 
		}
		if(f==false) {
			System.out.println("Order Not Found");
		}

	}
	
	public void searchByDate(ArrayList al) {
		String d;
		System.out.print("Enter Date ");
		d = input.next();
		System.out.println("\nOrder Id \t Order Date \t Pizza Name \t Address 1 \t Rs \t Quantity  \t Total Price \n");
		Iterator it = al.iterator();
		while(it.hasNext()) {
			OrderData od = (OrderData) it.next();
			if(d.equals(od.getOrder_date())) {
				System.out.println("\n" + od.getOrder_id() + " \t " + od.getOrder_date() + " \t " + od.getPizza_name()
				+ "\t " + od.getAddress() + "\t " + od.getRs() + "\t " + od.getQuantity() + "\t"
				+ od.getTotal_Price() + "\n");
			}
		}
	}
	
	public void searchOrderId(ArrayList al) {
		int id;
		System.out.print("Enter Date ");
		id = input.nextInt();
		System.out.println("\nOrder Id \t Order Date \t Pizza Name \t Address 1 \t Rs \t Quantity  \t Total Price \n");
		Iterator it = al.iterator();
		while(it.hasNext()) {
			OrderData od = (OrderData) it.next();
			if(id==od.getOrder_id()) {
				System.out.println("\n" + od.getOrder_id() + " \t " + od.getOrder_date() + " \t " + od.getPizza_name()
				+ "\t " + od.getAddress() + "\t " + od.getRs() + "\t " + od.getQuantity() + "\t"
				+ od.getTotal_Price() + "\n");
			}
		}
	}

	public void updateqty(ArrayList<OrderData> all_data, int oid, int qty) {
		Iterator it = all_data.iterator();
		while(it.hasNext()) {
			OrderData od =(OrderData) it.next();
			if(oid==od.getOrder_id()) {
				od.setQuantity(qty);
				od.setTotal_Price(qty*od.getRs());
			}
		}
	}
	
	public void updateaddr(ArrayList<OrderData> all_data, int oid, String s) {
		Iterator it = all_data.iterator();
		while(it.hasNext()) {
			OrderData od =(OrderData) it.next();
			if(oid==od.getOrder_id()) {
				od.setAddress(s);
			}
		}
	}

}
