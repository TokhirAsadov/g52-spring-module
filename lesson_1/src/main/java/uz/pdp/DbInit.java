package uz.pdp;

import lombok.Data;

@Data
public class DbInit {
    private String url;
    private String database;
    private String user;
    private String password;
    private String schema;
    private String driver;

    public DbInit() {
    }

    public DbInit(String url, String database, String user, String password, String schema, String driver) {
        this.url = url;
        this.database = database;
        this.user = user;
        this.password = password;
        this.schema = schema;
        this.driver = driver;
    }
}
