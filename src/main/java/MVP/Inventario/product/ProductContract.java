/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVP.Inventario.product;

import java.math.BigDecimal;

/**
 *
 * @author Dionicio
 */
public interface ProductContract {

    /**
     * Display info about product
     */
    interface View {

        void displayError(String error);

        String getBarcode();
        
        String getDescription();
        
        BigDecimal getPrice();
        
        
    }

    /**
     * *
     * Work with data
     */
    interface Model {

        void save(Product product);

        interface OnModelChangeListener {

            int STATUS_SAVED = 0;

            int STATUS_UPDATED = 1;

            int STATUS_DELETED = 2;

            void onChange(int type, Product product);
        }
    }

    interface Presenter {

        /**
         * Save the instance
         *
         * @param product to be save
         */
        void onSave(Product product);
        
        /**
         * 
         * @return 
         */
        Product getProductFromView();
                
    }
}
