package billetera.controller;


import billetera.service.UserService;
import billetera.service.UserService;
import billetera.model.User;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> listarUsuarios() {
        return userService.listarUsuarios();
    }

    @PostMapping
    public User guardarUsuario(@RequestBody User usuario) {
        return userService.guardarUsuario(usuario);
    }
}
