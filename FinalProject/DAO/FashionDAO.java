package com.evergent.corejava.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.evergent.corejava.bean.*;

public class FashionDAO {
    public int addProduct(FashionBean fashionBean) {
        try {
            Connection con = FashionDBConnection.getConnection();
            String query = "insert into fashion_products VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1, fashionBean.getProductId());
            pstmt.setString(2, fashionBean.getProductName());
            pstmt.setString(3, fashionBean.getCategory());
            pstmt.setDouble(4, fashionBean.getPrice());
            pstmt.setInt(5, fashionBean.getStock());
            int count = pstmt.executeUpdate();
            con.close();
            return count;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int updateProduct(int productId, int stock) {
        try {
            Connection con = FashionDBConnection.getConnection();
            String query = "update fashion_products SET stock=? WHERE product_id=?";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1, stock);
            pstmt.setInt(2, productId);
            int count = pstmt.executeUpdate();
            con.close();
            return count;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int deleteProduct(int productId) {
        try {
            Connection con = FashionDBConnection.getConnection();
            String query = "delete FROM fashion_products WHERE product_id=?";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1, productId);
            int count = pstmt.executeUpdate();
            con.close();
            return count;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public String viewProduct(int productId) {
        try {
            Connection con = FashionDBConnection.getConnection();
            String query = "SELECT * FROM fashion_products WHERE product_id=?";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1, productId);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return "Product ID: " + rs.getInt(1) + ", Name: " + rs.getString(2) + ", Category: " + rs.getString(3)
                        + ", Price: " + rs.getDouble(4) + ", Stock: " + rs.getInt(5);
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Product not found";
    }
}
