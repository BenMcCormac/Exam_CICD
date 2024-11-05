package ie.atu.lab_exam_cicd_benmcc;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController
{
    public List<Product> product = new ArrayList<>();

    @GetMapping("/list")
    public List<Product> getProduct()
    {
        return product;
    }
}
