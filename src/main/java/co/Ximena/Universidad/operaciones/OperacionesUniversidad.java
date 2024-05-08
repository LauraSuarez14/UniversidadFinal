package co.Ximena.Universidad.operaciones;

import co.Ximena.Universidad.entidad.Universidad;

import java.util.List;

public class OperacionesUniversidad {
    public Universidad crear(Universidad universidad);
    public Universidad actualizar (Universidad universidad);
    public void borrar (Universidad universidad );
    public List<Universidad>consultarT;
    public Universidad consultarPk(int pk );
}
