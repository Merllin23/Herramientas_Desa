## Herramientas de Desarollo

# Prueba de versiones(Version 1)

### Intregrandes:

- Patrick Calderon

- Abel Vargas

## Ideas
1. Agregar un ejecutor desde GitHub

Actualmente, para probar el proyecto es necesario descargarlo y ejecutarlo de manera local. Una mejora interesante sería configurar un workflow en GitHub Actions que permita ejecutar el proyecto directamente desde el repositorio. Esto le daría al profesor y a cualquier persona interesada la posibilidad de ver cómo funciona la aplicación sin necesidad de instalar dependencias adicionales en su máquina.
Además, con esta configuración estaríamos aplicando prácticas de integración continua (CI/CD), lo que no solo mejora la experiencia del usuario, sino que también demuestra competencias en entornos de desarrollo modernos y automatización.

2. Instrucciones claras de ejecución local con Gradle

Aunque Gradle es una herramienta bastante estándar en proyectos Java, no todas las personas que revisen el proyecto necesariamente estarán familiarizadas con su uso. Por ello, es importante añadir un apartado en el README con instrucciones claras y detalladas sobre cómo clonar el repositorio, compilar el código y ejecutar la aplicación con Gradle.
Esto asegura que cualquier usuario, sin importar su nivel de experiencia, pueda correr el programa sin contratiempos. También es una buena práctica de documentación, ya que permite que el proyecto sea reproducible y accesible para nuevos desarrolladores en el futuro.

3. Incluir badges en el README

El README puede enriquecerse con el uso de badges (insignias visuales) que aporten información rápida sobre el estado del proyecto. Por ejemplo, se pueden incluir badges de:

Estado de la compilación (Build passing/failing).

Versión de Gradle utilizada.

Cobertura de pruebas unitarias.

Lenguaje o tecnologías empleadas.

Estos elementos no solo hacen que el README sea más atractivo visualmente, sino que también transmiten un aire de profesionalismo y transparencia, mostrando de un vistazo el estado actual del proyecto y sus tecnologías principales.

