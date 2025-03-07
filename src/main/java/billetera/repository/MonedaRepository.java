package billetera.repository;



import billetera.model.Moneda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MonedaRepository extends JpaRepository<Moneda, Long> { }
