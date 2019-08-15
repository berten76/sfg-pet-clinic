package sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import sfgpetclinic.services.map.VetServiceMap;

@Controller
public class VetController {

    private VetServiceMap vetServiceMap;

    public VetController(VetServiceMap vetServiceMap) {
        this.vetServiceMap = vetServiceMap;
    }

    @RequestMapping({"/vets", "/vets/index", "vets/index.html"})
    public String listVets(){

        return "vets/index";
    }
}
