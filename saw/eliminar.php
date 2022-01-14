<?php 
require("bd.php");
require("menu.html");
if ($mysqli->connect_error) {
    die("Connection failed: " . $mysqli->connect_error);
  }

  $sql = "SELECT numero, nome, email, numero FROM utilizador";
  $result = $mysqli->query($sql);


    if ($result->num_rows > 0) {
  // output data of each row
  while($row = $result->fetch_assoc()) {
    echo "<center> <br> numero: " . $row["numero"]. " - Nome: " . $row["nome"]. " | " . $row["email"]. " <form action='eliminar.php'><button value='".$row["numero"]."' name='submit'>x</button></form><br></center>";
    $nomezinho = $row["nome"];  
}
} else {
  echo "0 results";
}

if(isset($_GET['submit'])){

  

     $sql = "DELETE FROM utilizador where numero='".$_GET['submit']."'";

if ($mysqli->query($sql) === TRUE) {
    
  
  header("Refresh:0; url=eliminar.php?message=1&nome='".$nomezinho."'");
} else {
  echo "<center>Houve estrondo já: " . $mysqli->error."</center>";
}

$mysqli->close();

  }

if($_GET["message"] && $_GET["nome"]){
    echo "<center>Ja Foi o ".$_GET["nome"]." com os porcos</center>";
}

?>
