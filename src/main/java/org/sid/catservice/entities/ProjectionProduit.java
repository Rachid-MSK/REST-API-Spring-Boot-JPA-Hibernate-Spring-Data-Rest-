package org.sid.catservice.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "P1", types = Produit.class)
public interface ProjectionProduit {
    public double getPrice();
    public String getDesignation();
}
