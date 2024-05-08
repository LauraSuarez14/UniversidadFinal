package co.Ximena.Universidad.controlador;

import co.Ximena.Universidad.servicio.ServicioUniversidad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControladorUniversidad {
    @Autowired
    ServicioUniversidad servicioUniversidad;

   @GetMapping
    public String ListarUniversidad (Model model) {
    model

   }

}
