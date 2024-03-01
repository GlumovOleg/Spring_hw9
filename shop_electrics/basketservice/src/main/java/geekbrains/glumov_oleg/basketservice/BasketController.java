package geekbrains.glumov_oleg.basketservice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@RequestMapping("/products")
public interface BasketController {
    @GetMapping("/greeting/neworder")
    ResponseEntity<String> greeting(@PathVariable("neworder") String ordername);

    @GetMapping("/oder")
    public ResponseEntity<List<Product>> getProducts();
}

