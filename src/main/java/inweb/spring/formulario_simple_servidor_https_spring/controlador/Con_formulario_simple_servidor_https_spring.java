package inweb.spring.formulario_simple_servidor_https_spring.controlador;

import innui.modelos.configuraciones.ResourceBundles;
import innui.modelos.errores.oks;
import innui.modelos.internacionalizacion.tr;
import static inweb.modelos_html.formularios.web_formularios.k_valores_mapa_metodo_tex;
import static inweb.modelos_html.formularios.web_formularios.k_valores_mapa_url_destino_tex;
import inweb.spring.formulario_simple_servidor_https_spring.Formulario_simple;
import static inweb.spring.formulario_simple_servidor_https_spring.Formulario_simple.k_titulo_tex;
import java.util.ResourceBundle;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import static inweb.spring.servidor_https_spring.controlador.Pagina_inicio_factoria.k_ok_tex;
import jakarta.servlet.http.HttpServletRequest;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author emilio
 */
@Controller
public class Con_formulario_simple_servidor_https_spring {
    public static String k_in_ruta = "in/inweb/spring/formulario_simple_servidor_https_spring/controlador/in";
    public static final String k_formulario_simple = "formulario_simple"; // Ruta Web desde la raiz del servidor HTTPS
    public static String k_index_html = k_formulario_simple + "/index.html"; // Ruta + Página Web de inicio
    public static String k_formulario_simple_tex = "formulario_simple_tex";
    public static String k_titulo = "Formulario Simple con Servidor HTTPS Spring ";
    
    @GetMapping(k_formulario_simple)
    public String formulario_simple_get(Model model) throws Exception {
        oks ok = new oks();
        ResourceBundle in;
        try {
            in = ResourceBundles.getBundle(k_in_ruta);
            Formulario_simple formulario_simple = new Formulario_simple();
            while (true) {
                formulario_simple.formulario_simple_valores_mapa.put(k_valores_mapa_url_destino_tex, k_formulario_simple);
                formulario_simple.formulario_simple_valores_mapa.put(k_valores_mapa_metodo_tex, "POST");
                // Si el metodo de envio es POST no se pueden usar las etiquetas <form> preconstruidas
                formulario_simple.capturar(ok);
                break;
            }
            if (ok.es == false) {
                model.addAttribute(k_ok_tex, ok.getTxt());
            }
            String texto = formulario_simple.formulario_simple.getContenido_formulario_html();
//            // Si el metodo de envio es POST no se pueden usar las etiquetas <form> preconstruidas
//            texto = texto.replaceAll("<form\\s.*?>", "");
//            texto = texto.replace("</form>", "");
//            // /Si el metodo de envio es POST no se pueden usar las etiquetas <form> preconstruidas
            model.addAttribute(k_formulario_simple_tex, texto);
            texto = tr.in(in, k_titulo); // Traducible a otros lenguajes
            model.addAttribute(k_titulo_tex, texto);
        } catch (Exception e) {
            in = ResourceBundles.getBundle(k_in_ruta);
            ok.setTxt(tr.in(in, "Excepción inesperada "), e);
            model.addAttribute(k_ok_tex, ok.getTxt());
        }
        return k_index_html;
    }
    
    @PostMapping(k_formulario_simple)
    public String formulario_simple_post(HttpServletRequest request, Model model) throws Exception {
        oks ok = new oks();
        ResourceBundle in;
        try {
            in = ResourceBundles.getBundle(k_in_ruta);
            Map<String, String[]> parametros_mapa = request.getParameterMap();
            Formulario_simple formulario_simple = new Formulario_simple();
            while (true) {
                formulario_simple.formulario_simple_valores_mapa.put(k_valores_mapa_url_destino_tex, k_formulario_simple);
                formulario_simple.formulario_simple_valores_mapa.put(k_valores_mapa_metodo_tex, "POST");
                // Si el metodo de envio es POST no se pueden usar las etiquetas <form> preconstruidas
                formulario_simple.formulario_simple.configurar_sin_form(ok);
                if (ok.es == false) { break; }
                formulario_simple.procesar_desde_servidor_https(parametros_mapa, ok);
                break;
            }
            if (ok.es == false) { 
                model.addAttribute(k_ok_tex, ok.getTxt());
            }
            String texto = formulario_simple.formulario_simple.getContenido_formulario_html();
            model.addAttribute(k_formulario_simple_tex, texto);
            texto = tr.in(in, k_titulo); // Traducible a otros lenguajes
            model.addAttribute(k_titulo_tex, texto);
        } catch (Exception e) {
            in = ResourceBundles.getBundle(k_in_ruta);
            ok.setTxt(tr.in(in, "Excepción inesperada "), e);
            model.addAttribute(k_ok_tex, ok.getTxt());
        }
        return k_index_html;
    }

}
