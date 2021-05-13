/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVP.Inventario.product;

import java.util.ArrayList;

/**
 *
 * @author Dionicio
 */
public class ProductModel implements ProductContract.Model{

    private ProductContract.Model.OnModelChangeListener listener;

    private ArrayList<Product> productList;
    
    public ProductModel(OnModelChangeListener listener) {
        this.productList = new ArrayList<>();
        this.listener = listener;
        
    }
    
    
    @Override
    public void save(Product product) {
        int previousSize = this.productList.size();
        
        if (product != null) {
            productList.add(product);
        }
        
        if (this.productList.size() > previousSize) {
            this.listener.onChange(OnModelChangeListener.STATUS_SAVED, product);
        }
    }
    
}
