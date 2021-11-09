package SingletonPattern;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.derby.jdbc.EmbeddedDriver;

public class DbSingletonDerby {

    private static volatile DbSingletonDerby _derbyinstance = null;
    private static volatile Connection _derbyConnection = null;

    private DbSingletonDerby(){

        try{
            DriverManager.registerDriver(new EmbeddedDriver());
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        if(_derbyConnection!=null){
            throw new RuntimeException("Use getConnection() method to create");
        }

        if(_derbyinstance!=null){
            throw new RuntimeException("Use getInstance() method to create");
        }

    }



    public static DbSingletonDerby getInstance(){
        if(_derbyinstance ==null){
            synchronized (DbSingletonDerby.class){
                if(_derbyinstance ==null){
                    _derbyinstance = new DbSingletonDerby();
                }
            }
        }
        return _derbyinstance;
    }

    public  Connection getConnection(){
        if(_derbyConnection ==null){
            synchronized (DbSingletonDerby.class){
                if(_derbyConnection==null){
                    try{
                        String dbUrl = "jdbc:derby:memory:designPattern/derbydb;create=true";
                        _derbyConnection=DriverManager.getConnection(dbUrl);
                    }
                    catch (SQLException sqlException) {
                        sqlException.printStackTrace();
                    }
                }
            }
        }
        return _derbyConnection;
    }

}
