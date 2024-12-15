<?php

class ProductController{
    public function index(){

    }

    public function listProducts(){
        require_once('models/ProductsModel.php');
        $productsModel = new productsModel();
        $result = $productsModel -> listProducts();

        $arrayProducts = array();

        while($products = $result -> fetch_assoc()){
            array_push($arrayProducts, $products);
        }

        require_once('views/templates/header.php');
        require_once('views/products/listProducts.php');
        require_once('views/templates/footer.php');
    }

    public function detailsProduct($idProduct){
        require_once('models/ProductsModel.php');
        $ProductsModel = new ProductsModel();
        $result = $ProductsModel -> detailsProduct($idProduct);

        if($arrayProducts = $result->fetch_assoc()){

            require_once('views/templates/header.php');
            require_once('views/products/detailsProduct.php');
            require_once('views/templates/footer.php');            
        }
    }
}
?>