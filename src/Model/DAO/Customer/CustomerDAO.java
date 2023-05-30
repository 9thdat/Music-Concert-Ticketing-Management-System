package Model.DAO.Customer;

import Model.BEAN.Customer;
import Model.Database.UserDatabase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAO{
    public static CustomerDAO getInstance() {
        return new CustomerDAO();
    }

    public List<Customer> getList() {
        try {
            Connection con = UserDatabase.getConnection();
            String sql = "Select * from mctmsys.customer";
            List<Customer> list = new ArrayList<>();
            PreparedStatement ps = con.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Customer customer = new Customer();
                customer.setId(rs.getInt("CUS_ID"));
                customer.setName(rs.getString("CUS_NAME"));
                customer.setPhoneNumber(rs.getString("CUS_PHONE_NUMBER"));
                customer.setEmail(rs.getString("CUS_EMAIL"));
                customer.setAddress(rs.getString("CUS_ADDRESS"));
                customer.setType(rs.getString("CUS_TYPE"));
                customer.setTotalPoint(rs.getInt("CUS_TOTAL_POINT"));
                list.add(customer);
            }
            ps.close();
            rs.close();
            con.close();
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Customer selectByID(int ID) throws SQLException {
        Customer customer = null;
        try {
            Connection con = UserDatabase.getConnection();
            String sql = "Select * from mctmsys.customer where CUS_ID = " + ID + ";";
            System.out.println(sql);
            PreparedStatement ps = con.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                customer = new Customer();
                customer.setId(rs.getInt("CUS_ID"));
                customer.setName(rs.getString("CUS_NAME"));
                customer.setPhoneNumber(rs.getString("CUS_PHONE_NUMBER"));
                customer.setEmail(rs.getString("CUS_EMAIL"));
                customer.setAddress(rs.getString("CUS_ADDRESS"));
                customer.setType(rs.getString("CUS_TYPE"));
                customer.setTotalPoint(rs.getInt("CUS_TOTAL_POINT"));
            }

            ps.close();
            rs.close();
            con.close();
            return customer;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public int updateCustomer(Customer cus) throws SQLException {
        int rowChanged = 0;
        try {
            Connection con = UserDatabase.getConnection();
            String sql = "UPDATE mctmsys.customer SET CUS_NAME = '" + cus.getName() + "' , CUS_PHONE_NUMBER = '" + cus.getPhoneNumber() +
                    "', CUS_EMAIL = '" + cus.getEmail() +"', CUS_ADDRESS = '" + cus.getAddress() + "', CUS_TOTAL_POINT = " + cus.getTotalPoint() + " WHERE CUS_ID = " +cus.getId() + "";
            System.out.println(sql);

            PreparedStatement ps = con.prepareCall(sql);

            rowChanged = ps.executeUpdate();
            System.out.println("Row changed: " + rowChanged);
            ps.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowChanged;
    }

    public int addCustomer(Customer newCustomer) throws SQLException {
        int rowChanged = 0;
        try {
            Connection con = UserDatabase.getConnection();
            String sql = "INSERT INTO mctmsys.customer (CUS_ID, CUS_NAME, CUS_PHONE_NUMBER, CUS_EMAIL, CUS_ADDRESS, CUS_TYPE, CUS_TOTAL_POINT) VALUES (?, ?, ?, ?, ?, ?, ?)";
            System.out.println(sql);

            PreparedStatement ps = con.prepareCall(sql);
            ps.setInt(1, newCustomer.getId());
            ps.setString(2, newCustomer.getName());
            ps.setString(3, newCustomer.getPhoneNumber());
            ps.setString(4, newCustomer.getEmail());
            ps.setString(5, newCustomer.getAddress());
            ps.setString(6, newCustomer.getType());
            ps.setInt(7, newCustomer.getTotalPoint());

            rowChanged = ps.executeUpdate();
            System.out.println("Row changed: " + rowChanged);
            ps.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowChanged;
    }

    public int deleteCustomer(int ID) throws SQLException {
        int rowChanged = 0;
        try {
            Connection con = UserDatabase.getConnection();
            String sql = "DELETE from mctmsys.customer where CUS_ID = " + ID + ";";
            System.out.println(sql);
            PreparedStatement ps = con.prepareCall(sql);
            rowChanged = ps.executeUpdate();

            ps.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowChanged;
    }

}
