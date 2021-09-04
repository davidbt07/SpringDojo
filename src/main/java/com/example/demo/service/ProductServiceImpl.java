package com.example.demo.service;

@Service
public class ProductServiceImpl implements  ProductService{
    @Autowired
    ProductRepository productRepository;

    @Override
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product addProduct(Product product) throws ResourceAlreadyFound {
        if(!existProduct(product.getId())){
            Product newProduct = productRepository.save(product);
            return newProduct;
        }else throw new ResourceAlreadyFound("AlreadyFound");
    }

    @Override
    public boolean existProduct(Long id) {
        return (productRepository.findById(id)).isEmpty()?false:true;
    }
    @GetMapping(path = "/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable("id") Long id) throws ResourceNotFound {
        return ResponseEntity.ok(productService.getProduct(id));
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<?> deleteProduct(@PathVariable("id") Long id) throws ResourceNotFound {
        productService.delectBtyId(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @Override
    public Product getProduct(Long id) throws ResourceNotFound {
        return productRepository.findById(id).orElseThrow(ResourceNotFound::new);
    }

    @Override
    public void delectBtyId(Long id) throws ResourceNotFound {
        if(existProduct(id)){
            productRepository.deleteById(id);
        }else throw new ResourceNotFound("No found");
    }

}

