package com.example.demo.controller;

@RestController
@RequestMapping(value = "/api/v1/products")
public class ProductController {

    @Autowired
    ProductServiceImpl productService;

    @GetMapping
    public ResponseEntity<List<Product>> getProducts(){
        return ResponseEntity.ok(productService.getProducts());
    }

    @PostMapping
    public ResponseEntity<Product> getProducts(@RequestBody Product product) throws ResourceAlreadyFound {
        return ResponseEntity.ok(productService.addProduct(product));
    }
}

