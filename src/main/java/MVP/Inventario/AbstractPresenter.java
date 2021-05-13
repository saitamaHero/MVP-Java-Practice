/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVP.Inventario;

/**
 *
 * @author Dionicio
 */
public abstract class AbstractPresenter<V, M> {
    
    private V view;
    private M model;
    
    protected  void bindView(V view) 
    {
        if (view != null)
        {
            this.view = view;
        }
    }
    
    protected void bindModel(M model)
    {
        if (model != null)
        {
            this.model = model;
        }
    }

    public V getView() {
        return view;
    }

    public M getModel() {
        return model;
    }
    
    
}
