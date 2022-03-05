import java.util.ArrayList;
import java.util.Scanner;

public class PMS {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		int n;
		ArrayList<OrderData> all_data = new ArrayList<OrderData>(); // all data
		System.out.println(" ---------------------------------------------");
		System.out.println("|           Pizza Management System           |");
		System.out.println(" ---------------------------------------------");

		Event e = new Event();
		do {
			System.out.println("1.take Order\n" + "2.View Order\n" + "3.Delete Order\n"
					+ "4.Search Order as per date \n" + "5.Search Order as per Order_Number\n" + "6.Update Order\n"
					+ "7.change address of delivery \n"
					+ "0.Quit");
			System.out.print("Enter Choice ---> ");
			n = input.nextInt();

			switch (n) {
			case 1: // take Order
				OrderData data = e.take_order();
				all_data.add(data);
				e.list_orders(all_data);
				break;
			case 2: // View Order
				e.list_orders(all_data);
				break;
			case 3: // Delete Order
				e.remove_order(all_data);
				e.list_orders(all_data);
				break;
			case 4: // Search Order as per date
				e.searchByDate(all_data);
				break;
			case 5: // Search Order as per Order_Number
				e.searchOrderId(all_data);
				break;
			case 6: // Update Order
//				ask user to enter Order_id and new quantity; as per the new quanity total_price should change
				int oid,qty;
				System.out.println("Enter Order ID : ");
				oid = input.nextInt();
				System.out.println("Enter Quantity : ");
				qty = input.nextInt();
				e.updateqty(all_data,oid,qty);
				e.list_orders(all_data);
				
				break;
			case 7: // Change address of delivery
				int o_id;
				String s;
				System.out.println("Enter Order ID : ");
				o_id = input.nextInt();
				System.out.println("Enter Address : ");
				s = input.next();
				e.updateaddr(all_data,o_id,s);
				e.list_orders(all_data);
				break;
			default:

			}
		} while (n != 0);
	}

}
