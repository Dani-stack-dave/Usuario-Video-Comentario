/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuariovideo;

/**
 *
 * @author SAM
 */
public class Comentario {
     public String texto;

    public Comentario(String texto) {
         this.texto = texto;
    }
    
    public void mostrarComentario() {
        System.out.println("Comentario" + texto);
    }
    
    public String getTexto() {
        return texto;
    }
    
    public void setTexto(String texto) {
        this.texto = texto;
    }

}
