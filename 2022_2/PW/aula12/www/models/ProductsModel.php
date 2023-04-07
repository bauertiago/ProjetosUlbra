<?php

class ProductsModel{

    public function listProducts(){
        require_once('db/ConnectClass.php');
        $connectClass = new ConnectClass();
        $connectClass -> openConnect();
        $connection = $connectClass -> getConn();

        $sql = 'SELECT * FROM products';

        return $connection -> query($sql);
    }
}
?>