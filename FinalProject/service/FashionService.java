package com.evergent.corejava.service;

import com.evergent.corejava.bean.*;
import com.evergent.corejava.DAO.*;

public class FashionService {
    FashionDAO fashionDAO = new FashionDAO();

    public int addProduct(int productId, String productName, String category, double price, int stock) {
        FashionBean fashionBean = new FashionBean();
        fashionBean.setProductId(productId);
        fashionBean.setProductName(productName);
        fashionBean.setCategory(category);
        fashionBean.setPrice(price);
        fashionBean.setStock(stock);
        return fashionDAO.addProduct(fashionBean);
    }

    public void updateProduct(int productId, int stock) {
        fashionDAO.updateProduct(productId, stock);
    }

    public void deleteProduct(int productId) {
        fashionDAO.deleteProduct(productId);
    }

    public String viewProduct(int productId) {
        return fashionDAO.viewProduct(productId);
    }
}
