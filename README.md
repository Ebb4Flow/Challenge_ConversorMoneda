<!DOCTYPE html>
<html lang="es">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1" />
</head>
<body>

  <h1>💱 Conversor de Monedas en Java</h1>

  <section>
    <h2>📌 Descripción</h2>
    <p>
      Este proyecto es una aplicación de consola desarrollada en Java que permite convertir entre diferentes monedas: Pesos Chilenos (CLP), Reales Brasileños (BRL) y Dólares Estadounidenses (USD).
      Utiliza una API externa para obtener las tasas de cambio actualizadas y realizar las conversiones.
    </p>
  </section>

  <section>
    <h2>⚙️ Requisitos</h2>
    <ul>
      <li>Java 8 o superior</li>
      <li>Conexión a Internet para acceder a la API de tasas de cambio</li>
      <li>Un IDE o editor de texto como IntelliJ IDEA, Eclipse o Visual Studio Code</li>
      <li><a href="https://github.com/Ebb4Flow/Challenge_ConversorMoneda" target="_blank" rel="noopener noreferrer">GitHub - Repositorio</a></li>
    </ul>
  </section>

  <section>
    <h2>🚀 Instalación</h2>
    <ol>
      <li>Clona este repositorio en tu máquina local:</li>
    </ol>
    <pre><code>git clone https://github.com/Ebb4Flow/Challenge_ConversorMoneda.git</code></pre>
    <ol start="2">
      <li>Abre el proyecto en tu IDE favorito.</li>
      <li>Ejecuta la clase <code>Principal.java</code> para iniciar la aplicación.</li>
    </ol>
  </section>

  <section>
    <h2>🧭 Uso</h2>
    <p>Al ejecutar la aplicación, se presentará un menú con las siguientes opciones:</p>
    <ul>
      <li>Mostrar tabla de monedas</li>
      <li>Convertir Pesos Chilenos a Reales Brasileños</li>
      <li>Convertir Reales Brasileños a Pesos Chilenos</li>
      <li>Convertir Reales Brasileños a Dólares</li>
      <li>Convertir Dólares a Reales Brasileños</li>
      <li>Convertir Dólares a Pesos Chilenos</li>
      <li>Convertir Pesos Chilenos a Dólares</li>
      <li>Salir del sistema</li>
    </ul>
    <p>
      Selecciona la opción deseada ingresando el número correspondiente. La aplicación solicitará el monto a convertir y mostrará el resultado en la moneda de destino.
    </p>
  </section>

  <section>
    <h2>🛠️ Estructura del Proyecto</h2>
    <p>El proyecto está organizado de la siguiente manera:</p>
    <ul>
      <li><code>src/</code>: Contiene el código fuente del proyecto.</li>
      <li><code>Principal.java</code>: Clase principal que ejecuta la aplicación.</li>
      <li><code>ConsultaAPI.java</code>: Clase encargada de interactuar con la API para obtener las tasas de cambio.</li>
      <li><code>LectorListado.java</code>: Clase que muestra la tabla de monedas disponibles.</li>
    </ul>
    <p><a href="https://github.com/Ebb4Flow/Challenge_ConversorMoneda" target="_blank" rel="noopener noreferrer">Ver en GitHub</a></p>
  </section>

  <section>
    <h2>🧪 Contribuciones</h2>
    <p>¡Las contribuciones son bienvenidas! Si deseas mejorar este proyecto, por favor sigue estos pasos:</p>
    <ol>
      <li>Haz un fork de este repositorio.</li>
      <li>Crea una nueva rama (<code>git checkout -b feature-nueva-funcionalidad</code>).</li>
      <li>Realiza tus cambios y haz commit de ellos (<code>git commit -am 'Añadir nueva funcionalidad'</code>).</li>
      <li>Haz push a la rama (<code>git push origin feature-nueva-funcionalidad</code>).</li>
      <li>Crea un nuevo Pull Request.</li>
    </ol>
  </section>

</body>
</html>
