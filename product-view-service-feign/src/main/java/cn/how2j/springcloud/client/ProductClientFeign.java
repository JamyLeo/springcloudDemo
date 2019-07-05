package cn.how2j.springcloud.client;

import cn.how2j.springcloud.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@FeignClient(value = "PRODUCT-DATA-SERVICE",fallback = ProductClientFeignHystrix.class)
public interface ProductClientFeign {
    @GetMapping("/products")
    public List<Product> listProdcuts();
}