#Instalar GIT:
https://git-scm.com/downloads

#Comprobar version:
git --version

#Configuración:
~/.gitconfig	#Archivo de configuración global de tu usuario.
[user]
	name  = <Your Name>
	email = <your email>
[alias]
	lg1 = log --graph --abbrev-commit --decorate --format=format:'%C(bold blue)%h%C(reset) - %C(bold green)(%ar)%C(reset)%C(white)%s%C(reset) %C(dim white)- %an%C(reset)%C(bold yellow)%d%C(reset)'
	lg2 = log --graph --abbrev-commit --decorate --format=format:'%C(bold blue)%h%C(reset) - %C(bold cyan)%aD%C(reset)%C(bold green)(%ar)%C(reset)%C(bold yellow)%d%C(reset)%n''%C(white)%s%C(reset) %C(dim white)- %an%C(reset)'
	lg  = !"git lg1"
	lga = !"git lg --all"

git config --global user.name "Richard"
git config --global user.mail richybtc@hotmail.com
git config --list

~/directory/.git/conf	#Archivo de configuración local de tu usuario.
git config --local user.name "Richard"
git config --local user.mail richybtc@hotmail.com
git config --local --list

#WORKING DIR >>>>> STAGING AREA >>>>> REPOSITORIO LOCAL:
.git/			#Directorio que contiene el Repositorio Local.
.gitignore		#Archivo que especifica qué archivos queremos que Git ignore.
	
git init						#Inicia el repo.
git restore <file>				#Descarta los cambios del WORKING DIR.
git status						#Muestra el estado del repo.

git add <file>					#Añade los archivos al STAGING.
git restore	--cached <file>		#Descarta los cambios del STAGING.

git commit -m "Commit inicial"	#Pasa los archivos del STAGING al REPOSITORIO.
git log							#Lista los commits.

git diff						#Muestra los cambios realizados en el WORKING DIR.
git diff <file>					#Muestra los cambios realizados en el archivo.
git diff --staged				#Muestra los cambios realizados en el STAGING.
git diff <ref>					#Muestra los cambios realizados en un commit o etiqueta.

git reset --hard <commit>		#Elmina todos los commits posteriores.


#Repositorio remoto:
	#HTTPS (Pide user y password):
	git clone https://gitlab.dev.wedoops.io/wedoops/wallacoin.git
	#SSH (Settings >> SSH Key (pegar clave pública)):
	git clone git@git.dev.wedoops.io:wedoops/wallacoin.git
		#Si no poseees clave SSH:
		ssh-keygen -t ed25519 -C "richybtc@hotmail.com"
			#A veces hay que añadir la clave en Windows manualmente:
			eval $(ssh-agent -s)
			ssh-add /c/Users/Student/.ssh/id_rsa -f ruta/nombre
	
	#Subir y descargar código:
	git push origin master		#Subir. (con la opción -f --force fuerzas la subida).
	git pull origin master		#Descargar.
	git fetch origin master		#Obtiene los cambios del repo remoto pero no actualiza.
	
	#Ramas:
	git branch ramaNew			#Creamos una rama nueva.
	git branch -a				#Lista todas las ramas.
	git branch -m ramaNew2		#Renombra la rama, pero no copia los commits.
	git branch -M ramaNew2		#Mueve/renombra la rama, junto con su configuración y reflog.
	
	git checkout ramaNew		#Nos cambiamos de rama.
	git switch ramaNew			#Nos cambiamos de rama.
	git checkout -b ramaNew		#Crea una rama nueva y nos cambiamos a ella.
	
	git push -u origin ramaNew	#Publica la rama nueva (--set-upstream).
	git branch -d ramaNew		#Elimina la rama en local.
	git push origin -d ramaNew	#Elimina la rama en remoto.
	git branch -f main			#Fuerza a crear la rama main en el commit en el que estás.
	
	git merge ramaNew			#Une el codigo de la nueva rama a la master.
	git merge --abort			#Aborta la fusión en caso de conflictos.
	git branch --merged			#Lista todas las ramas x unir.
	git rebase ramaOld			#Rebasa la rama indicada.
	
	#Publicar en la rama :
	git pull origin master		#Descargamos el codigo de la master.
	git push origin master		#Publica en remoto los nuevos cambios.
	
	
#Etiquetas:
git tag				#Muestra todas las etiquetas.
git tag	newTag		#Crea una nueva etiqueta.
git tag	-a newTag	#Crea una nueva etiqueta con anotación (editor de texto).
git tag	-m newTag	#Crea una nueva etiqueta con anotación (sin editor de texto).
git tag	-d newTag	#Elimina la etiqueta.
