package app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/pow2/{number}")
    public int pow(@PathVariable("number") int number)
    {
        return  number*number;
    }

    @GetMapping("/add/{number1}/{number2}")
    public int pow(@PathVariable("number1") int number1, @PathVariable("number2") int number2)
    {
        return  number1+number2;
    }
}
