package billetera.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "moneda ")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Moneda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String simbolo;
}
