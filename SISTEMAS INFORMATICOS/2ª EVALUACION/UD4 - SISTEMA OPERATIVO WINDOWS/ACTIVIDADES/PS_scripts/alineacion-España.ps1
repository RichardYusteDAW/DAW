param (
    [Parameter(Mandatory=$true)]
    [string]$portero,

    [Parameter(Mandatory=$true)]
    [string]$defensa1,

    [Parameter(Mandatory=$true)]
    [string]$defensa2,

    [Parameter(Mandatory=$true)]
    [string]$defensa3,

    [Parameter(Mandatory=$true)]
    [string]$defensa4,

    [Parameter(Mandatory=$true)]
    [string]$centrocampista1,

    [Parameter(Mandatory=$true)]
    [string]$centrocampista2,

    [Parameter(Mandatory=$true)]
    [string]$centrocampista3,

    [Parameter(Mandatory=$true)]
    [string]$centrocampista4,

    [Parameter(Mandatory=$true)]
    [string]$delantero1,

    [Parameter(Mandatory=$true)]
    [string]$delantero2
)

Write-Host "Alineación de España:"
Write-Host "`tPortero: $portero"
Write-Host "`tDefensa: $defensa1, $defensa2, $defensa3, $defensa4"
Write-Host "`tCentrocampistas: $centrocampista1, $centrocampista2, $centrocampista3, $centrocampista4"
Write-Host "`tDelanteros: $delantero1, $delantero2"