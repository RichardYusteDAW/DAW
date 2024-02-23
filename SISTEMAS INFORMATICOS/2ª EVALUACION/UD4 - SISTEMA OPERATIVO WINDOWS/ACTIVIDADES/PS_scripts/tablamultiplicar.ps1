# Solicitamos al usuario que introduzca un número
$numero = Read-Host "Entra un número"

# Convertimos la entrada en un entero
[int]$numero = $numero

# Imprimimos la tabla de multiplicar del número introducido, del 0 al 10
Write-Host "Su tabla de multiplicar del 0 al 10 es:"
for ($i = 0; $i -le 10; $i++) {
    $resultado = $numero * $i
    Write-Host "$numero x $i = $resultado"
}
