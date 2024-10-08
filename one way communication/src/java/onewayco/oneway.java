package onewayco;

import javax.annotation.Resource;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.sql.DataSource;
import java.sql.*;

@WebService(serviceName = "oneway")
public class oneway {
    @Resource(name = "mydsn")
    private DataSource mydsn;

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getname")
    public String getname(@WebParam(name = "id") int id) {
        try {
            Connection c = mydsn.getConnection();
            PreparedStatement ps = c.prepareStatement("SELECT * FROM friends WHERE id = ?");
            ps.setInt(1, id);
            ResultSet r = ps.executeQuery();
            if (r.next()) {
                return r.getString(2); // Assuming the name is in the second column
            } else {
                return "No name found";
            }
        } catch (SQLException e) {
            return "Error: " + e.getMessage(); // Return error message for debugging
        }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "insert")
    public String insert(@WebParam(name = "id") int id, @WebParam(name = "name") String name) {
        try {
            Connection c = mydsn.getConnection();
            PreparedStatement ps = c.prepareStatement("INSERT INTO friends (id, name) VALUES (?, ?)");
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.executeUpdate();
            return "Name inserted successfully";
        } catch (SQLException e) {
            return "Error: " + e.getMessage(); // Return error message for debugging
        }
    }
}
