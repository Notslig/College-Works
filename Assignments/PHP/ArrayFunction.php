<!doctype html >
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Array Functions</title>
</head>

<body>
<center>

    <h2>Assignment questions</h2><br>
    
    <div>
        <h4>Program to find the length of the array </h4><br>

        <?php

            $ar = array(12,67,45,23,56,12,89,65,47,34,22,99,05,37,23,1) ;
            echo "<br> Contents in the array are:" ;

            foreach ($ar as $value){
                echo $value." " ;
            }
            
            $count = count($ar) ;
            echo "<br> The length of the array is: ".$count."<br>" ;

        ?>

    </div>


    <div>
        <h4>Program to find the sum of the array </h4><br>

        <?php

            $ar = array(12,67,45,23,56,12,89,65,47,34,22,99,05,37,23,1) ;
            echo "<br> Contents in the array are:" ;

            foreach ($ar as $value){
                echo $value." " ;
            }

            $sum = 0 ;
            foreach ($ar as $value){
                $sum +=  $value ;
            }
            
            echo "<br> The sum of the array using foreach is: ".$sum."<br>" ;
            echo "<br> Sum of the elements using array_sum() is: ".array_sum($ar)."<br>" ;

        ?>

    </div>


    <div>
        <h4>Program to find the Minimum and Maximum from the array </h4><br>

        <?php

            $ar = array(12,67,45,23,56,12,89,65,47,34,22,99,05,37,23,1) ;
            echo "<br> Contents in the array are:" ;

            foreach ($ar as $value){
                echo $value." " ;
            }
            
            $max = max($ar) ;
            $min = min($ar) ;
            echo "<br> Maximum number:".$max."<br>" ;
            echo "<br> Minimum number:".$min."<br>" ;

        ?>

    </div>


    <div>
        <h4>Program to sort in Ascending and Descending array </h4><br>

        <?php

            $ar = array(12,67,45,23,56,12,89,65,47,34,22,99,05,37,23,1) ;
            echo "<br> Contents in the array are:" ;

            foreach ($ar as $value){
                echo $value." " ;
            }

            asort($ar) ;
            echo "<br> Ascending order:" ;
            foreach ($ar as $value){
                echo $value." " ;
            }

            rsort($ar) ;
            echo "<br> Descending order:" ;
            foreach ($ar as $value){
                echo $value." " ;
            }

        ?>

    </div>


    <div>
        <h4>Program to reverse the array </h4><br>

        <?php

            $ar = array(12,67,45,23,56,12,89,65,47,34,22,99,05,37,23,1) ;
            echo "<br> Contents in the array are:" ;

            foreach ($ar as $value){
                echo $value." " ;
            }

            $reverse = array_reverse($ar) ;
            echo "<br> Reverse of the array: " ;
            foreach ($reverse as $value){
                echo $value." " ;
            }


        ?>

    </div>


    <div>
        <h4>Program to search element from the array </h4><br>

        <?php

            $ar = array(12,67,45,23,56,12,89,65,47,34,22,99,05,37,23,1) ;
            echo "<br> Contents in the array are:" ;

            foreach ($ar as $value){
                echo $value." " ;
            }

        ?>

        <br>

        <form method="get">
            <label >Element to search:</label>
            <input type="number" name="element">
            <br>
            <input type="submit" name="search">
        </form>

        <?php

            if(isset($_GET["search"])){
                $search = $_GET["element"] ;
                $ar = array(12,67,45,23,56,12,89,65,47,34,22,99,05,37,23,1) ;

                $position = array_search($search,$ar) ;
                
                if($position==true){
                    echo "<br> Element found in position ".$position+1 ;
                }
                else {
                    echo "<br> Element does not exist" ;
                }
            }

        ?>

    </div>

</center>
</body>
</html>