@echo off
setlocal

REM Obtener el nombre del equipo (`hostname` en CMD nos dice el nombre del equipo)
for /f "tokens=*" %%i in ('hostname') do set "hostname=%%i"

REM Establecer el path dependiendo del nombre del equipo
if "%hostname%"=="Win11" (
    set "daw=F:\DAW"
) else if "%hostname%"=="2A1PC02" (
    set "daw=C:\Users\11725231\Desktop\DAW"
)

REM Hacer git pull en la carpeta DAW
git -C "%daw%" pull

REM Hacer git pull en la subcarpeta DAW\ED\Proyectos\YusteRichard-ED
git -C "%daw%\ED\Proyectos\YusteRichard-ED" pull

REM Hacer git pull en la subcarpeta DAW\ED\pruebas
git -C "%daw%\ED\Proyectos\pruebas" pull

endlocal

REM Evitamos que se cierre el CMD:
pause