package com.deliventory.v1.catalogue.Controller;

import com.deliventory.v1.catalogue.ProductSummary;
import com.deliventory.v1.catalogue.Repository.CatalogueSummaryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1")
public class CatalogueController {
    @Autowired
    CatalogueSummaryRepo catalogueSummaryRepo;

    //@RequestMapping(path =)
    @GetMapping(path =  "/products")
    public List<ProductSummary> getProductSummaryList(){
        return catalogueSummaryRepo.findAll();
    }

    @PostMapping(path = "/product/create")
    public Long createProductSummary(@RequestBody ProductSummary productSummary) {
        return catalogueSummaryRepo.save(productSummary).getId();
    }
   /* @RequestMapping(path = "/product/{id}")
    public ProductSummary getProductSummary(@RequestParam Long id){
        return catalogueSummaryRepo.findById(id);
    }
    **/
}
