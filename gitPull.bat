@echo off
setlocal
set "daw=C:\Users\11725231\Desktop\DAW"

REM Hacer git pull en la carpeta DAW
git -C "%daw%" pull

REM Hacer git pull en la subcarpeta DAW\ED\Proyectos\YusteRichard-ED
git -C "%daw%\ED\Proyectos\YusteRichard-ED" pull

REM Hacer git pull en la subcarpeta DAW\ED\pruebas
git -C "%daw%\ED\Proyectos\pruebas" pull

endlocal