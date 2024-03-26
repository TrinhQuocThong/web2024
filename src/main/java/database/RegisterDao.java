package database;

import databaseconfig.DatabaseConnection;
import model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

public class RegisterDao implements DAO<User> {


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

/**
 *     id INT AUTO_INCREMENT PRIMARY KEY,
 *     username VARCHAR(50) DEFAULT NULL,
 *     passwords VARCHAR(255) DEFAULT NULL,
 *     email VARCHAR(100) DEFAULT NULL,
 *     phoneNumber VARCHAR(15) DEFAULT NULL,
 *     accountCreationTime TIMESTAMP DEFAULT CURRENT_TIMESTAMP ,
 *     firstName VARCHAR(50) DEFAULT NULL,
 *     lastName VARCHAR(50) DEFAULT NULL,
 *     images TEXT DEFAULT NULL ,
 *     sexual VARCHAR(10)  DEFAULT NULL,
 *     emailVerify BOOLEAN DEFAULT FALSE,
 *     coin DECIMAL(10, 2)  DEFAULT 0,
 *     idPayment INT,
 *     idShipment INT,
 *     codeVerifyRandom VARCHAR(50)  DEFAULT 0,
 *     roles TINYINT(1) CHECK (roles IN (0, 1)),
 *     policyViolations BOOLEAN  DEFAULT FALSE
 */

        try {
            //
            Connection c = DatabaseConnection.getInsstances().getConnection();

            //
            String sql = "INSERT INTO USER (?,?,?)";


            PreparedStatement st = c.prepareStatement(sql);


            st.setString(1, user.getUsername());

            st.setString(2, user.getPasswords());

            st.executeUpdate();


            //close kết nối

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
}
