<?php
$mysqli = new mysqli("localhost", "root", "sawdb", "saw");
$nome=$login=$password=$nivel=$email="";
 // Check if the form is submitted
    echo "123";
    if(isset($_POST('submit'))){
      $nome = $_POST['nome'];
      $login = $_POST['login'];
      $password = $_POST['pass'];
      $nivel = $_POST['nivel'];
      $email = $_POST['email'];
      echo $nome.$login.$password.$nivel.$email;
       // display the results
       if ($stmt = $mysqli-›prepare("INSERT INTO utilizador(nome,login,password,nivel,email) VALUES (?,?,?,?,?)")) {
            $stmt->bind_param("sssis",$nome, $login,$password,$nivel,$email);
            $stmt->execute();
            $stmt->close();
       }
    }
  
  
   $mysqli->close();
   

?>