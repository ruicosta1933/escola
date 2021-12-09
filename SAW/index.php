<?php 
    $codigo = 1234567;
    $pattern = '/^(?=.*[0-9]).{7}$/';
    if(preg_match($pattern, $codigo)) {
        echo("Código válido!!!");
    }else {
        echo("Código inválido!!!");
        
    }

    echo("<br />");

    $firstName = 'As';
    $pattern = '/^(?=.*[A-Z])(?=.*[a-z]).{3,20}$/';

    if(preg_match($pattern, $firstName)){
        echo "Nome válido!!!";
    } else {
        echo "Nome inválido!!!";
    }

    echo("<br />");

    $lastName = 'Peasdasdsd';
    $pattern = '/^(?=.*[A-Z])(?=.*[a-z]).{3,20}$/';

    if(preg_match($pattern, $lastName)){
        echo "Nome válido!!!";
    } else {
        echo "Nome inválido!!!";
    }

    echo("<br />");

    $genero = "o";
    $pattern = '/^(?i)(M|F|O)$/';

    if(preg_match($pattern, $genero)){
        echo "Género válido!!!";
    } else {
        echo "Género inválido!!!";
    }

    echo("<br />");

    $telefone = "";
    $pattern = '/^(?=(255|91|92|93|96))(?=.*[0-9]).{0}.{9}$/';

    if(preg_match($pattern, $telefone)){
        echo "Número válido!!!";
    } else {
        echo "Número inválido!!!";
    }

    echo("<br />");

    $curso = "dwdm";
    $pattern = '/^(?i)(LEI|SIRC|DWDM|CSRI)$/';

    if(preg_match($pattern, $curso)){
        echo "Curso válido!!!";
    } else {
        echo "Curso inválido!!!";
    }

    echo("<br />");

    $email = "diogo@gmail.com";
    $pattern = '/^(LEI|SIRC|DWDM|CSRI)$/';

    if(filter_var($email, FILTER_VALIDATE_EMAIL)){
        echo "Email válido!!!";
    } else {
        echo "Email inválido!!!";
    }

    echo("<br />");
 
?>

<?php echo htmlspecialchars($_POST['name']); ?>.
You are <?php echo (int)$_POST['apelido']; ?>

<html>
    <center>
    <br>
    <h1>FORMULÁRIO</h1>
    <br>
    <body>
        <form action="index.php" method="post" >
            Utilizador: <input type="text" name="name" class="teste2"><br><br>
            Password: <input type="password" name="apelido" class="teste2"><br><br>
            Repita a Password: <input type="email" name="email" class="teste2"><br><br>
            Codigo: <input type="text" name="codigo" class="teste2"><br><br>
            Hobbies: <br><br>
            <div class="teste">
                <input type="radio" id="masculino" name="fav_language" value="masculino">
                <label for="masculino">Futebol</label><br>
                <input type="radio" id="feminino" name="fav_language" value="feminino">
                <label for="feminino">Estudar</label><br>
                <input type="radio" id="personalizado" name="fav_language" value="personalizado">
                <label for="personalizado">Passear</label> 
            </div>
            <br><br>
            <input type="submit">
        </form>
    <body>
        <center>
            <style>
                .teste {
                    display: flex;
                    justify-content: center;
                }
                .teste2 {
                    width: 300px;
                    display: flex;
                    padding: 5px;
                    font-size: 15px;
                    outline: 0;
                }
            </style>
</html>