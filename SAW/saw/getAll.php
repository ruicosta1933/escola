<?php 
require("menu.html");
require("bd.php");

if ($mysqli->connect_error) {
    die("Connection failed: " . $mysqli->connect_error);
  }

  $sql = "SELECT numero, nome, email FROM utilizador";
  $result = $mysqli->query($sql);


    if ($result->num_rows > 0) {
  // output data of each row
  while($row = $result->fetch_assoc()) {
    echo "<center> <br> numero: " . $row["numero"]. " - Nome: " . $row["nome"]. " | " . $row["email"]. "<br></center>";
  }
} else {
  echo "0 results";
}
$mysqli->close();


?>