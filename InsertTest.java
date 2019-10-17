package jdbcProjects;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inserting values in MYSQL database table!");
		Connection con = null;

		String url = "jdbc:mysql://Localhost:3306/";
		String db = "learntrix";

		String driver = "com.mysql.jdbc.Driver";

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url + db, "root", "Shreyas@9711");

			try {
				Statement st = con.createStatement();
				String sql = "insert into jdbctest.employee " + "values(" + 3 + "," + "'LNT1003'" + ","
						+ "'Steve Jobs' " + "," + "21000)";

				System.out.println(sql);
				int val = st.executeUpdate(sql);
				System.out.println("1 row affected + return value: " + val);

			} catch (SQLException s) {
				System.out.println("Sql statement is not executed! Error is: " + s.getMessage());

			}
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
