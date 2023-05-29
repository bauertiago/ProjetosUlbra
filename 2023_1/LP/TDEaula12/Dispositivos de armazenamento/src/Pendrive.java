public class Pendrive extends DispositivoArmazenamento{
    @Override
    public String lerDados() {
        return "Lendo dados do pendrive";
    }

    @Override
    public String gravarDados() {
        return "Gravando dados no pendrive";
    }
}
