# Solicitamos al usuario que introduzca su nombre
$nombre = Read-Host "Por favor, introduce tu nombre"

# Solicitamos al usuario que introduzca un saludo
$saludo = Read-Host "Por favor, introduce un saludo"

# Mostramos el mensaje
Write-Host "$saludo, $nombre"