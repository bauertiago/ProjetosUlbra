<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>

    <!-- jquery -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>

    <!-- bootstrap -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>

    <!-- css e js -->
    <script src="assets/js/script.js"></script>
    <link rel="stylesheet" href="assets/css/style.css">
</head>

<body>
    <header class="p-5 text-white text-center">
        <h1>Minha página de PW</h1>
    </header>
    <div class="container-fluid">
        <div class="row">
            <nav class="col-md-2 p-4">
                
                <ul class="nav flex-column">
                    <h2>Menu</h2>
                    <li class="nav-item">
                        <a class="nav-link" href="?controller=site&action=home">Home</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="?controller=site&action=about">About</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="?controller=site&action=products">Products</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="?controller=site&action=contact">contact</a>
                    </li>
                    
                    <h2>Clientes</h2>
                    <li class="nav-item">
                        <a class="nav-link" href="?controller=client&action=register">Cadastro</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="?controller=client&action=listClients">listar Clientes</a>
                    </li>
                    
                    <h2>Produtos</h2>
                    <li class="nav-item">
                        <a class="nav-link" href="?controller=products&action=listProducts">listar Produtos</a>
                    </li>
                </ul>    
            </nav>
            <section class="col-md-10 p-4">