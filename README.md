## Reto Técnico.

Este proyecto es una automatizacion del reto técnico solicitado por Choucair.


### Funcionalidad automatizada

1. Login en OrangeHRM con usuario y contraseña.
2. Navegación al módulo **Reclutamiento**.
3. Registro de un nuevo candidato: **Eduardo Enrique**.
4. Validación del estado final del candidato como **Contratado**.

### Cómo ejecutar

1. Clona este repositorio.
2. Ejecuta:

```bash
mvn clean verify
```

1. Abre el reporte:

```
target/site/serenity/index.html
```

---

### Estructura del proyecto

- `tasks/`: acciones realizadas por los actores o quien ejecuta la accion.
- `ui/`: localizadores de la interfaz.
- `questions/`: validaciones en pantalla.
- `stepdefinitions/`: pasos de los escenarios.
- `features/`: Caracteristicas.

---

### Datos automatizados

- **Nombre:** Eduardo Enrique  
- **Correo:** eduardo.enrique@example.com

---

Gracias por la oportunidad! 