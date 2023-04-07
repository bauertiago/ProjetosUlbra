validaDados();
    
    function validaDados(){
        var texto = document.getElementById("nome").value;
        var email = document.getElementById("email").value;
        var numero = document.getElementById("fone").value;

        document.getElementById('enviar').innerHTML = "Sr(a) " + texto + "com email " + email + "e telefone " + numero + "em breve entraremos em contato!!"
    return false
    }