package billetera.service;



import billetera.model.Transaccion;
import billetera.repository.TransaccionRepository;
import org.springframework.stereotype.Service;
import java.math.BigDecimal;
import java.util.List;

@Service
public class BilleteraService {
    private final TransaccionRepository transaccionRepository;

    public BilleteraService(TransaccionRepository transaccionRepository) {
        this.transaccionRepository = transaccionRepository;
    }

    /**
     * Calcula el balance total usando un switch-case.
     * Suma el monto si es "INGRESO" y lo resta si es "EGRESO".
     */
    public BigDecimal calcularBalanceConCase() {
        List<Transaccion> transacciones = transaccionRepository.findAll();
        BigDecimal balance = BigDecimal.ZERO;

        for (Transaccion t : transacciones) {
            switch (t.getTipo()) {
                case "INGRESO":
                    balance = balance.add(t.getMonto());
                    break;
                case "EGRESO":
                    balance = balance.subtract(t.getMonto());
                    break;
                default:
                    System.out.println("Tipo de transacción desconocido: " + t.getTipo());
                    break;
            }
        }
        return balance;
    }
}
