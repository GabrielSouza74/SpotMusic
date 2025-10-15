package br.com.alura.minhamusicas.principal;

import br.com.alura.minhamusicas.modelos.MinhasPreferidas;
import br.com.alura.minhamusicas.modelos.Musica;
import br.com.alura.minhamusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica musica = new Musica();
        musica.setTitulo("Ariels");
        musica.setArtista("System Of Down");

        for (int i = 0; i < 200; i++) {
            musica.reproduzir();
        }

        for (int i = 0; i < 300; i++) {
            musica.curtir();
        }

        Podcast podcast = new Podcast();
        podcast.setTitulo("Fisica");
        podcast.setApresentador("Sergio Sacani");

        for (int i = 0; i < 100; i++) {
            podcast.reproduzir();
        }

        for (int i = 0; i < 100; i++) {
            podcast.curtir();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(podcast);
        preferidas.inclui(musica);


    }

}
