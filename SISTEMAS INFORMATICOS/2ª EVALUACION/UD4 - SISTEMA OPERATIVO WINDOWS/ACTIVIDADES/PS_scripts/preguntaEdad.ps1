# Solicitamos al usuario que introduzca su nombre
# Solicitamos al usuario que introduzca su nombre y apellido
$nombreApellido = Read-Host "Por favor, introduce tu nombre y apellido"

# Solicitamos al usuario que introduzca su edad
$edad = Read-Host "¿Cuántos años tienes?"

# Imprimimos el mensaje personalizado con el nombre, apellido y la edad
Write-Host "La edad que tiene $nombreApellido es: $edad años"