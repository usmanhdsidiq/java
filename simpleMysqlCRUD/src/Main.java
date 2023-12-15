import java.sql.*;
import java.util.Scanner;

/*
Code author: usmanhdsidiq

You can use this code freely
Thank's for visiting my GitHub
 */
public class Main {

    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/practice1";
    static final String USER = "root";
    static final String PASS = "";

    static Connection cn;
    static Statement st;
    static ResultSet rs;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String customerId;
        String name;
        String email;
        String address;
        String phone;
        String orderId;
        int amount;

        try{
            Class.forName(JDBC_DRIVER);
            cn = DriverManager.getConnection(DB_URL, USER, PASS);
            st = cn.createStatement();

            try{
                System.out.println("--- Menu ---");
                System.out.println("1. Add data");
                System.out.println("2. View data");
                System.out.println("3. Update data");
                System.out.println("4. Delete data");
                System.out.print(">> ");
                int menu = input.nextInt();

                switch(menu){
                    case 1:
                        try{
                            System.out.println("--- Add Data ---");
                            System.out.println("1. Table: customer");
                            System.out.println("2. Table: orders");
                            System.out.print(">> ");
                            int menuA = input.nextInt();

                            switch(menuA){
                                case 1:
                                    input.nextLine();
                                    System.out.print("Customer id: ");
                                    customerId = input.nextLine().trim();

                                    System.out.print("Customer's name: ");
                                    name = input.nextLine().trim();

                                    System.out.print("Email: ");
                                    email = input.nextLine().trim();

                                    System.out.print("Address: ");
                                    address = input.nextLine().trim();

                                    System.out.print("Phone: ");
                                    phone = input.nextLine().trim();

                                    try{
                                        String sqla = "INSERT INTO customer (customerid, name, email, address, phone) "+ "VALUES ('"+customerId+"','"+name+"','"+email+"','"+address+"','"+phone+"')";
                                        st.execute(sqla);

                                        System.out.println("[OK] customer: data added successfully");
                                    } catch (Exception e){
                                        System.err.println("ERROR: ");
                                        e.printStackTrace();
                                    }
                                    break;
                                case 2:
                                    input.nextLine();
                                    System.out.print("Customer ID: ");
                                    customerId = input.nextLine();

                                    System.out.print("Amount: ");
                                    amount = input.nextInt();

                                    try{
                                        String sqla = "INSERT INTO orders (customerid, amount) "+ "VALUES ('"+customerId+"','"+amount+"')";
                                        st.execute(sqla);

                                        System.out.println("[OK] orders: data added successfully");
                                    } catch (Exception e){
                                        System.err.println("ERROR: ");
                                        e.printStackTrace();
                                    }
                                    break;
                            }
                        } catch (Exception e) {
                            System.err.println("ERROR: "+e);
                            e.printStackTrace();
                        }
                        break;
                    case 2:
                        System.out.println("--- View Data ---");

                        String sqlA = "SELECT a.customerid, a.name, a.address, b.date, b.amount FROM customer a JOIN orders b ON (a.customerid = b.customerid)";

                        try{
                            rs = st.executeQuery(sqlA);
                            while (rs.next()){
                                System.out.println("Customer ID: "+rs.getString("a.customerid"));
                                System.out.println("Name: "+rs.getString("a.name"));
                                System.out.println("Address: "+rs.getString("a.address"));
                                System.out.println("Date: "+rs.getString("b.date"));
                                System.out.println("Amount: "+rs.getString("b.amount"));
                                System.out.println();
                            }

                            st.close();
                            cn.close();
                        } catch (Exception e){
                            System.err.println(e);
                        }
                        break;
                    case 3:
                        System.out.println("--- Update Data ---");
                        System.out.println("1. Table: customer");
                        System.out.println("2. Table: orders");
                        System.out.print(">> ");
                        int menuA = input.nextInt();

                        try{
                            switch (menuA){
                                case 1:
                                    System.out.println("[UPDATE] Table: customer");
                                    try{
                                        input.nextLine();
                                        System.out.print("Please enter the customer id: ");
                                        customerId = input.nextLine();

                                        if(customerId != null){
                                            String sql = "SELECT * FROM customer WHERE customerid = '"+customerId+"'";

                                            try{
                                                rs = st.executeQuery(sql);
                                                while (rs.next()){
                                                    System.out.println("Customer ID: "+rs.getString("customerid"));
                                                    System.out.println("Name: "+rs.getString("name"));
                                                    System.out.println("Email: "+rs.getString("email"));
                                                    System.out.println("Address: "+rs.getString("address"));
                                                    System.out.println("Phone: "+rs.getString("phone"));
                                                }

                                            } catch (Exception e){
                                                System.err.println("ERROR: Error while fetching data from database");
                                                e.printStackTrace();
                                            }

                                            System.out.println("Do you want to change these data? (y/n)");
                                            System.out.println("Double tap enter to confirm");
                                            System.out.print(">> ");
                                            String confirm = input.nextLine();

                                            if(confirm.equalsIgnoreCase("y")){
                                                input.nextLine();
                                                System.out.println("Data edit for Customer ID: "+customerId);
                                                System.out.println("Please enter the new data");

                                                System.out.print("Name: ");
                                                name = input.nextLine().trim();

                                                System.out.print("Email: ");
                                                email = input.nextLine().trim();

                                                System.out.print("Address: ");
                                                address = input.nextLine().trim();

                                                System.out.print("Phone: ");
                                                phone = input.nextLine().trim();

                                                try{
                                                    String sqlb = "UPDATE customer SET name='"+name+"', email='"+email+"', address='"+address+"', phone='"+phone+"' WHERE customerid='"+customerId+"'";
                                                    st.execute(sqlb);

                                                    st.close();
                                                    cn.close();

                                                    System.out.println("[OK] customer: data updated successfully");
                                                } catch (Exception e){
                                                    System.err.println("ERROR: ");
                                                    e.printStackTrace();
                                                }
                                            } else if(confirm.equalsIgnoreCase("n")) {
                                                System.out.println("Abort...");
                                            } else {
                                                System.err.println("ERROR: invalid decision");
                                            }
                                        }
                                    } catch (Exception e){
                                        System.err.println("ERROR: "+e);
                                    }
                                    break;
                                case 2:
                                    System.out.println("[UPDATE] Table: orders");
                                    try{
                                        input.nextLine();
                                        System.out.print("Please enter the order id: ");
                                        orderId = input.nextLine();

                                        if(orderId != null){
                                            String sql = "SELECT * FROM orders WHERE orderid='"+orderId+"'";

                                            try{
                                                rs = st.executeQuery(sql);
                                                while (rs.next()){
                                                    System.out.println("Order ID: "+rs.getString("orderid"));
                                                    System.out.println("Customer ID: "+rs.getString("customerid"));
                                                    System.out.println("Date: "+rs.getString("date"));
                                                    System.out.println("Amount: "+rs.getString("amount"));
                                                }
                                            } catch (Exception e){
                                                System.err.println("ERROR: Error while fetching data from database");
                                                e.printStackTrace();
                                            }

                                            System.out.println("Do you want to change these data? (y/n)");
                                            System.out.println("Double tap enter to confirm");
                                            System.out.print(">> ");
                                            String confirm = input.nextLine();

                                            if(confirm.equalsIgnoreCase("y")){
                                                input.nextLine();
                                                System.out.println("Data edit for Order ID: "+orderId);
                                                System.out.println("Please enter the new data");

                                                System.out.print("Amount: ");
                                                amount = input.nextInt();

                                                try{
                                                    String sqla = "UPDATE orders SET amount="+amount+" WHERE orderid='"+orderId+"'";
                                                    st.execute(sqla);

                                                    st.close();
                                                    cn.close();

                                                    System.out.println("[OK] orders: data updated successfully");
                                                } catch (Exception e){
                                                    System.err.println("ERROR: ");
                                                    e.printStackTrace();
                                                }
                                            } else if(confirm.equalsIgnoreCase("n")) {
                                                System.out.println("Abort...");
                                            } else {
                                                System.err.println("ERROR: invalid decision");
                                            }
                                        }
                                    } catch (Exception e){
                                        System.err.println("ERROR: "+e);
                                    }
                                    break;
                            }
                        } catch (Exception e) {
                            System.err.println("ERROR: "+e);
                        }
                        break;
                    case 4:
                        System.out.println("--- Delete Data ---");
                        System.out.println("Table reference: customer | Column: customerid");

                        try{
                            input.nextLine();
                            System.out.print("Please enter the costumer ID: ");
                            customerId = input.nextLine();

                            if (customerId != null){
                                String sql = "SELECT * FROM customer WHERE customerid='"+customerId+"'";

                                try{
                                    rs = st.executeQuery(sql);
                                    while (rs.next()){
                                        System.out.println("Customer ID: "+rs.getString("customerid"));
                                        System.out.println("Name: "+rs.getString("name"));
                                        System.out.println("Email: "+rs.getString("email"));
                                        System.out.println("Address: "+rs.getString("address"));
                                        System.out.println("Phone: "+rs.getString("phone"));
                                    }
                                } catch (Exception e){
                                    System.err.println("ERROR: failed while fetching the data");
                                    e.printStackTrace();
                                }

                                System.out.println("Do you want to delete data with this ID? (y/n)");
                                System.out.println("Double tap enter to confirm");
                                System.out.print(">> ");
                                String confirm = input.nextLine();

                                if(confirm.equalsIgnoreCase("y")){
                                    input.nextLine();
                                    System.out.println("Delete data for customer ID: "+customerId);

                                    try{
                                        String sqla = "DELETE FROM customer WHERE customerid='"+customerId+"'";
                                        st.execute(sqla);

                                        st.close();
                                        cn.close();

                                        System.out.println("[OK] orders: data deleted successfully");
                                    } catch (Exception e){
                                        System.err.println("ERROR: ");
                                        e.printStackTrace();
                                    }
                                } else if(confirm.equalsIgnoreCase("n")) {
                                    System.out.println("Abort...");
                                } else {
                                    System.err.println("ERROR: invalid decision");
                                }
                            }
                        } catch (Exception e){
                            System.err.println("ERROR: "+e);
                        }
                        break;
                }
            } catch (Exception e) {
                System.err.println("Invalid menu" + e);
            }

        } catch (Exception e) {
            System.err.println(e);
            e.printStackTrace();
        }
    }
}