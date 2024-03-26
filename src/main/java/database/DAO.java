package database;

import java.util.ArrayList;

public interface DAO <T>{




    public  int check(T t);

    public  int update(T t);

    public  int add(T t);

    public  int remove(T t);

    public ArrayList<T> selectAll();

    public  T selectById(T t);





}
