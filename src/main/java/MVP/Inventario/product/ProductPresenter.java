/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVP.Inventario.product;

import MVP.Inventario.AbstractPresenter;

/**
 *
 * @author Dionicio
 */
public class ProductPresenter extends AbstractPresenter<ProductContract.View, ProductContract.Model> implements ProductContract.Presenter, ProductContract.Model.OnModelChangeListener {

    public ProductPresenter(ProductContract.View mainView) {
        //this.mainView = mainView;
        //this.model = new ProductModel(this);
        this.bindView(mainView);
        this.bindModel(new ProductModel(this));
    }
    
    @Override
    public void onSave(Product product) {

        if (product == null) {
            getView().displayError("Error no hay un producto para guardar");
            return;
        }

        getModel().save(product);
    }

    @Override
    public void onChange(int type, Product product) {
        if (STATUS_SAVED == type)
        {
            getView().displayError(String.format("Producto \"%s\" Precio Unitario %.2f", product.getName(), product.getUnitPrice()));
        }
    }

    @Override
    public Product getProductFromView() {
        if (getView() != null)
        {
            Product product = new Product();
                    
            product.setBarcode(getView().getBarcode());
            product.setName(getView().getDescription());
            product.setUnitPrice(getView().getPrice());
                    
            return product;
        }
        
        return null;
    }
}
