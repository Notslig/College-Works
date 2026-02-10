<?php

session_start();

$clear = false ;

if ($_SERVER["REQUEST_METHOD"] === "POST") {

    if (!isset($_SESSION['responses'])) {
        $_SESSION['responses'] = [];
    }

    $user = trim($_POST['user'] ?? '');
    $email = trim($_POST['email'] ?? '');
    $message = trim($_POST['feedback'] ?? '');


    if ($user !== '' && $email !== '' && $message !== '') {
        $_SESSION['responses'][] = [
            'user' => htmlspecialchars($_POST['user']),
            'email' => htmlspecialchars($_POST['email']),
            'message' => htmlspecialchars($_POST['feedback'])
        ];
    }

}

if ($clear == true ){
    session_destroy() ;
}

NewPageHeader();
ResponseBody();
PageFooter();


function NewPageHeader(){
    echo "<!doctype html>";
    echo "<html lang='en'>";
    echo "<head>";
    echo "<title>Responses</title>";
    echo "<link rel='stylesheet' href='style.css'>" ;
    echo "</head>";
    echo "<body>";
}




function ResponseBody(){

    echo "<section class='navigation-linker'>" ;
    echo "<div class='form-linker-nav'>" ;
    echo "<p class='form-linker'> <a href='About.html'>Return to Feedback Page </a> </p> " ;
    echo "</div>";
    echo "</section>" ;
    echo "<br><br><br><br><br>" ;

    
    
    if (empty($_SESSION['responses'])) {
        echo "<section class='no-response'>" ;
        echo "<p>No responses yet.</p>";
        echo "</section>" ;
        return;
    }else{

        echo "<section class='background-response'>";
        foreach ($_SESSION['responses'] as $box) {
        
        echo "<div class='response-box'>";
        echo "<strong>Message from:</strong> <p> {$box['user']} </p><br><br>";
        echo "<strong>Email:</strong> <p>{$box['email']} </p ><br><br>";
        echo "<h3>Feedback:</h3>";
        echo "<p>{$box['message']}</p>";
        echo "</div>";
        }
        echo "</section>" ;

    }

}

function PageFooter(){

    echo "<br>" ;
    echo "<center>
        <section class='credits'>
                <img src='images/utility/copyright.png' alt='copyright'>
                <p> Made by <b>NOTSLIG</b> </p>
        </section>
        </center>" ;
    echo "</body>";
    echo "</html>";
}


?>