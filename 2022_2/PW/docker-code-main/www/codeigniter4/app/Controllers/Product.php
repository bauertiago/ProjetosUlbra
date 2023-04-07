<?php

namespace App\Controllers;

use App\Models\productModel;

class Product extends BaseController{

    public function listProducts(){

        $ProductModel = new ProductModel();
        $data = [
            'arrayProducts' => $ProductModel->findAll()
        ];
        

        echo view('templates/header');
        echo view('product/listProducts', $data);
        echo view('templates/footer');
    
    }

}