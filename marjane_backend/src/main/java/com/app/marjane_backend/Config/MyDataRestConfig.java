/*package com.app.marjane_backend.Config;

import com.app.marjane_backend.entities.Product;
import com.app.marjane_backend.entities.PromotionCategory;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Configuration
public class MyDataRestConfig implements RepositoryRestConfigurer {
    //Disable Http methods for Product
    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
        HttpMethod[] unsupporyedActions = {HttpMethod.POST, HttpMethod.PUT, HttpMethod.DELETE};
        config.getExposureConfiguration()
                .forDomainType(Product.class)
                .withItemExposure((metdata, httpMethods) -> httpMethods.disable(unsupporyedActions))
                .withCollectionExposure(((metdata, httpMethods) -> httpMethods.disable(unsupporyedActions)));



        //Disable Http methods for ProductCategory
        config.getExposureConfiguration()
                .forDomainType(PromotionCategory.class)
                .withItemExposure((metdata, httpMethods) -> httpMethods.disable(unsupporyedActions))
                .withCollectionExposure(((metdata, httpMethods) -> httpMethods.disable(unsupporyedActions)));

    }


}*/
