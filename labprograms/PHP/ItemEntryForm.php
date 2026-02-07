<!doctype html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Item Form Entry</title>
    </head>

<body>
    <h2>Enter Items and Prices</h2>

    <form method="post">

    Item 1 Name: <input type="text" name="itemName[]" required>
    Price: <input type="number" name="itemPrice[]" required> <br><br>

    Item 1 Name: <input type="text" name="itemName[]" required>
    Price: <input type="number" name="itemPrice[]" required> <br><br>

    Item 1 Name: <input type="text" name="itemName[]" required>
    Price: <input type="number" name="itemPrice[]" required> <br><br>

    <input type="submit" value="Submit" name="submit">
    </form>

    <?php
        if(isset($_POST['submit'])){
            $itemNames = $_POST["itemName"];
            $itemPrices = $_POST["itemPrice"];

            $max = max($itemPrices);
            $min = min($itemPrices);

            $maxindex = array_search($max, $itemPrices);
            $minindex = array_search($min, $itemPrices);

            echo " <h2> Results: </h2> " ;
            echo "Costliest Item:" .$itemNames[$maxindex]." - $".$max."<br>";
            echo "Cheapest Item:" .$itemNames[$minindex]." - $".$min."<br>";
        }
    ?>

</body>
</html>