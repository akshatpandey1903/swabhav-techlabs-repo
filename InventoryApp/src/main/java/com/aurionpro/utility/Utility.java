package com.aurionpro.utility;

import com.aurionpro.model.Product;
import com.aurionpro.model.ProductManager;
import java.util.List;

public class Utility {
    
    public static int getTotalNumberOfProducts(ProductManager productManager) {
        List<Product> products = productManager.getAllProducts();
        return products.size();
    }

    public static double getTotalStockValue(ProductManager productManager) {
        List<Product> products = productManager.getAllProducts();
        double totalValue = 0;
        for (Product product : products) {
            totalValue += product.getQuantity() * product.getPrice();
        }
        return totalValue;
    }
}




