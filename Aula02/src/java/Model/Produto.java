/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 *
 * @author RA21501725
 */
@Entity
@Table(name="Produto")
public class Produto {
    
    @Id
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    private int idProduto;
    private String nomeProduto;
    private String marcaProduto;
    private String medidaProduto;
    private float precoProduto;

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }
    

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getMarcaProduto() {
        return marcaProduto;
    }

    public void setMarcaProduto(String marcaProduto) {
        this.marcaProduto = marcaProduto;
    }

    public String getMedidaProduto() {
        return medidaProduto;
    }

    public void setMedidaProduto(String medidaProduto) {
        this.medidaProduto = medidaProduto;
    }

    public float getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(float precoProduto) {
        this.precoProduto = precoProduto;
    }
    
    
    
    
}
