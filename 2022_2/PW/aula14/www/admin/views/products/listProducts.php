<h1>Listagem de Produtos</h1>
<table class="table table-striped">

    <tr>
            <th>ID do Produto:</th>
            <th>Nome:</th>
            <th>Preço:</th>
            <th>Descrição:</th>
            <th>ID Categoria:</th>
            <th>Ações</th>
        </tr>

        <?php
            foreach ($arrayProducts as $products){
        ?>
            <tr>
                <td>
                    <?= $products['idProduct']?>
                </td>
                <td>
                    <?= $products['name']?>
                </td>
                <td>
                    <?= $products['price']?>
                </td>
                <td>
                    <?= $products['description']?>
                </td>
                <td>
                    <?= $products['idCategory']?>
                </td>
                <td>
                <a class="nav-link" href="?controller=products&action=detailsProduct&id=<?= $products['idProduct']?>">
                    Detalhes
                </a>
            </td>
            </tr>
        <?php
            }
        ?>

</table>