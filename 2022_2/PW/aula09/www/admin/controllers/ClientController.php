<?php

class ClientController
{

    public function listClients(){

        require_once('models/ClientModel.php');
        $clientModel = new clientModel();
        $result = $clientModel->listClients();

        $arrayClients = array();

        while ($line = $result->fetch_assoc()){
            array_push($arrayClients, $line);
        }

        require_once('views/templates/header.php');
        require_once('views/client/listClients.php');
        require_once('views/templates/footer.php');
    }

    public function detailsClient($idClient){

        require_once('models/ClientModel.php');
        $ClientModel = new ClientModel();
        $result = $ClientModel->detailsClient($idClient);

        if ($arrayClient = $result->fetch_assoc()){

            require_once('views/templates/header.php');
            require_once('views/client/detailsClient.php');
            require_once('views/templates/footer.php');
        }
    }
}
?>
