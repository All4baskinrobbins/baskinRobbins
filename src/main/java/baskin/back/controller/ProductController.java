package baskin.back.controller;


import baskin.back.DTO.ProductFilterDTO;
import baskin.back.Mapper.ProductFilterMapper;
import baskin.back.domain.Product;
import baskin.back.DTO.ProductDTO;
import baskin.back.service.ProductService;
import org.apache.catalina.connector.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("product")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @PostMapping("")
    public ResponseEntity<Map<String, Object>> createProduct(@RequestBody Product product) {
        productService.createProduct(product);
        Map<String, Object> result = new HashMap<>();
        result.put("statusCode", "201");
        result.put("message", "CREATE_DONE");
        return ResponseEntity.ok().body(result);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Map<String, Object>> findById(@PathVariable("id") Long id) {
        ProductDTO product = productService.findById(id);
        Map<String, Object> result = new HashMap<>();
        result.put("statusCode","200");
        result.put("data", product);
        return ResponseEntity.ok().body(result);
    }

    @GetMapping("category/{category_id}")
    public ResponseEntity<Map<String, Object>> findByCategoryId(@PathVariable Long category_id){
        List<ProductDTO> productList = productService.findByCategoryId(category_id);
        Map<String, Object> result = new HashMap<>();
        result.put("statusCode", "200");
        result.put("data", productList);
        return ResponseEntity.ok().body(result);
    }

    @GetMapping("all")
    public ResponseEntity<Map<String, Object>> findAll() {
        List<ProductDTO> productList = productService.findAll();
        Map<String, Object> result = new HashMap<>();
        result.put("statusCode", "200");
        result.put("data", productList);
        return ResponseEntity.ok().body(result);
    }

//    @GetMapping("")
//    public ResponseEntity<Map<String, Object>> findById(@RequestParam("name")String name){
//        List<ProductDTO> productList = productService.findByName(name);
//        Map<String, Object> result = new HashMap<>();
//        result.put("statusCode", "200");
//        result.put("data", productList);
//        return ResponseEntity.ok().body(result);
//    }

    @PostMapping("filter")
    public ResponseEntity<Map<String, Object>> findProductByFilter(@RequestBody HashMap<String, Object> param){
        List<ProductFilterDTO> productList = productService.findProductByFilter(param);
        Map<String, Object> result = new HashMap<>();
        result.put("statusCode", "200");
        result.put("data", productList);
        return ResponseEntity.ok().body(result);
    }
}
