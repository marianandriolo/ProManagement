/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labs.pm.data;

/**
 *
 * @author Usuario
 */
public class ProductManagerException extends Exception {

    private static final long serialVersionUID = 1L;
    public ProductManagerException(){
        super();
    }
    public ProductManagerException(String message){
        super(message);
    }
    public ProductManagerException(String message, Throwable cause){
        super(message, cause);
    }
}
