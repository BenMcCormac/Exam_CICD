package ie.atu.lab_exam_cicd_benmcc;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController
{
    public List<Product> product = new ArrayList<>();

    @GetMapping("/list")
    public List<Product> getProduct()
    {
        return product;
    }

    @PostMapping( "/product")
    public List postProduct(@RequestBody @Valid Product newProduct)
    {
        product.add(newProduct);
        return product;
    }
}
