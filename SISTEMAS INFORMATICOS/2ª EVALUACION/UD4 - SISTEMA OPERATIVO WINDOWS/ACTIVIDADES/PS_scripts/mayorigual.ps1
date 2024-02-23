# Solicitamos al usuario que introduzca el primer número
$num1 = Read-Host "Introduce el primer número (numero1)"

# Solicitamos al usuario que introduzca el segundo número
$num2 = Read-Host "Introduce el segundo número (numero2)"

# Convertimos las entradas a tipo numérico para realizar la comparación
[int]$num1 = $num1
[int]$num2 = $num2

# Comparamos los números y mostramos el resultado
if ($num1 -ge $num2) {
    Write-Host "True - El primer número (numero1) es mayor o igual que el segundo número (numero2)."
} else {
    Write-Host "False - El primer número (numero1) no es mayor ni igual que el segundo número (numero2)."
}