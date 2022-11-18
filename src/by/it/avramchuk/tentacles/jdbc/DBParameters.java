package by.it.avramchuk.tentacles.jdbc;

public class DBParameters {
    private static final DBResourceManager manager = DBResourceManager.getInstance();
    public static final String DB_DRIVER = manager.getValue("db.driver");
    public static final String DB_URL = manager.getValue("db.url");
    public static final String DB_USER = manager.getValue("db.user");
    public static final String DB_PASSWORD = manager.getValue("db.password");
}
