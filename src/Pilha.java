public class Pilha {
    private int capacidade;
    private int topo;
    private int[] dados;

    public Pilha(int tamanho) {
        capacidade = tamanho;
        dados = new int[capacidade];
        topo = -1;
    }

    public void insere(int elemento) {
        if (cheia()) {
            System.out.println("Erro: A pilha está cheia.");
            return;
        }
        topo++;
        dados[topo] = elemento;
    }

    public boolean cheia() {
        return topo == capacidade - 1;
    }

    public boolean vazia() {
        return topo == -1;
    }

    public int remove() {
        if (vazia()) {
            System.out.println("Erro: A pilha está vazia.");
            return -1;
        }
        int elementoRemovido = dados[topo];
        topo--;
        return elementoRemovido;
    }

    public void imprime() {
        if (vazia()) {
            System.out.println("A pilha está vazia.");
            return;
        }
        System.out.print("Elementos da pilha: ");
        for (int i = 0; i <= topo; i++) {
            System.out.print(dados[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Pilha pilha = new Pilha(5);

        pilha.insere(10);
        pilha.insere(20);
        pilha.insere(30);
        pilha.insere(40);
        pilha.insere(50);

        pilha.imprime();

        pilha.remove();
        pilha.imprime();

        pilha.insere(60);
        pilha.imprime();
    }
}