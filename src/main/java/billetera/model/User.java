package billetera.model;
import billetera.model.Transaccion;
import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String email;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<Transaccion> transacciones;
}
