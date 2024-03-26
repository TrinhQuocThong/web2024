package database;

import com.mysql.cj.jdbc.JdbcConnection;
import databaseconfig.DatabaseConnection;
import model.User;

import java.sql.*;
import java.util.ArrayList;

public class UserDao implements DAO<User> {


    @Override
    public int check(User user) {
        return 0;
    }

    @Override
    public int update(User user) {


        return 0;
    }

    @Override
    public int add(User user) {


        try {

            Connection c = DatabaseConnection.getInsstances().getConnection();


            String sql = "INSERT INTO users (username, passwords, phoneNumber, accountCreationTime, firstName, lastName, images, sexual, emailVerify, coin, saltString, roles, policyViolations)" +
                    "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";

            PreparedStatement st = c.prepareStatement(sql);


            st.setString(1, user.getUsername());
            st.setString(2, user.getPasswords());
            st.setString(3, user.getPhoneNumber());
            st.setTimestamp(4, user.getAccountCreationTime());
            st.setString(5, user.getFirstName());
            st.setString(6, user.getLastName());
            st.setString(7, user.getImages());
            st.setString(8, user.getSexual());


            st.setByte(9, user.getEmailVerify());


            st.setInt(10, user.getCoin());


            st.setString(11, user.getSaltString());


            st.setByte(12, user.getRoles());


            st.setByte(13, user.getPolicyViolations());

            st.executeUpdate();

            DatabaseConnection.getInsstances().close(c);
        } catch (Exception e) {
            e.printStackTrace();
        }


        return 0;
    }

    @Override
    public int remove(User user) {
        return 0;
    }

    @Override
    public ArrayList<User> selectAll() {
        return null;
    }

    @Override
    public User selectById(User user) {
        return null;
    }


    //vì user name là email nên duy nhất , do đó chỉ 1 dòng được trả ra
    public User selectByUsername(String name) {


        try {
            Connection c = DatabaseConnection.getInsstances().getConnection();


            //lệnh SQL


            String sql = "select * from users where username = ?";
            PreparedStatement st = c.prepareStatement(sql);

            st.setString(1, name);


            ResultSet set = st.executeQuery();

            while (set.next()) {


                int id = set.getInt("id");


                String username = set.getString("username");
                String passwords = set.getString("passwords");
                String phoneNumber = set.getString("phoneNumber");
                Timestamp accountCreationTime = set.getTimestamp("accountCreationTime");
                ;
                String firstName = set.getString("firstName");
                ;
                String lastName = set.getString("lastName");
                ;
                String images = set.getString("images");
                ;
                String sexual = set.getString("sexual");
                ;
                byte emailVerify = set.getByte("emailVerify");
                int coin = set.getInt("coin");
                ;
                int idPayment = set.getInt("idPayment");
                ;
                int idShipment = set.getInt("idShipment");
                String saltString = set.getString("saltString");
                ;
                byte roles = set.getByte("roles");
                byte policyViolations = set.getByte("policyViolations");
                ;

                return (new User(id, username, passwords, phoneNumber, accountCreationTime, firstName, lastName, images, sexual, emailVerify, coin, idPayment, idShipment, saltString, roles, policyViolations));
            }

            DatabaseConnection.getInsstances().close(c);

        } catch (Exception e) {

        }

        return null;

    }


    public int update() {
        return 1;
    }


}
