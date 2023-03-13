/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inweb.spring.formulario_simple_servidor_https_spring.controlador;

import innui.modelos.errores.oks;
import inweb.spring.servidor_https_spring.controlador.Pagina_inicio_factoria;
import org.springframework.ui.Model;
import static inweb.spring.formulario_simple_servidor_https_spring.controlador.Con_formulario_simple_servidor_https_spring.k_formulario_simple;

/**
 *
 * @author emilio
 */
public class Pagina_inicio extends Pagina_inicio_factoria {

    @Override
    public String presentar_inicio(Model model, oks ok, Object... extra_array) throws Exception {
        String text = "redirect:" + k_formulario_simple; // Orden de redirección a la página hola_mundo
        return text;
    }

}
