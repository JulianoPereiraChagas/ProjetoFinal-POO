public class ProjetoYoutube {
    public static void main(String[] args) {
        Video v[] = new Video[3];

        // Instanciando os objetos em cada posição do vetor
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTML5");

        // Pessoa p = new Pessoa("Jubileu", 20, "Masculino", 0);
        // Isso que está em cima não funciona!! Está errado!!

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubileu", 20, "Masculino", "Jubileu");
        g[1] = new Gafanhoto("Creuza", 30, "Feminino", "Creuzinha");

        Visualizacao vis[] = new Visualizacao[5];

        vis[0] = new Visualizacao(g[0], v[2]);
        System.out.println(vis[0].toString());

        vis[1] = new Visualizacao(g[0], v[1]); // Jubileu assiste PHP
        vis[0].avaliar(87.0f);
        System.out.println(vis[0].toString());
    }
}