package com.training.dataspring.test;

import com.training.dataspring.repo.Product;
import com.training.dataspring.repo.ProductJPARepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class DataSpringExample implements CommandLineRunner {

    private final ProductJPARepo productJPARepo;

//    @Autowired
    public DataSpringExample(ProductJPARepo productJPARepo) {
        this.productJPARepo = productJPARepo;
    }

//    @Autowired
//    private ProductJPARepo productJPARepo;


    @Override
    public void run(String... args) throws Exception {



        productJPARepo
                .findAll()
                .stream()
                .forEach(System.out::println);


        productJPARepo
                .findById(2)
                .ifPresent(System.out::println);

        System.out.println("========================");
        productJPARepo
                .findProductByName("Candy")
                .forEach(System.out::println);
        System.out.println("========================");

        productJPARepo
                .findProductByNameContaining("Samsung")
                .forEach(System.out::println);
        System.out.println("========================");

        productJPARepo
                .findProductByNameStartingWith("S")
                .forEach(System.out::println);

        System.out.println("========================");

        productJPARepo
                .findProductByPrice(10.0)
                .forEach(System.out::println);

        System.out.println("========================");
        productJPARepo
                .findProductByPriceGreaterThan(40.0)
                .forEach(System.out::println);
        System.out.println("========================");
        productJPARepo
                .findProductByNameContainingAndPriceGreaterThan("i",40.0)
                .forEach(System.out::println);

        System.out.println("========================");
        productJPARepo
                .findProductByNameContainingOrPriceGreaterThan("i",40.0)
                .forEach(System.out::println);
        System.out.println("========================");

        productJPARepo
                .findProductByPriceMoreThan(50.0)
                .forEach(System.out::println);
        System.out.println("========================");

        productJPARepo
                .findProductByPriceMoreThanNative(50.0)
                .forEach(System.out::println);

        System.out.println("========================");

        productJPARepo
                .aggregateCategoryCount()
                .forEach(agg->
                        System.out.printf("Category: %s #of Products %d\n"
                                ,agg.getCategory(),agg.getItemCount()));


        productJPARepo
                .findAll()
                .stream()
                .collect(Collectors.groupingBy(p->p.getCategory(),Collectors.counting()))
                .entrySet()
                .forEach(System.out::println);
    }


}
