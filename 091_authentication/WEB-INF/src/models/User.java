package models;

import java.sql.Date;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class User 
{
    //------------- Properties ---------------------------//
    private Integer userId;
    private String fullName;
    private String email;
    private String password;
    private Date dob;
    private Character gender;
    private String city;
    private String address;


    //-------------Constructor--------------------------//

    public User ()
    {

    }

    public User (String fullName, String email, String password)
    {
        this.fullName = fullName;
        this.email = email;
        this.password = password;
    }

    // ---------------------- Save data -------------------------//

    public boolean SignupUser()
    {   
            boolean flag = false;
        try{

        // Register to Driver Class
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Create Connection
        String url = "jdbc:mysql://localhost:3306/authdb";
        String user = "root";
        String pw = "1234";

        Connection con = DriverManager.getConnection(url, user, pw);

        // prepare Query
        String query = "insert into users (full_name, email, password) value (?, ?, ?)";

        PreparedStatement ps = con.prepareStatement(query);

        // set data
        ps.setString(1, fullName);
        ps.setString(2, email);
        ps.setString(3, password);

        // execute 
       int result = ps.executeUpdate();

       if(result == 1)
       {
            flag = true;
       }

        // connection close
        con.close();
        }catch(SQLException|ClassNotFoundException e){
            e.printStackTrace();
        }

        return flag;
    }


    //-------Getter() & Setter() Method------------------//

    public void setUserId(Integer userId)
    {
        this.userId = userId;
    }

    public Integer getUserId()
    {
        return userId;
    }

    public void setFullName(String fullName)
    {
        this.fullName = fullName;
    }

    public String getFullName()
    {
        return fullName;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getEmail()
    {
        return email;
    }

     public void setPassword(String password)
    {
        this.password = password;
    }

    public String getPassword()
    {
        return password;
    }

    public void setDob(Date dob)
    {
        this.dob = dob;
    }

    public Date getDob()
    {
        return dob;
    }

     public void setGender(Character gender)
    {
        this.gender = gender;
    }

    public Character getGender()
    {
        return gender;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public String getCity()
    {
        return city;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getAddress()
    {
        return address;
    }
}