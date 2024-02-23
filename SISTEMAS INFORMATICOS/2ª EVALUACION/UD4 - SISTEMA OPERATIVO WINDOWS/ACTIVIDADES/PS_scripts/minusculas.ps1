# Solicitamos al usuario que introduzca una frase en mayúsculas
$fraseMayusculas = Read-Host "Introduce una frase en MAYÚSCULAS"

# Convertimos la frase a minúsculas
$fraseMinusculas = $fraseMayusculas.ToLower()

# Mostramos la frase en minúsculas
Write-Host "La frase en minúsculas es: $fraseMinusculas"