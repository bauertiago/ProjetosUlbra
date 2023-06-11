public class Usuario implements Persistente{
    @Override
    public void salvar() {
        System.out.println("Salvar usuário");
    }

    @Override
    public void atualizar() {
        System.out.println("Atualizar usuário");
    }

    @Override
    public void deletar() {
        System.out.println("Deletar usuário");
    }

    @Override
    public void buscar() {
        System.out.println("Buscar usuário");
    }
}
