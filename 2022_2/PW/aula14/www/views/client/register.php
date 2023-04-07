<h2>Cadastro</h2>
<form action="?controller=client&action=registerView" method="post">
    
    <div class="mt-3 mb-3">
        <label class="form-label" for="">Nome</label>
        <input type="text" class="form-control" name="name">
    </div>

    <div class="mt-3 mb-3">
        <label class="form-label" for="">Email</label>
        <input type="email" class="form-control" name="email">
    </div>

    <div class="mt-3 mb-3">
        <label class="form-label" for="">Telefone</label>
        <input type="text" class="form-control" name="phone">
    </div>

    <h4>Selecione o Genero:</h4>
    <div class="form-check">
        <input class="form-check-input" type="radio" name="gender" value="Feminino" checked>
        <label class="form-check-label">Feminino</label><br>
        <input class="form-check-input" type="radio" name="gender" value="Masculino">
        <label class="form-check-label">Masculino</label><br>
        <input class="form-check-input" type="radio" name="gender" value="Outros">
        <label class="form-check-label">Outros</label><br>
    </div>

    <div class="checkbox mt-4">
        <input class="form-check-input" type="checkbox" name="accept" value="accept" checked>
        <label class="form-check-label">Aceito receber notificações do site.</label><br>
    </div>

    <button class="btn btn-primary mt-3" type="submit">Enviar</button>

</form>
