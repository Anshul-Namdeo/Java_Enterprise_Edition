package models;

import java.util.ArrayList;
import java.sql.Date;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.sql.ResultSet;

public class Product {
    //--------------------- properties------------//
    private Integer productId;
    private String productName;
    private Integer price;
    private float weight;
    private Integer quantity;
    private Integer sold;
    private String description;
    private String pic;
    private User user;

    //-----------Constructors-------------------//

    public Product ()
    {

    }

    public Product(Integer productId, String productName, Integer price, float weight, Integer quantity, Integer sold, String description, String pic, User use)
    {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.weight = weight;
        this.quantity = quantity;
        this.sold = sold;
        this.description = description;
        this.pic = pic;
        this.user = user;
    }

    //--------------Other Methods ---------------//

    public static ArrayList<Product> collectAllProducts(Integer userId)
    {
        ArrayList<Product> products = new ArrayList<>();

        try{

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/authdb?user=root&password=1234");

            String query = "select * from products where user_id=?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, userId);

            ResultSet rs = ps.executeQuery();

            while(rs.next())
            {
               int productId = rs.getInt("product_id");
               String productName =  rs.getString("product_name");
               int price =  rs.getInt("price");
               float weight =  rs.getFloat("weight");
               int quantity =  rs.getInt("quantity");
               int sold =  rs.getInt("sold");
               String description =  rs.getString("description");
               String pic =  rs.getString("pic");
               User user = new User(rs.getInt("user_id"));

              Product product = new Product(productId, productName, price, weight, quantity, sold, description, pic, user);

              products.add(product);
            }

        }catch(SQLException|ClassNotFoundException e){
            e.printStackTrace();
        }
        return products;
    }

    //---------Getter&Setter()---------------//

    public void setProductId(Integer productId)
    {
        this.productId = productId;
    }

    public Integer getProductId()
    {
        return productId;
    }

    public void setProductName(String productName)
    {
        this.productName = productName;
    }

    public String getProductName()
    {
        return productName;
    }

    public void setPrice(Integer price)
    {
        this.price = price;
    }

    public Integer getPrice()
    {
        return price;
    }

    public void setWeight(float weight)
    {
        this.weight = weight;
    }

    public float getWeight()
    {
        return weight;
    }

    public void setQuantity(Integer quantity)
    {
        this.quantity = quantity;
    }

    public Integer getQuantity()
    {
        return quantity;
    }

    public void setSold(Integer sold)
    {
        this.sold = sold;
    }

    public Integer getSold()
    {
        return sold;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getDescription()
    {
        return description;
    }

    public void setPic(String pic)
    {
        this.pic = pic;
    }

    public String getPic()
    {
        return pic;
    }

    public void setUser(User user)
    {
        this.user = user;
    }

    public User getUser()
    {
        return user;
    }
}


