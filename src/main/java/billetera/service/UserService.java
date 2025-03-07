package billetera.service;

import billetera.model.User;
import billetera.repository.UserRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> listarUsuarios() {
        return userRepository.findAll();
    }

    public User guardarUsuario(User usuario) {
        return userRepository.save(usuario);
    }
}
