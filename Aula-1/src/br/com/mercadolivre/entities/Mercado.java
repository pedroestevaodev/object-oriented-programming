package br.com.mercadolivre.entities;

public class Mercado {
//    private Cliente cliente;
//    private Produto produto;

    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        c1.setNome("Pedro Estevão");

//        Produto p1 = new Produto();
//        p1.setNome("Purê de batata");
//
//        Produto p2 = new Produto();
//        p2.setNome("Lasanha");

        System.out.println("Nome do cliente: "+c1.getNome());
    };
}
