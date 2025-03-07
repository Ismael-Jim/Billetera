<html>
<body>
<h2>Hello World!</h2>
</body>
</html>


finanzas/                        // Nombre del proyecto
├── pom.xml                     // Configuración Maven (incluye Thymeleaf)
├── README.md                   // Documentación del proyecto
└── src/
    ├── main/
    │   ├── java/
    │   │   └── biletera/
    │   │               ├── FinanzasApplication.java      // Clase principal
    │   │               ├── controller/
    │   │               │   ├── UsuarioController.java      // Endpoints REST para usuarios
    │   │               │   ├── TransaccionController.java  // Endpoints REST para transacciones y balance
    │   │               │   └── ViewController.java         // Controlador de vistas (Thymeleaf)
    │   │               ├── model/
    │   │               │   ├── Usuario.java                // Entidad Usuario
    │   │               │   ├── Moneda.java                 // Entidad Moneda
    │   │               │   └── Transaccion.java            // Entidad Transacción
    │   │               ├── repository/
    │   │               │   ├── UsuarioRepository.java      // Acceso a la BD para usuarios
    │   │               │   ├── MonedaRepository.java       // Acceso a la BD para monedas
    │   │               │   └── TransaccionRepository.java  // Acceso a la BD para transacciones
    │   │               └── service/
    │   │                   ├── UsuarioService.java         // Lógica de negocio para usuarios
    │   │                   ├── TransaccionService.java     // Lógica de negocio para transacciones
    │   │                   └── BilleteraService.java       // Cálculo del balance (incluye método con switch-case)
    │   └── resources/
    │       ├── application.properties                    // Configuración de BD, etc.
    │       ├── static/                                   // Archivos estáticos (CSS, JS, imágenes)
    │       │   ├── css/
    │       │   │   └── styles.css
    │       │   └── js/
    │       │       └── script.js
    │       └── templates/                                // Vistas Thymeleaf (HTML)
    │           ├── login.html                          // Página de Login/Registro
    │           ├── dashboard.html                      // Dashboard con balance y operaciones
    │           └── transacciones.html                  // Vista para listar transacciones
    └── test/
        └── java/
            └── com/
                └── ejemplo/
                    └── finanzas/
                        └── (clases de test)
