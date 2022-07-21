package pl.altkom.nextconf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NamesController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/names")
    public Name getNames() {
        return new Name(configuration.getFirstName(), configuration.getLastName());
    }

}
