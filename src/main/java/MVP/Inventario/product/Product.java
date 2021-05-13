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
public class Product {
    
    private String id;
    
    private String barcode;
    
    private String name;
    
    private BigDecimal unitPrice;
    
    private boolean includeTaxes;

    public Product() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public boolean includeTaxes() {
        return includeTaxes;
    }

    public void setIncludeTaxes(boolean includeTaxes) {
        this.includeTaxes = includeTaxes;
    }
    
    
    
}
