package common;

/**
 * @author Cuiyaji
 * @created 2018-4-10
 */
public class Common {

	// connect the database
	public static final String DRIVER = "com.mysql.jdbc.Driver";
	public static final String DB_NAME = "matlab";
	public static final String USERNAME = "root";
	public static final String PASSWORD = "123456";
	public static final String IP = "localhost";
	public static final String PORT = "3306";
	public static final String URL = "jdbc:mysql://" + IP + ":" + PORT + "/" + DB_NAME + "?autoReconnect=true&useSSL=false";
	
	// common
	public static final String EXCEL_PATH = "/Users/Richard/Desktop/m/data.xlsx";
	
	// sql
//	public static final String CREATE_DATA_SQL = "CREATE TABLE REGISTRATION " +
//            "(id INTEGER not NULL, " +
//            " first VARCHAR(255), " + 
//            " last VARCHAR(255), " + 
//            " age INTEGER, " + 
//            " PRIMARY KEY ( id ))";
	public static final String INSERT_DATA_SQL = "insert into data_info(no, name, age, score) values(?, ?, ?, ?)";
	public static final String UPDATE_DATA_SQL = "update data_info set no = ?, name = ?, age= ?, score = ? where id = ? ";
	public static final String SELECT_DATA_ALL_SQL = "select id,no,name,age,score from data_info";
	public static final String SELECT_DATA_SQL = "select * from data_info where name like ";
}

