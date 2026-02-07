<!doctype html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>PHP Comparison Operators</title>
    </head>

    <body>
        <center>
        <h3>Comparision operators in PHP</h3>
        <div >
        <form method="post">
            First Value<input type="number" name="value1" placeholder="Enter first value" required><br><br>

            Second Value<input type="number" name="value2" placeholder="Enter second value" required><br><br>

            Choose Comparision Operator<br><br>
            <select title ="Choice" name="operator" required>
                            <option value="==">Equal</option>
                            <option value="!=">Not Equal</option>
                            <option value=">">Greater Than</option>
                            <option value="<">Less Than</option>
                            <option value=">=">Greater Than or Equal To</option>
                            <option value="<=">Less Than or Equal To</option>
            </select>
            <br><br>
            <input type="submit" name="submit" value="Compare">
            </center>
        </form>
        </div>


        <?php
            if(isset($_POST['submit'])){
                $var1=$_POST['value1'];
                $var2=$_POST['value2'];
                $operator=$_POST['operator'];
                switch($operator){
                    case "==": $result=($var1==$b); break;
                    case "!=": $result=($var1!=$var2); break;
                    case ">": $result=($var1>$var2); break;
                    case "<": $result=($var1<$var2); break;
                    case ">=": $result=($var1>=$var2); break;
                    case "<=": $result=($var1<=$var2); break;
                    default: echo "<br>Please select an operation" ;
                    exit ;
                }
                echo " <br> Result : " .($result ? 'True' : 'False');
            }
        ?>

        
    </body>
</html>