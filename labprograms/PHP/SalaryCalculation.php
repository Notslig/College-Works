<!doctype html>
<html>
    <head>
        <title>Salary Calculation</title>
    </head>

<body>

    <form method="post">
        <table border=2 cellpadding="2px">

            <tr>
                <th colspan=2>
                    Enter Employee Details
                </th>
            </tr>

            <tr>
                <td>Employee Name:</td><td><input type="text" name="employeename"></td>
            </tr>

            <tr>
                <td>Employee Number:</td><td><input type="number" name="employeenumber"></td>
            </tr>

            <tr>
                <td>Select Job Type:</td>
                <td><input type="radio" name="job" value="Full Time">Full Time<br>
                <input type="radio" name="job" value="Part Time">Part Time</td><br>
            </tr>

            <tr>
                <td colspan=2 align="center";>
                    <input type="submit" name="submit" value="Submit">
                </td>
            </tr>

        </table><br><br>

        <?php

            class employee {
                public $ename,$eno ;

                public function __construct($empname,$empno){
                    $this->ename = $empname ;
                    $this->eno = $empno ;
                }
            }

            class fulltime extends employee {
                public $bsal = 1000 ;
                public $DA,$HRA,$PF,$gsal,$sal,$days ;
                public $inc = 500 ;

                public function __constructor($name, $number){

                    parent::__constructor($name,$number) ;

                }

                public function compute(){
                    $this->DA = $this->bsal * 0.45 ;
                    $this->HRA = $this->bsal * 0.7 ;
                    $this->PF = $this->bsal * 0.1 ;
                    $this->gsal = $this->DA + $this->HRA + $this->PF ;
                    $this->sal = $this->bsal + $this->gsal ;
                }

                public function display(){

                echo
                    "<table border=2 cellpadding='2px';>
                        <tr><th colspan=2> Full Time </th></tr>

                        <tr><td>Employee Name:</td><td>$this->ename</td></tr>
                        <tr><td>Employee Number:</td><td>$this->eno</td></tr>
                        <tr><td>Dearness Allowance (DA):</td><td>$this->DA</td></tr>
                        <tr><td>House Rent Allowance (HRA):</td><td>$this->HRA</td></tr>
                        <tr><td>Provident Fund (PF):</td><td>$this->PF</td></tr>
                        <tr><td>Gross Salary (GSal):</td><td>$this->gsal</td></tr>
                        <tr><td>Total Salary (Net):</td><td>$this->sal</td></tr>

                    </table>" ;
                }
            }



            class parttime extends employee {
                public $bsal = 1000 ;
                public $gsal,$sal ;
                public $hours = 20 ;

                public function __constructor($name, $number){

                    parent ::__constructor($name,$number) ;

                }

                public function compute(){
                    $this->sal = $this->bsal * $this->hours ;
                }

                public function display(){

                echo
                    "<table border=2 cellpadding='2px';>
                        <tr><th colspan=2> Part Time </th></tr>

                        <tr><td>Employee Name:</td><td>$this->ename</td></tr>
                        <tr><td>Employee Number:</td><td>$this->eno</td></tr>
                        <tr><td>Total Salary (Net):</td><td>$this->sal</td></tr>

                    </table>" ;
                }
            }


            if(isset($_POST['submit'])){

                $job = $_POST['job'] ;

                if($job == "Full Time"){

                    $script = new fulltime($_POST['employeename'], $_POST['employeenumber']) ;
                    $script->compute() ;
                    $script->display() ;

                }else{

                    $script = new parttime($_POST['employeename'], $_POST['employeenumber']) ;
                    $script->compute() ;
                    $script->display() ;

                }
            }

        
        ?>
            
    </form>
    
</body>
</html>