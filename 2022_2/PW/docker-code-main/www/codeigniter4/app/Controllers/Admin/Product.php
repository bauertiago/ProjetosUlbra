<?php

namespace App\Controllers\Admin;
use App\Models\ProductModel;
use App\Controllers\BaseController;

class Product extends BaseController{

    var $ProductModel;

    public function __construct(){
        $this -> ProductModel = new ProductModel();
    }

    public function listProducts(){
        $data = [
            'arrayProducts' => $this -> ProductModel->findAll()
        ];
        echo view('admin/templates/header');
        echo view('admin/product/listProducts', $data);
        echo view('admin/templates/footer');
    }

    public function insertProduct(){
        echo view('admin/templates/header');
        echo view('admin/product/insertProduct');
        echo view('admin/templates/footer');
    }

    public function insertProductAction(){
        $data = [
            'name'=> $this -> request -> getVar('name'),
            'price'=> $this -> request -> getVar('price'),
            'description'=> $this -> request -> getVar('description'),
            'idCategory'=> $this -> request -> getVar('idCategory')
        ];
        $this -> ProductModel ->insert($data);
        return redirect()->to(base_url('admin/listProducts'));
    }

    public function updateProduct($idProduct){
        $data = [
            'arrayProduct' => $this -> ProductModel -> find($idProduct)
        ];
        echo view('admin/templates/header');
        echo view('admin/product/updateProduct', $data);
        echo view('admin/templates/footer');    
    }

    public function updateProductAction($idProduct){
        $data = [ 
            'name'=> $this -> request -> getVar('name'),
            'price'=> $this -> request -> getVar('price'),
            'description'=> $this -> request -> getVar('description'),
            'idCategory'=> $this -> request -> getVar('idCategory')
        ];
        $this -> ProductModel -> update($idProduct, $data);
        return redirect()->to(base_url('admin/listProducts'));
    }

    public function deleteProduct($idProduct){
        $this -> ProductModel -> delete($idProduct);
        return redirect()->to(base_url('admin/listProducts'));
    }
}