package br.com.alura.minhamusicas.modelos;

public class MinhasPreferidas {

    public void inclui(Audio audio){
        if (audio.getClassificacao() >= 9){
            System.out.println(audio.getTitulo() + " é considerados sucesso entre a galera");
        } else {
            System.out.println(audio.getTitulo() + " Uma exelente opção para todos");
        }
    }
}
