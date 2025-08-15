public abstract class QualityProcess {

    public final void checkProduct() {
        receiveProduct();
        performTests();
        generateReport();
    }

    private void receiveProduct() {
        System.out.println("Produto recebido para controle de qualidade.");
    }

    protected abstract void performTests();

    private void generateReport() {
        System.out.println("Relatório gerado e arquivado.\n");
    }
}
