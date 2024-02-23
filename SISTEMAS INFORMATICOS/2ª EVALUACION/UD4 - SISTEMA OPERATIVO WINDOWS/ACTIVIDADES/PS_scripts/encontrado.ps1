# Solicitamos al usuario que introduzca una frase
$frase = Read-Host "Introduce una frase"

# Utilizamos una expresión regular para buscar la presencia de "de" en alguna palabra de la frase
$contieneDe = $frase -match "\b\w*de\w*\b"

# Mostramos el resultado
if ($contieneDe) {
    Write-Host "True - La frase contiene al menos una palabra con 'de'."
} else {
    Write-Host "False - La frase no contiene ninguna palabra con 'de'."
}