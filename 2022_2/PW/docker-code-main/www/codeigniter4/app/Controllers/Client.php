<?php

namespace App\Controllers;

use App\Models\ClientModel;

class Client extends BaseController{

    var $ClientModel;

    public function __construct(){
        $this -> ClientModel = new ClientModel();
    }

    public function listClients(){

        $data = [
            'arrayClients' => $this -> ClientModel->findAll()
        ];
        

        echo view('templates/header');
        echo view('client/listClients', $data);
        echo view('templates/footer');
    
    }

    public function insertClient(){
        echo view('templates/header');
        echo view('client/insertClient');
        echo view('templates/footer');
    }

    public function insertClientAction(){
        $data = [
            'name'=> $this -> request -> getVar('name'),
            'email'=> $this -> request -> getVar('email'),
            'phone'=> $this -> request -> getVar('phone'),
            'address'=> $this -> request -> getVar('address')
        ];
        $this -> ClientModel -> insert($data);
        return redirect()->to(base_url('listClients'));
    }

    public function updateClient($idClient){
        $data = [
            'arrayClient' => $this -> ClientModel -> find($idClient)
        ];
        echo view('admin/templates/header');
        echo view('admin/client/updateClient', $data);
        echo view('admintemplates/footer');
    }

    public function updateClientAction($idClient){
        $data = [
            'name'=> $this -> request -> getVar('name'),
            'email'=> $this -> request -> getVar('email'),
            'phone'=> $this -> request -> getVar('phone'),
            'address'=> $this -> request -> getVar('address')
        ];
        $this -> ClientModel -> update($idClient, $data);
        return redirect()->to(base_url('admin/updateClients'));
    }

}