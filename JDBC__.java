
public class CreateEx {// jdbc api ojdbc

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// 1)load the driver class

		Class.forName("oracle.jdbc.driver.OracleDriver");

		// 2)create the connection

		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "fis", "fis123");

		// 3)create the statement

		Statement stmt = conn.createStatement();

		// 4)execute query DDL-->execute,DMl-->ExecuteUpdate,DRL-->executeQuery

		boolean result = stmt.execute("create table fisemp(eid number(10),ename varchar2(10),esal number(10))");

		// 5)close the connection1

		conn.close();

		System.out.println("table created "+result);

	}

}
