<h1>Listagem de Clientes</h1>
<table class="table table-striped">
    <tr>
        <th>
            <form method="GET" class="form" action="<?= base_url('admin/getClientsForAction')?>">
                <input type="search" placeholder="Search.." name="search">
                <button type="submit" class="btn btn-primary">
                    <i class="bi bi-search"> Pesquisar</i>
                </button>
            </form>
        </th>
    </tr>
    <tr>
        <th>ID do Cliente:</th>
        <th>Name:</th>
        <th>Email:</th>
        <th>Telefone:</th>
        <th>Endereço:</th>
        <th colspan="2">Ações</th>
    </tr>

    <?php
    foreach ($arrayClients as $client) {
    ?>
        <tr>
            <td>
                <?= $client['idClient'] ?>
            </td>
            <td>
                <?= $client['name'] ?>
            </td>
            <td>
                <?= $client['email'] ?>
            </td>
            <td>
                <?= $client['phone'] ?>
            </td>
            <td>
                <?= $client['address'] ?>
            </td>
            <td>
                <a href="<?= base_url('admin/updateClient/' . $client['idClient']) ?>" class="btn btn-warning">
                    Alterar
                </a>
            </td>
            <td>
                <a href="<?= base_url('admin/deleteClient/' . $client['idClient']) ?>" class="btn btn-danger">
                    Deletar
                </a>
            </td>

        </tr>
    <?php
    }
    ?>

</table>