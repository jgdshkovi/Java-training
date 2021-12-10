package com.jdbc;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.sql.Connection;

public class SampleJdbc_ConnEx {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
//1) add jdbc api ojdbc(right click project->buildpath->configure buildpath->add external libraries)
	//(path ex: C:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib)
//2) load the driver class	
	Class.forName("oracle.jdbc.driver.OracleDriver");
//3) create the connection	
Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","anitha","ak123");
//4) create the statement
Statement stmt = conn.createStatement();
//5) execute query(DDL-->execute(), DML-->executeUpdate(), DRL-->executeQuery())

/*-------------creating a table---------------------*/
/*boolean result = stmt.execute("create table emp(eid number(5),ename varchar2(10), sal number)");
System.out.println("table created "+result);//table created false
*/

/*-----------inserting values into a table------------*/
/*int result= stmt.executeUpdate("insert into emp values(1,'anitha',50000)");
System.out.println(result+ "rows created");//1 rows created
*/

/*-----------------fetch all data from table---------*/
ResultSet result = stmt.executeQuery("select * from emp");
while(result.next()){
	System.out.println(result.getInt(1)+" "+result.getString("ename")+" "+result.getInt(3));
}
//6) close the connection
conn.close();

}
}
  