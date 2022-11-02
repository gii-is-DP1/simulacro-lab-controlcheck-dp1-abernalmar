package org.springframework.samples.petclinic.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductService {
	
	//Ej5
	@Autowired
	ProductRepository productRepo;
	
    public List<Product> getAllProducts(){
    	List<Product> p = productRepo.findAll();
        return p;
    }
    //
    

    //Ej6
    public ProductType getProductType(String typeName) {
    	ProductType tp = productRepo.findProductType(typeName);
        return tp;
    }
    //
    
    //Ej8
    public List<Product> getProductsCheaperThan(double price){
    	List<Product> p = this.productRepo.findByPriceLessThan(price);
    	return p;
    }
    //
    
    //Ej 10

    //Todos los métodos que sean de crear, borrar, editar y guardar necesitan el Transactional
    @Transactional
    public Product save(Product p){
        return productRepo.save(p);       
    }
    //
    
    //Ej 9
    public List<ProductType> findAllProductTypes(){
    	List<ProductType> p = productRepo.findAllProductTypes();
    	return p;
    }
    //

    
}
