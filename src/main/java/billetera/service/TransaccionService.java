package billetera.service;



import billetera.model.Moneda;

import billetera.model.Transaccion;
import billetera.repository.TransaccionRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TransaccionService {
    private final TransaccionRepository transaccionRepository;

    public TransaccionService(TransaccionRepository transaccionRepository) {
        this.transaccionRepository = transaccionRepository;
    }

    public List<Transaccion> listarTransacciones() {
        return transaccionRepository.findAll();
    }

    public Transaccion guardarTransaccion(Transaccion transaccion) {
        return transaccionRepository.save(transaccion);
    }
}
