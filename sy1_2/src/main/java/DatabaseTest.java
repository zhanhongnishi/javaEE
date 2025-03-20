import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class DatabaseTest {
    public static void main(String[] args) {
        // 从配置文件中读取数据库连接信息
        Properties props = new Properties();
        try {
            props.load(DatabaseTest.class.getClassLoader().getResourceAsStream("jdbc.properties"));
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

        String url = props.getProperty("jdbc.url");
        String username = props.getProperty("jdbc.username");
        String password = props.getProperty("jdbc.password");

        // 连接到数据库
        try (Connection conn = DriverManager.getConnection(url, username, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM student")) {

            // 输出查询结果
            while (rs.next()) {
                System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}