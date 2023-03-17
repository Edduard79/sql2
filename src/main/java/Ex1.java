import com.sun.jdi.connect.Connector;

import java.sql.*;

public class Ex1 {

    public static void main(String[] args) throws SQLException {
        Connection conn;
        Statement sta = null;
        ResultSet rs = null;

        conn = DriverManager.getConnection("jdbc:mysql://localhost/newdb?" + "user='root'&password=Mysql123");

        sta = conn.createStatement();
        String que = "CREATE TABLE IF NOT EXISTS students (student_id int NOT NULL AUTO_INCREMENT, " +
                "last_name VARCHAR(30), first_name VARCHAR(30),  PRIMARY KEY(student_id));";

        sta.execute(que);

        que = "INSERT INTO students(last_name, first_name) VALUES('Marco','Rossi'),('Giovanni', 'Bianchi'), ('Marta', 'Verdi'), ('Ultimo','Nome'), ('Studente','Finale')";
        sta.execute(que);



    }



}
