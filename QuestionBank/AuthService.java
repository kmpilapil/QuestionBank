
package QuestionBank;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AuthService {
    public static String authenticate(String username, String password) throws SQLException {
        Connection conn = DBConnection.getConnection();
        String sql = "SELECT role FROM users WHERE username=? AND password=?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, username);
        stmt.setString(2, password);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            return rs.getString("role");
        }
        return null;
    }
}

