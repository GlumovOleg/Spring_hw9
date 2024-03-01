package geekbrains.glumov_oleg.productservice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    //    @PostMapping("/create")
//    @RequestMapping(value = "/products/create", method = RequestMethod.POST)

    @PostMapping("/create")
    public ResponseEntity<String> create (@RequestBody Product product){
            product = new Product("product", 3, 35);
        return ResponseEntity.ok("Товар успешно создан" + product);
    }

    @PostMapping("/delete")
    public ResponseEntity<String> delete (@RequestBody Product product){
        product = new Product("product", 3, 35);
        return ResponseEntity.ok("Товар успешно удалён" + product);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Product>> getProducts() {
        //Получение списка задач
        return ResponseEntity.ok(genareteProductList());
    }

    private static List<Product> genareteProductList() {
        final List<Product> list = new ArrayList<>();
        list.add(new Product("product", 31, 75));
        list.add(new Product("product2", 24, 35.7));
        list.add(new Product("product3", 33, 54));

        return list;
    }

}
