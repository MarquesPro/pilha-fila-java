public class Main {
    public static void main(String[] args) {

        Fila fila = new Fila(5);
        //testnado fila

        System.out.println("Adicionando: " + fila.adicionar("Abelha"));
        System.out.println("Adicionando: " + fila.adicionar("Bernardo"));
        System.out.println("Adicionando: " + fila.adicionar("Casa"));
        System.out.println("Adicionando: " + fila.adicionar("Dragão"));
        System.out.println("Adicionando: " + fila.adicionar("Enzo"));

        System.out.println("A filha está vazia? " + fila.estaVazio());

        System.out.println("Primeiro elementodad fila: " + fila.primeiro());
        System.out.println("Tamanho da fila " + fila.tamanho());

        while (!fila.estaVazio()){
            System.out.println("Removendo da fila: " + fila.remover());
        }
        System.out.println("A filha está vazia? " + fila.estaVazio());

        //testando pilha
        Pilha pilha = new Pilha(5);
        System.out.println();

        System.out.println("Adicionando: " + pilha.empilhar("Abelha"));
        System.out.println("Adicionando: " + pilha.empilhar("Bernardo"));
        System.out.println("Adicionando: " + pilha.empilhar("Casa"));
        System.out.println("Adicionando: " + pilha.empilhar("Dragão"));
        System.out.println("Adicionando: " + pilha.empilhar("Enzo"));

        System.out.println("A filha está vazia? " + pilha.estaVazia());

        System.out.println("Primeiro elementodad fila: " + pilha.topo());
        System.out.println("Tamanho da fila " + pilha.tamanho());

        while (!pilha.estaVazia()){
            System.out.println("Removendo da fila: " + pilha.desempilhar());
        }
        System.out.println("A filha está vazia? " + pilha.estaVazia());

        System.out.println("acabô");
    }
}