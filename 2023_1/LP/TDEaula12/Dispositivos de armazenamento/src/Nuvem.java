public class Nuvem extends DispositivoArmazenamento{
    @Override
    public String lerDados() {
        return "Lendo dados da nuvem";
    }

    @Override
    public String gravarDados() {
        return "Gravando dados na nuvem";
    }
}
