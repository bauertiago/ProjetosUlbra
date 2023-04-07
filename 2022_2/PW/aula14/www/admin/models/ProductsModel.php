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

    public function detailsProduct($idProduct){
        require_once('db/ConnectClass.php');
        $ConnectClass = new ConnectClass();
        $ConnectClass -> openConnect();
        $Connection = $ConnectClass -> getConn();

        $sql = "
            SELECT * FROM products
            WHERE
                idProduct = $idProduct
        ";

        return $Connection -> query($sql);
    }
}
?>