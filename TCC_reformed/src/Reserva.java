/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
class Reserva {
    private String nome, sobrenome, quarto, andar, tempo;
    
    public Reserva(String nome, String sobrenome, String quarto, String andar, String tempo){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.quarto = quarto;
        this.andar = quarto;
        this.tempo = tempo;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getQuarto() {
        return quarto;
    }

    public String getAndar() {
        return andar;
    }

    public String getTempo() {
        return tempo;
    }
    
}
