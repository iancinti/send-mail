# send-mail

## Descripción

send-mail es una aplicación desarrollada en Kotlin con Spring Boot que permite enviar correos electrónicos de forma sencilla y personalizada. La aplicación consta de las siguientes partes:

- **Config**: Contiene la configuración para el envío de correos electrónicos.
- **Controller**: Maneja las solicitudes relacionadas con el envío de correos electrónicos.
- **Model**: Definicion de clase de modelo, `EmailResponse`.
- **Service**: Interfaz y clase de servicio para enviar correos electrónicos.

## Características

- Personalización del destinatario, asunto y cuerpo del correo.
- Integración con Gmail y facil configuracion para otros proveedores de correo electrónico.

## Instalación

1. Clona este repositorio en tu máquina local.
2. Importa el proyecto en tu IDE favorito.
3. Configura la aplicación, agrega tus credenciales gmail en los archivos `application.properties` y `sendEmailConfig`.
4. Ejecuta la aplicación.

## Configuración del Correo Electrónico

La configuración del correo electrónico se realiza en el archivo `application.properties`. Asegúrate de configurar correctamente los siguientes parámetros:

- `spring.mail.host=smtp.gmail.com`
- `spring.mail.port=587`
- `spring.mail.username=tucorreo@gmail.com`
- `spring.mail.password=tucontraseña`
- `spring.mail.properties.mail.smtp.auth=true`
- `spring.mail.properties.mail.smtp.starttls.enable=true`

## Dependencias

- Kotlin
- Spring Boot
- Spring Boot Starter Mail

 
## Ejemplo de Uso

Una vez que la aplicación esté en ejecución, puedes enviar correos electrónicos haciendo una solicitud POST a /send-email con el siguiente cuerpo JSON:

```json
{
  "to": "destinatario@example.com",
  "subject": "Asunto del correo",
  "text": "Contenido del correo electrónico"
}
