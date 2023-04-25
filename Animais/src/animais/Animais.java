/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animais;

/**
 *
 * @author 82318900
 */
public class Animais {
    String nome;
    int patas;
    
    public static void main(String[] args){
        System.out.println("oi");
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public void Animal(){
        
    }
    public void animal(String nome){
        this.nome=nome;
    }
    public void animal(String nome, int patas){
        this.nome=nome;
        this.patas=4;
    }
}
