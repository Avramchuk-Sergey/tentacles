package by.it.avramchuk.tentacles.jdbc;

import java.util.ResourceBundle;

public class DBResourceManager {

    private static final DBResourceManager instance = new DBResourceManager();

    private ResourceBundle bundle = ResourceBundle.getBundle("it.by.avramchuk.tentacles.db");

    public static DBResourceManager getInstance(){return instance;}

    public String getValue(String key){
        return bundle.getString(key);
    }
}
