package billetera.model;

import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "transaccion")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Transaccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal monto;
    private LocalDateTime fecha;

    // "INGRESO" o "EGRESO"
    private String tipo;

    // Relación con User y Moneda
    // El atributo se llama "user" para coincidir con el mappedBy en la entidad User
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "moneda_id")
    private Moneda moneda;

    // Opcional: una descripción para mostrar en el dashboard
    private String descripcion;
}
