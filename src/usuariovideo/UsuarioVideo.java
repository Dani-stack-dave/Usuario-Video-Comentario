/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package usuariovideo;

/**
 *
 * @author SAM
 */
public class UsuarioVideo {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args){
       Usuario usuario= new Usuario("\n MACACO ","macaco@gmail.com");
       Video video=new  Video("\n Monky Flip ", 3600);
       usuario.verVideo(video);
       video.detener();
       Comentario comentario1 = new Comentario("¡Este video es increiible!");
       // Mostrar los comentarios
       System.out.println("\n Comentarios sobre el video '" + video.getTitulo() + "':");
       comentario1.mostrarComentario();
    }
    
}
