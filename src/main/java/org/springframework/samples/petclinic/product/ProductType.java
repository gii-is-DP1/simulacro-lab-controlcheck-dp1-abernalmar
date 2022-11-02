package org.springframework.samples.petclinic.product;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.samples.petclinic.model.BaseEntity;

import lombok.Getter;
import lombok.Setter;
//Ej2

@Getter
@Setter
@Entity
@Table(name = "product_type")
public class ProductType extends BaseEntity {
    //Integer id;
    
    @NotNull
    @Size(min=3, max=50)
    @Column(name = "name", unique=true)
    String name;
//
}
