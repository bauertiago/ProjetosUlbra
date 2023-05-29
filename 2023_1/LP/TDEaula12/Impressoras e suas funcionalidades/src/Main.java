public class Main {
    public static void main(String[] args) {
        ImpressoraJatoTinta impressoraJatoTinta = new ImpressoraJatoTinta();
        System.out.println(impressoraJatoTinta.imprimir());
        System.out.println(impressoraJatoTinta.escanear());
        System.out.println("==========");

        ImpressoraLaser impressoraLaser = new ImpressoraLaser();
        System.out.println(impressoraLaser.imprimir());
        System.out.println(impressoraLaser.escanear());
        System.out.println("===========");

        ImpressoraMatricial impressoraMatricial = new ImpressoraMatricial();
        System.out.println(impressoraMatricial.imprimir());
        System.out.println(impressoraMatricial.escanear());
    }
}
