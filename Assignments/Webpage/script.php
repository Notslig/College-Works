<?php

session_start();

$clear = false ;

if ($_SERVER["REQUEST_METHOD"] === "POST") {

    if (!isset($_SESSION['responses'])) {
        $_SESSION['responses'] = [];
    }

    $_SESSION['responses'][] = [
        'user' => htmlspecialchars($_POST['user']),
        'email' => htmlspecialchars($_POST['email']),
        'message' => htmlspecialchars($_POST['feedback'])
    ];
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
    echo "<style>
        .response-box {
            border: 2px solid #333;
            padding: 15px;
            margin: 15px;
            border-radius: 8px;
            background: #f4f4f4;
        }
    </style>";
    echo "</head>";
    echo "<body>";
}


function ResponseBody(){

    if (empty($_SESSION['responses'])) {
        echo "<p>No responses yet.</p>";
        return;
    }

    foreach ($_SESSION['responses'] as $box) {
        echo "<div class='response-box'>";
        echo "<strong>Message from:</strong> {$box['user']}<br>";
        echo "<strong>Email:</strong> {$box['email']}<br><br>";
        echo "<h3>Feedback:</h3>";
        echo "<p>{$box['message']}</p>";
        echo "</div>";
    }
}

function PageFooter(){
    echo "<p> <a href='About.html'>Return to Feedback Page </a> </p> " ;
    echo "</body>";
    echo "</html>";
}


?>