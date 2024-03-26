package model;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Encrypt {


    //hàm saltString thêm chuỗi

    public static String saltString() {

        char a1 = (char) (((Math.random()) * 1) * 65534);
        char a2 = (char) (((Math.random()) * 1) * 65534);
        char a3 = (char) (((Math.random()) * 1) * 65534);
        char a4 = (char) (((Math.random()) * 1) * 65534);
        char a5 = (char) (((Math.random()) * 1) * 65534);
        char a6 = (char) (((Math.random()) * 1) * 65534);

        return "" + a1 + a2 + a3 + a4 + a5 + a6;
    }

    //hàm mã hóa pass
    public static String hashPassword(String password, String salt) throws NoSuchAlgorithmException, NoSuchAlgorithmException {
        password = salt + password;
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(password.getBytes());
        byte[] byteData = md.digest();
        StringBuilder hexString = new StringBuilder();
        for (byte b : byteData) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }
        return hexString.toString();
    }


}
