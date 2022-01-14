<?php
require("menu.html");
require("bd.php");

 // Check if the form is submitted

    if($_GET['submit'] == "Submit"){

      $nome = $_GET['nome'];
      $login = $_GET['login'];
      $password = $_GET['pass'];
      $nivel = $_GET['nivel'];
      $email = $_GET['email'];

       // display the results
       if ($stmt = $mysqli->prepare("INSERT INTO utilizador(nome,login,password,nivel,email) VALUES (?,?,?,?,?)")) {
          
        $stmt->bind_param("sssis",$nome, $login,$password,$nivel,$email);
            $stmt->execute();
            $stmt->close();
       }
       $mysqli->close();
       if(!$Err) {  
        echo "<h2>Registo dos Utilizadores:</h2>";  
        echo "Utilizador: " .$nome;  
        echo "<br>";  
        echo "Password: " .$password;  
        echo "<br>";  
        echo "Login: " .$login;  
        echo "<br>";  
    } else {  
        echo "<h3> <b>O formulário não foi preenchido corretamente.</b> </h3>";
    }

    }
  
  
  
   
   

?>
    <html>
    <style>
.coloca, select {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}

input[type=submit] {
  width: 70%;
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

input[type=submit]:hover {
  background-color: #45a049;
}

.cenas {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
}

</style>
        <center>
        <head>
          
            <h1>KEKE ARDEU ? </h1>
        </head>
        <body>
            <h2>PASSA A INFORMACAO ?</h2>
            <div class="cenas">
            <form action="inserir.php" >
                    <label for="fname">Nome</label>
                    <input class="coloca"type="text" id="nome" name="nome" placeholder="Teu nome..">

                    <label for="login">Login</label>
                    <input class="coloca"type="text" id="login" name="login" placeholder="O teu login..">

                    <label for="pass">Password</label>
                    <input  class="coloca"type="password" id="pass" name="pass" placeholder="Tua pass..">

                    <label for="email">Email</label>
                    <input class="coloca"type="email" id="email" name="email" placeholder="Teu email..">

                    <label for="nivel">Nivel</label>
                        <select id="nivel" name="nivel">
                        <option value="1">Admin</option>
                        <option value="2">Default</option>
                    </select>
    <input type="submit" class="btn btn-info" name="submit" value="Submit" />
  </form>
            </div>
        </body>
</center>
    </html>


