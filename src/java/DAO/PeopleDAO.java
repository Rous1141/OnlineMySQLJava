/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.People;
import Utils.DBUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author hendrix
 */
public class PeopleDAO {

    public ArrayList<People> getAllPeople() {
        ArrayList<People> result = new ArrayList<>();
        try {
            String sql = " SELECT * FROM `People`";
            Connection con = DBUtils.getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                int ID = rs.getInt("id");
                String name = rs.getString("Name");
                int age = rs.getInt("Age");
                String job = rs.getString("Job");
                People people = new People(ID, name, age, job);
                result.add(people);
               
            }
             return result;
        } catch (SQLException e) {
            System.out.println(e);
        }

        return result;
    }
}
