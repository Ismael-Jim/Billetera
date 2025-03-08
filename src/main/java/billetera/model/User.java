package billetera.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Table(name = "usuario")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String email;
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    // Se usa "mappedBy = 'user'" para indicar que el lado inverso está en el atributo "user" de Transaccion
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Transaccion> transacciones;
}
