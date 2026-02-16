<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Student Report Card</title>
</head>
<body>
    
    <form method="post">

    <table border="2">

    <tr>
        <td colspan="2" align="center"> <h4>Report Card</h4></td>
    </tr>

    <tr>
        <td colspan="2" align="center"> Enter Personnel Details</td>
    </tr>

    <tr><td>Name: </td><td><input type="text" name="name"></td></tr>
    <tr><td>Register Number: </td><td><input type="text" name="reg"></td></tr>
    <tr><td>Class: </td><td><input type="text" name="class"></td></tr>

    <tr>
        <td colspan="2" align="center"> Enter Marks:</td>
    </tr>

    <tr><td>Subject 1: </td><td><input type="number" name="sub1"></td></tr>
    <tr><td>Subject 2: </td><td><input type="number" name="sub2"></td></tr>
    <tr><td>Subject 3: </td><td><input type="number" name="sub3"></td></tr>
    <tr><td>Subject 4: </td><td><input type="number" name="sub4"></td></tr>
    <tr><td>Subject 5: </td><td><input type="number" name="sub5"></td></tr>
    <tr><td>Subject 6: </td><td><input type="number" name="sub6"></td></tr>

    <tr>
        <td colspan="2" align="center"> <input type="submit" name="submit" value="SUBMIT"></td>
    </tr>

    </table>

    <?php

        class report {

            public $name,$reg,$class,$sub1,$sub2,$sub3,$sub4,$sub5,$sub6,$total,$percentage,$result ;

            public function __construct($studentname,$studentreg,$studentclass,$s1,$s2,$s3,$s4,$s5,$s6) {
                $this->name = $studentname ;
                $this->reg = $studentreg ;
                $this->class = $studentclass ;
                $this->sub1 = $s1 ;
                $this->sub2 = $s2 ;
                $this->sub3 = $s3 ;
                $this->sub4 = $s4 ;
                $this->sub5 = $s5 ;
                $this->sub6 = $s6 ;
            }

            public function calculate(){

                $this->total = $this->sub1 + $this->sub2 + $this->sub3  + $this->sub4  + $this->sub5  + $this->sub6  ;
                $this->percentage = ($this->total/600) * 100 ;

                if( ($this->sub1 < 35)||($this->sub2 < 35)||($this->sub3 < 35)||($this->sub4 < 35)||($this->sub5 < 35)||($this->sub6 < 35)){

                    $this->result = "Fail" ;

                }else{

                    $this->result = "Pass" ;
                }

            }

            public function display(){

                echo
                "<table border='2'>
                    <tr><td colspan='2' align='center'> <h4>Result</h4></td></tr>
                    <tr><td colspan='2'>College Name</td></tr>
                    <tr><td colspan='2'>Report Card</td></tr>

                    <tr><td>Student Name:</td><td>$this->name</td></tr>
                    <tr><td>Student Register:</td><td>$this->reg</td></tr>
                    <tr><td>Student Class:</td><td>$this->class</td></tr>
                    <tr><td>Subject 1:</td><td>$this->sub1</td></tr>
                    <tr><td>Subject 2:</td><td>$this->sub2</td></tr>
                    <tr><td>Subject 3:</td><td>$this->sub3</td></tr>
                    <tr><td>Subject 4:</td><td>$this->sub4</td></tr>
                    <tr><td>Subject 5:</td><td>$this->sub5</td></tr>
                    <tr><td>Subject 6:</td><td>$this->sub6</td></tr>
                    <tr><td>Total:</td><td>$this->total</td></tr>
                    <tr><td>Percentage:</td><td>$this->percentage %</td></tr>
                    <tr><td>Grade:</td> " ;

                echo  ($this->result == 'Pass') ?  "<td bgcolor='green' style='color:white ;'>PASS</td>" : "<td bgcolor='red'>FAIL</td>" ;

                echo
                    "</tr>
                </table>" ;
            }
        }

        if(isset($_POST['submit'])){

            $sname = $_POST['name'] ;
            $sreg = $_POST['reg'] ;
            $sclass = $_POST['class'] ;
            $_sub1 = $_POST['sub1'] ;
            $_sub2 = $_POST['sub2'] ;
            $_sub3 = $_POST['sub3'] ;
            $_sub4 = $_POST['sub4'] ;
            $_sub5 = $_POST['sub5'] ;
            $_sub6 = $_POST['sub6'] ;

            if(empty($sname)||empty($sreg)||empty($sclass)||empty($_sub1)||empty($_sub2)||empty($_sub3)||empty($_sub4)||empty($_sub5)||empty($_sub6)){

                echo "Field cannot be blank!" ;

            }else{

                $obj = new report ($sname,$sreg,$sclass,$_sub1,$_sub2,$_sub3,$_sub4,$_sub5,$_sub6) ;
                $obj->calculate() ;
                $obj->display() ;
            }
        }

    ?>

    </form>
</body>
</html>