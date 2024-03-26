package database;

import databaseconfig.DatabaseConnection;
import model.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDao implements DAO<Product> {


    @Override
    public int check(Product product) {
        return 0;
    }

    @Override
    public int update(Product product) {
        return 0;
    }

    @Override
    public int add(Product product) {

        try {

            Connection c = DatabaseConnection.getInsstances().getConnection();


            String sql = "INSERT INTO Products (nameProduct,  price,  salePrice,  productInformation,  dateOfManufacture,  dateExpiry,  quantity,  origin,  trademark,  weightProduct,  ageOfUse,  display,  statusProduct)" +
                    "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";


            PreparedStatement st = c.prepareStatement(sql);

           st.setString(1,product.getNameProduct());

           st.setDouble(2,product.getPrice());

           st.setDouble(3,product.getSalePrice());

        } catch (Exception e) {
            e.printStackTrace();
        }

        return 0;
    }

    @Override
    public int remove(Product product) {
        return 0;
    }

    @Override
    public ArrayList<Product> selectAll() {


        ArrayList<Product> list = new ArrayList<>();
        try {
            Connection c = DatabaseConnection.getInsstances().getConnection();
            String sql = "select * from products";
            PreparedStatement st = c.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt("id"), rs.getString("nameProduct"), rs.getDouble("price"), rs.getDouble("salePrice"), rs.getString("productInformation"), rs.getTimestamp("dateOfManufacture"), rs.getTimestamp("dateExpiry"), rs.getInt("quantity"), rs.getString("origin"), rs.getString("trademark"), rs.getInt("weightProduct"), rs.getInt("ageOfUse")));
            }

            DatabaseConnection.getInsstances().close(c);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        return list;
    }

    @Override
    public Product selectById(Product product) {
        return null;
    }
}
