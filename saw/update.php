<?php
    require("bd.php");
    require("menu.html");
    if ($mysqli->connect_error) {
        die("Connection failed: " . $mysqli->connect_error);
      }
    if(!isset($_GET["submit"]) || !isset($_GET["submitUpdate"])){
        $sql = "SELECT numero, nome, email, numero FROM utilizador";
        $result = $mysqli->query($sql);
      
      
          if ($result->num_rows > 0) {
        // output data of each row
        while($row = $result->fetch_assoc()) {
          echo "<center> <br> numero: " . $row["numero"]. " - Nome: " . $row["nome"]. " | " . $row["email"]. " <form action='update.php'><button value='".$row["numero"]."' name='submit'><-</button></form><br></center>";
          $nomezinho = $row["nome"];  
      }
      } else {
        echo "0 results";
      }
    }
      


    if(isset($_GET['submit'])){
        $sql = "SELECT numero, nome, email, numero FROM utilizador where numero='".$_GET['submit']."'";
        $result = $mysqli->query($sql);
        $numero=$_GET['submit'];
      
          if ($result->num_rows > 0) {
        // output data of each row
        while($row = $result->fetch_assoc()) {
           
      
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
<body>
        <div class="cenas">
                    <form action="update.php" >
                            <label for="fname">Nome</label>
                            <input class="coloca"type="text" id="nome" name="nome" placeholder="Teu nome.." value="<?php echo $row["nome"]; ?>">

                            <label for="login">Login</label>
                            <input class="coloca"type="text" id="login" name="login" placeholder="O teu login.." value="<?php echo $row["nome"]; ?>">

                            <label for="email">Email</label>
                            <input class="coloca"type="email" id="email" name="email" placeholder="Teu email.." value="<?php echo $row["email"]; ?>">

                            <label for="nivel">Nivel</label>
                                <select id="nivel" name="nivel">
                                <?php 
                                    if($row["nivel"] == "1"){
                                        echo "<option value='1'>Admin</option>
                                        <option value='2'>Default</option>";
                                    }
                                    else {
                                        echo "<option value='2'>Default</option>
                                        <option value='1'>Admin</option>";
                                    }
                                ?>
                                
                            </select>
            <button type="submit" class="btn btn-info" name="submitUpdate" value="<?php echo $_GET["submit"]; ?>" >Submit Update</button>
        </form>
                    </div>
                                </body>
</html>
<?php
        }
    }
    }
  
    if(isset($_GET['submitUpdate'])){
        $nome = $_GET['nome'];
        $login = $_GET['login'];
        $nivel = $_GET['nivel'];
        $email = $_GET['email'];
  echo "AAAAAAAAAAA";

      
      $sql = "UPDATE utilizador SET nome='".$nome."', login='".$login."', nivel='".$nivel."', email='".$email."' where numero='".$_GET['submitUpdate']."'";
      echo $sql;
      if ($mysqli->query($sql) === TRUE) {
        header("Refresh:0; url=update.php?message=1&nome='".$nome."'");
      } else {
        echo "<center>Houve estrondo já: " . $mysqli->error."</center>";
      }
      
      $mysqli->close();
  
      

      



      }
      if($_GET["message"] && $_GET["nome"]){
        echo "<center>Ja Foi o ".$_GET["nome"]." updatado !</center>";
    }
?>