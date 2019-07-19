package hello;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/rest")
public class FernandoController {

    @GetMapping(path = "/{var}")
    public String fernado(@PathVariable String var) {
        return "ola" + var;
    }
}
