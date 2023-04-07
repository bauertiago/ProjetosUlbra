<h1>Alterando Produtos</h1>
<form class="form" action="<?=base_url('admin/updateProductAction/'.$arrayProduct['idProduct'])?>" method="post" enctype='multipart/form-data'>
    <div class="mb-3 mt-3">
        <label class="form-label">Nome</label>
        <input name="name" class="form-control" type="text" value="<?= $arrayProduct['name'] ?>">
    </div>
    <div class="mb-3 mt-3">
        <label class="form-label">preço</label>
        <input name="price" class="form-control" type="text" value="<?= $arrayProduct['price'] ?>">
    </div>
    <div class="mb-3 mt-3">
        <label class="form-label">Descrição</label>
        <input name="description" class="form-control" type="text" value="<?= $arrayProduct['description'] ?>">
    </div>
    <div class="mb-3 mt-3">
        <label class="form-label">ID Categoria</label>
        <input name="idCategory" class="form-control" type="text" value="<?= $arrayProduct['idCategory'] ?>">
    </div>
    <input class="btn btn-primary" type="submit" value="Enviar">