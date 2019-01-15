package model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProduktRepository {
    private static Connection con ;

    public Connection getCon() {
        return con;
    }

    public static void setCon(Connection con) {
        ProduktRepository.con = con;
    }

    public static List<Produkt> getAllItems() {

        List <Produkt> produkts = new ArrayList<Produkt>();
        Produkt p = null;

        String sql= "SELECT * FROM produkt";
        try (PreparedStatement ps = con.prepareStatement(sql)){
            ResultSet rs =ps.executeQuery();
            while (rs.next()) {
                int pid = rs.getInt("pid");
                String name=rs.getString("name");
                double preis=rs.getDouble("preis");
                p=new Produkt(pid,name,preis);
                produkts.add(p);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
//        produkts.add(new Produkt(0,"Staubsauger",355));
//        produkts.add(new Produkt(1,"Fernseher",650));
//        produkts.add(new Produkt(2,"Handy",850));
//        produkts.add(new Produkt(3,"Kühlschrank",1439));

        return produkts;
    }
}
