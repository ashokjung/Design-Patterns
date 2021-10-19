package SingletonPattern;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DbSingletonDerbyDemo {

    public static final String sqlStatement = "CREATE TABLE Address (ID INT, StreetName Varchar(20), City Varchar(20))";
    public static void main(String[] args){

        DbSingletonDerby _instance = DbSingletonDerby.getInstance();

        long timeBefore = 0;
        long timeAfter =0;
        timeBefore = System.currentTimeMillis();
        Connection _connection = _instance.getConnection();
        timeAfter = System.currentTimeMillis();
        System.out.println("Instance is: "+_instance);
        System.out.println("Db Connection: " +_connection);
        System.out.println(timeAfter-timeBefore);


        Statement _statement;

        try{
            _statement = _connection.createStatement();
            int count = _statement.executeUpdate(sqlStatement);
            System.out.println("Table Created");
            _statement.close();

        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }

        // Try to create another instance of the connection to see how it initializes

        timeBefore = System.currentTimeMillis();
        DbSingletonDerby _myNewInstance = DbSingletonDerby.getInstance();
        Connection _myNewConnection = _instance.getConnection();
        timeAfter = System.currentTimeMillis();
        System.out.println("Instance is: "+_myNewInstance);
        System.out.println("Db Connection: " +_myNewConnection);
        System.out.println(timeAfter-timeBefore);



    }
}
