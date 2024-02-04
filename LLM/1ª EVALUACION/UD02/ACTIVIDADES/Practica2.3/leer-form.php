<?php

//var_dump($_GET);
//var_dump($_POST);
$varsGet= $_GET;
$varsPost = $_POST;

$getIndex=0;
echo('VARIABLES DE TIPO GET');
echo('<br>');
if(count($varsGet)>0){
   foreach ($varsGet as $key => $value){
       $getIndex++;
        echo($getIndex.') Nombre de variable: <strong>'.$key.'</strong> ');
        echo('->');
        echo('Valor de variable : <strong>'.$value.'</strong> ');
        echo('<br>');
    } 
}
else{ 
    echo('No hay variables enviadas por GET');
}

echo('<br>');
echo('<br>');
echo('<br>');
echo('VARIABLES DE TIPO POST');
echo('<br>');
$postIndex=0;
if(count($varsPost)>0){
   foreach ($varsPost as $key => $value){
       $getIndex++;
        echo($getIndex.') Nombre de variable:<strong> '.$key.'</strong> ');
        echo('Valor de variable:<strong> '.$value.'</strong> ');
        echo('<br>');
    } 
}
else{ 
    echo('No hay variables enviadas por POST');
}


?>