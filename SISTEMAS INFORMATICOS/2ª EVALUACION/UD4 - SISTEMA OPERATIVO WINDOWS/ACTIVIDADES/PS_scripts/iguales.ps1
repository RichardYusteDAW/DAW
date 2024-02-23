# Solicitamos al usuario que introduzca el primer número
$num1 = Read-Host "Introduce el primer número"

# Solicitamos al usuario que introduzca el segundo número
$num2 = Read-Host "Introduce el segundo número"

# Convertimos las entradas a tipo numérico
[int]$num1 = $num1
[int]$num2 = $num2

# Comparamos los números y mostramos el resultado
if ($num1 -eq $num2) {
    Write-Host "True"
} else {
    Write-Host "False"
}