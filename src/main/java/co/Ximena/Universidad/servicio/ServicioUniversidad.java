package co.Ximena.Universidad.servicio;

import co.Ximena.Universidad.entidad.Universidad;
import co.Ximena.Universidad.operaciones.OperacionesUniversidad;
import co.Ximena.Universidad.repositorio.RepositorioUniversidad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioUniversidad implements OperacionesUniversidad {
    @Autowired
    RepositorioUniversidad repositorioUniversidad;

    public Universidad crear (Universidad universidad) {
        return repositorioUniversidad.save(universidad);

    }
    public Universidad actualizar(Universidad universidad) {
        if(this.consultarPk(universidad.getNit()) != null)
            return repositorioUniversidad.save(universidad);
        return null;
    }
    public void borrar(Universidad universidad) {
    repositorioUniversidad.delete(universidad);
    }
    public List <Universidad> consultarT() {
        return repositorioUniversidad.findAll()
    }

    @Override
    public Universidad consultarPk(int pk) {
        Universidad universidad =repositorioUniversidad.findById(pk).orElse(null);

        return null;
    }
}
