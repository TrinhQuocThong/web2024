package model;

public class CreateCodeModel {


    private int code;


    public CreateCodeModel() {

    }


    public static int createCode() {

        int ll1 = (int) ((Math.random()+1)*10000);

        return ll1;
    }

}
