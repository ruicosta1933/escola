<?php

if($_POST){

    $to = $_POST["email"];
    $subject = $_POST["subject"];
    $message = $_POST["message"];


    $header = "From:hoteldopelourinho@gmail.com \r\n";
    $header .= "Cc:ruicosta607@gmail.com \r\n";
    $header .= "MIME-Version: 1.0\r\n";
    $header .= "Content-type: text/html\r\n";
    
    $retval = mail($to,$subject,$message,$header);
    mail($to,$subject,$message,$header);
    if( $retval == true ) {
        echo $to." - ".$subject." - ".$message." - ".$header."<br>";
       echo "Message sent successfully...";
    }else {
       echo "Message could not be sent...";
    }
}
    /*    */
      ?>


<html>
<body>
    <div class="container">
    <h1>Send Email</h1>
    <form method="post" action="mail.php">
         <label>To:</label>
         <input type="email" name="email" />
         <label>Subject:</label>
         <input type="text" name="subject" />
         <label>Message:</label>
         <textarea type="text-area" name="message"></textarea>
         <button type="submit">Submit</button>
    </form>
    </div>
</body>
<style>
    .container {
        display: flex;
        justify-content: center;
        flex-direction: column;
        align-items: center;
    }
    h1 {
        text-align: center;
    }
    form {
        display: flex;
        flex-direction: column;
        align-items: center;
        justify-content: center;
    }

    form input {
        width: 250px;
        height: 30px;
        outline: 0;
        padding: 12px;
        border-radius: 60px;
        border: 1px solid black;
        box-shadow: rgba(0, 0, 0, 0.24) 0px 3px 8px;
    }

    form textarea {
        width: 250px;
        height: 70px;
        outline: 0;
        padding: 12px;
        border-radius: 20px 20px 0px 20px;
        border: 1px solid black;
        box-shadow: rgba(0, 0, 0, 0.24) 0px 3px 8px;
    }
    form label {
        margin-top: 10px;
    }

    form input:focus {
        border: 2px solid pink;
    }

    form textarea:focus {
        border: 2px solid pink;
    }

    form button {
        margin-top: 10px;
        width: 150px;
        height: 30px;
        border-radius: 60px;
        border: 1px solid pink;
        background-color: #fff;
        color: pink;
        cursor: pointer;
        box-shadow: rgba(0, 0, 0, 0.24) 0px 3px 8px;
    }
    form button:hover {
        background-color: pink;
        color: #fff;
        transition: 0.5s
    }
    
</style>
</html>
