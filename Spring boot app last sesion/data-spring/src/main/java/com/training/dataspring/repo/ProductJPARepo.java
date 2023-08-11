package com.training.dataspring.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface ProductJPARepo extends JpaRepository<Product,Integer> {

    public List<Product> findProductByName(String name);

    public List<Product> findProductByNameContaining(String name);

    public List<Product> findProductByNameStartingWith(String name);

    public List<Product> findProductByPrice(Double price);
    public List<Product> findProductByPriceGreaterThan(Double price);


    public List<Product> findProductByNameContainingAndPriceGreaterThan
            (String name,double price);
    public List<Product> findProductByNameContainingOrPriceGreaterThan
            (String name,double price);


    @Query("select p from Product p where p.price > ?1")
    public List<Product> findProductByPriceMoreThan(double price);

    @Query(value = "select * from Product p where p.price > ?1",nativeQuery = true)
    public List<Product> findProductByPriceMoreThanNative(double price);

    @Query(value = "select p.category as category,count(p.id) " +
            "as itemCount from Product p group by p.category")
    public List<CategoryCountAggregate> aggregateCategoryCount();

}
