/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuariovideo;

/**
 *
 * @author SAM
 */
public class Video {
    private String titulo;
    private int duracion; //Duracion en segundos
    
    public Video(String titulo, int duracion){
        this.titulo=titulo;
        this.duracion=duracion;
    }
    
    public void reproducir(){
        System.out.print("Reproduciendo el video " +titulo);
    }
    
    public void detener(){
        System.out.print("Se detuvo el video " +titulo);
    }
    
    public String getTitulo(){
        return titulo;
    }
}
