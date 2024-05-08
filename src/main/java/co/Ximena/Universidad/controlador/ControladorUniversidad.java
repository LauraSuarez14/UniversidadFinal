package co.Ximena.Universidad.controlador;

import co.Ximena.Universidad.entidad.Universidad;
import co.Ximena.Universidad.servicio.ServicioUniversidad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControladorUniversidad {
    @Autowired
    ServicioUniversidad servicioUniversidad;

   @GetMapping({"/universidad/lista"})
    public String ListarUniversidad (Model model) {
        model.addAttribute("listaUniversidadT", servicioUniversidad.consultarT);
       for(Universidad laUni: servicioUniversidad.consultarT()) {
            System.out.println(laUni);
       }





   }

}
