package co.Ximena.Universidad.entidad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

@Data
@Entity
@Table(name=Universidad)
@Builder
public class Universidad {
    @Id
    @Column(name="u_nit")
    private int nit;

    @Column(name="u_direccion")
    private int direccion;

    @Column("u_careras")
    private String carreras;

    @Column ("u_facultades")
    private String facultades;

    @Column ("u_sedes")
    private String sedes;

}
