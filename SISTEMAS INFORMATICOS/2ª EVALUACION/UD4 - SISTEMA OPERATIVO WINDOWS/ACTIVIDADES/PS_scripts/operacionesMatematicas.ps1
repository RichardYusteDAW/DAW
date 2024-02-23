# Solicitamos al usuario que introduzca el primer número
$num1 = Read-Host "Introduce el primer número"

# Solicitamos al usuario que introduzca el segundo número
$num2 = Read-Host "Introduce el segundo número"

# Convertimos las entradas a tipo [int] para realizar operaciones matemáticas
[int]$num1 = $num1
[int]$num2 = $num2

# Realizamos las operaciones
$suma = [math]::Round($num1 + $num2)
$resta = [math]::Round($num1 - $num2)
$multiplicacion = [math]::Round($num1 * $num2)
$division = [math]::Round($num1 / $num2)

# Imprimimos los resultados
Write-Host "Suma: $suma"
Write-Host "Resta: $resta"
Write-Host "Multiplicación: $multiplicacion"
Write-Host "División: $division"