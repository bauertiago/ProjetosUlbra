<h1>Inserindo Produto</h1>
<form class="form" action="<?=base_url('admin/insertProductAction')?>" method="post" enctype='multipart/form-data'>
    <div class="mb-3 mt-3">
        <label class="form-label">Nome</label>
        <input name="name" class="form-control" type="text">
    </div>
    <div class="mb-3 mt-3">
        <label class="form-label">Preço</label>
        <input name="price" class="form-control" type="text">
    </div>
    <div class="mb-3 mt-3">
        <label class="form-label">Descrição</label>
        <input name="description" class="form-control" type="text">
    </div>
    <div class="mb-3 mt-3">
        <label class="form-label">Id Categoria</label>
        <input name="idCategory" class="form-control" type="text">
    </div>
        
    <input class="btn btn-primary" type="submit" value="Enviar">
</form>