<?php

    if($_SERVER["REQUEST_METHOD"] == "POST"){

        $username = $_POST['user'] ;
        $email = $_POST['email'] ;
        $message = $_POST['feedback'] ;

        echo NewPageHeader() ;
        ResponseBody($username, $email, $message) ;
        PageFooter() ;

    }


function NewPageHeader(){
            echo "<!doctype html>" ;
            echo "<html lang='en'>" ;
            echo "<head>" ;
            echo "<title>Responses</title>" ;
            echo "</head>" ;
        }

function ResponseBody($username, $email, $message){
    echo "<body>" ;
    
    echo "<div style=''>" ;
    echo "Message from: $username \n <br><br>" ;
    echo "Sent from: $email \n <br>" ;
    echo "<h2>Feedback Details:</h2><br>" ;
    echo "$feedback" ;
    echo "</div>" ;

    echo "</body>" ;
}

function PageFooter(){
    echo "</html>" ;
}

?>