package geekbrains.glumov_oleg.basketservice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BasketControllerImpl implements BasketController {
    @Override
    public ResponseEntity<String> greeting(String ordername) {
        return ResponseEntity.ok("Корзина товаров создана" + ordername);
    }

    @GetMapping("/orders")
    public ResponseEntity<List<Product>> getProducts() {

        return ResponseEntity.ok(generateProductList());
    }

    private static List<Product> generateProductList(){
        final List<Product> listProduct = new ArrayList<>();
        listProduct.add(1, new Product("product1", 3, 54));
        listProduct.add(2, new Product("product2", 1, 75.6));

        return listProduct;
    }

}
