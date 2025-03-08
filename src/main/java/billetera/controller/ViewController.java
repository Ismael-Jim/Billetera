package billetera.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {
    @GetMapping("/login")
    public String mostrarLogin() {
        return "login";
    }

    @GetMapping("/dashboard")
    public String mostrarDashboard(Model model) {
        model.addAttribute("mensaje", "Bienvenido a tu billetera digital");
        return "dashboard";
    }

    @GetMapping("/transacciones")
    public String mostrarTransacciones(Model model) {
        // Aquí se pueden agregar atributos (por ejemplo, una lista de transacciones)
        // model.addAttribute("transacciones", transaccionService.listarTransacciones());
        return "transacciones";
    }
    @GetMapping("/index")
    public String mostrarIndex() {
        return "index";
    }
}
