package billetera.controller;



import billetera.model.Transaccion;
import billetera.service.BilleteraService;
import billetera.service.TransaccionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/api/transacciones")
public class TransaccionController {
    private final TransaccionService transaccionService;
    private final BilleteraService billeteraService;

    public TransaccionController(TransaccionService transaccionService, BilleteraService billeteraService) {
        this.transaccionService = transaccionService;
        this.billeteraService = billeteraService;
    }

    @GetMapping
    public List<Transaccion> listarTransacciones() {
        return transaccionService.listarTransacciones();
    }

    @PostMapping
    public ResponseEntity<Transaccion> guardarTransaccion(@RequestBody Transaccion transaccion) {
        Transaccion nuevaTransaccion = transaccionService.guardarTransaccion(transaccion);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevaTransaccion);
    }

    @GetMapping("/balance")
    public BigDecimal obtenerBalance() {
        return billeteraService.calcularBalanceConCase();
    }
}
