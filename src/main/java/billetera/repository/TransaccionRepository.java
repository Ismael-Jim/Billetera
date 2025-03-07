package billetera.repository;



import billetera.model.Transaccion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransaccionRepository extends JpaRepository<Transaccion, Long> { }
