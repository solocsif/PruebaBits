Feature: rellenar datos contacto
Scenario: enviar los datos de contacto
Given abrir el navegador
When ingresar a la url
Then hacer scroll hasta el formulario de contacto
And rellenar los datos obligatorios
And dar click en validar el capcha
And dar click en el boton enviar
