package inweb.spring.formulario_simple_servidor_https_spring;

import static inclui.formularios.control_entradas.k_entradas_tipo_email;
import static inclui.formularios.control_entradas.k_entradas_tipo_fecha;
import static inclui.formularios.control_entradas.k_entradas_tipo_fecha_y_hora;
import static inclui.formularios.control_entradas.k_entradas_tipo_numero;
import static inclui.formularios.control_entradas.k_entradas_tipo_password;
import static inclui.formularios.control_entradas.k_entradas_tipo_radio;
import static inclui.formularios.control_entradas.k_entradas_tipo_reset;
import static inclui.formularios.control_entradas.k_entradas_tipo_submit;
import static inclui.formularios.control_entradas.k_entradas_tipo_telefono;
import static inclui.formularios.control_entradas.k_entradas_tipo_texto;
import innui.bases;
import innui.formularios.controles;
import static innui.formularios.controles.k_opciones_mapa_no_requerido;
import static innui.formularios.formularios.k_fase_procesamiento;
import static innui.formularios.formularios.k_importar_no_encontrado;
import innui.modelos.configuraciones.ResourceBundles;
import innui.modelos.errores.oks;
import innui.modelos.internacionalizacion.tr;
import inweb.modelos_html.formularios.control_selecciones;
import inweb.modelos_html.formularios.control_textareas;
import inweb.modelos_html.formularios.web_formularios;
import static inweb.modelos_html.formularios.web_formularios.k_valores_mapa_mensaje_error_tex;
import static inweb.modelos_html.formularios.web_formularios.k_valores_mapa_valor_tex;
import static inweb.spring.formulario_simple_servidor_https_spring.controlador.Con_formulario_simple_servidor_https_spring.k_in_ruta;
import java.util.AbstractMap;
import java.util.AbstractMap.SimpleEntry;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.ResourceBundle;

/**
 *
 * @author emilio
 */
public class Formulario_simple extends bases {
    public static String k_in_ruta = "in/inweb/spring/formulario_simple_servidor_https_spring/in";
    public static String k_icono_ruta = "/re/static/ingui.javafx.formulario_simple_navegador_web.png";
    public static String k_imagen_cabecera_ruta = "/re/static/ingui.javafx.formulario_simple_navegador_web.cripto_y_mas.png";
    public static String k_fragmentos_principales_ruta = "/re/templates/formularios/fragmentos/fragmentos_principales.html";
    public static String k_index_ruta = "/re/templates/formulario_simple/index.html";
    public static String k_clave_nombre_apellidos = "nombre_apellidos";
    public static String k_clave_sexo = "sexo";
    public static String k_clave_fecha = "fecha";
    public static String k_clave_hora = "hora";
    public static String k_clave_color = "color";
    public static String k_clave_email = "email";
    public static String k_clave_password = "password";
    public static String k_clave_password_repetida = "password_repetida";
    public static String k_clave_telefono = "telefono";
    public static String k_clave_calle = "calle";
    public static String k_clave_portal_num = "portal_num";
    public static String k_clave_calle_extra = "calle_extra";
    public static String k_clave_piso_num = "piso_num";
    public static String k_clave_puerta_num = "puerta_num";
    public static String k_clave_vivienda_extra = "vivienda_extra";
    public static String k_clave_ciudad = "ciudad";
    public static String k_clave_codigo_postal = "codigo_postal";
    public static String k_clave_provincia_estado = "provincia_estado";
    public static String k_clave_pais = "pais";
    public static String k_clave_fecha_y_hora_disponibilidad = "fecha_y_hora_disponibilidad";
    public static String k_clave_comentarios = "clave_comentarios";
    public static String k_clave_reset = "reset";
    public static String k_clave_submit = "submit";
    public static String k_titulo_tex = "titulo_tex";
    public static String k_mensaje_imagen_tex = "mensaje_imagen_tex";
    public static String k_imagen_ruta_tex = "imagen_ruta_tex";
    public static String k_mensaje_cabecera_tex = "mensaje_cabecera_tex";
    public static String k_formulario_tex = "formulario_tex";
    public static String k_paises_seleccion_ruta = "/re/paises.properties";
    public Map <String, String> index_valores_mapa = new HashMap<>();
    public Map <String, Object> formulario_simple_opciones_mapa = new HashMap<>();
    public web_formularios formulario_simple = new web_formularios() {
        @Override
        public boolean _terminar_formulario(String modo_operacion, oks ok, Object ... extras_array) throws Exception {
            try {
                if (ok.es == false) { return false; }
                super._terminar_formulario(modo_operacion, ok, extras_array);
                if (ok.es == false) { return false; }
                if (modo_operacion.equals(k_fase_procesamiento)) {
                    ser_formulario_valido(ok);
                }
            } catch (Exception e) {
                throw e;
            }
            return ok.es;
        }
    };
    public Map <String, String> formulario_simple_valores_mapa = new HashMap<>();

    public boolean capturar(oks ok, Object... extra_array) throws Exception {
        if (ok.es == false) { return ok.es; }
        construir_formulario_simple(ok);
        if (ok.es == false) { return ok.es; }
        capturar_formulario_simple(formulario_simple_valores_mapa, ok);
        if (ok.es == false) { return ok.es; }
        return ok.es;
    }
    
    public boolean construir_formulario_simple(oks ok, Object... extra_array) throws Exception {
        if (ok.es == false) { return ok.es; }
        ResourceBundle in;
        in = ResourceBundles.getBundle(k_in_ruta);
        try {
            if (ok.es == false) { return ok.es; }
            inweb.modelos_html.formularios.control_entradas entrada_texto = new inweb.modelos_html.formularios.control_entradas();
            entrada_texto.iniciar(k_entradas_tipo_texto, ok);
            if (ok.es == false) { return ok.es; }
            entrada_texto.poner_en_formulario(formulario_simple, k_clave_nombre_apellidos, null, tr.in(in, "Introduzca su nombre y sus apellidos. "), null, ok);
            if (ok.es == false) { return ok.es; }
            inweb.modelos_html.formularios.control_entradas entrada_radio = new inweb.modelos_html.formularios.control_entradas();
            entrada_radio.iniciar(k_entradas_tipo_radio, ok);
            if (ok.es == false) { return ok.es; }
            Map <String, String> valores_mapa = new HashMap<>();
            valores_mapa.put(k_valores_mapa_valor_tex, "XY");
            entrada_radio.poner_en_formulario(formulario_simple, k_clave_sexo, valores_mapa, tr.in(in, "Opción 1/3: ¿Sexo XY (macho)? "), null, ok);
            if (ok.es == false) { return ok.es; }
            entrada_radio = new inweb.modelos_html.formularios.control_entradas();
            entrada_radio.iniciar(k_entradas_tipo_radio, ok);
            if (ok.es == false) { return ok.es; }
            valores_mapa = new HashMap<>();
            valores_mapa.put(k_valores_mapa_valor_tex, "XX");
            entrada_radio.poner_en_formulario(formulario_simple, k_clave_sexo, valores_mapa, tr.in(in, "Opción 2/3: ¿Sexo XX (hembra)? "), null, ok);
            if (ok.es == false) { return ok.es; }
            entrada_radio = new inweb.modelos_html.formularios.control_entradas();
            entrada_radio.iniciar(k_entradas_tipo_radio, ok);
            if (ok.es == false) { return ok.es; }
            valores_mapa = new HashMap<>();
            valores_mapa.put(k_valores_mapa_valor_tex, "..");
            entrada_radio.poner_en_formulario(formulario_simple, k_clave_sexo, valores_mapa, tr.in(in, "Opción 3/3: ¿Otro (No XY y no XX)? "), null, ok);
            if (ok.es == false) { return ok.es; }
            inweb.modelos_html.formularios.control_entradas entrada_fecha = new inweb.modelos_html.formularios.control_entradas();
            entrada_fecha.iniciar(k_entradas_tipo_fecha, ok);
            if (ok.es == false) { return ok.es; }
            entrada_fecha.poner_en_formulario(formulario_simple, k_clave_fecha, null, tr.in(in, "Introduzca su fecha de nacimiento. "), null, ok);
            if (ok.es == false) { return ok.es; }
            inweb.modelos_html.formularios.control_entradas entrada_email = new inweb.modelos_html.formularios.control_entradas();
            entrada_email.iniciar(k_entradas_tipo_email, ok);
            if (ok.es == false) { return ok.es; }
            entrada_email.poner_en_formulario(formulario_simple, k_clave_email, null, tr.in(in, "Introduzca su email. "), null, ok);
            if (ok.es == false) { return ok.es; }
            inweb.modelos_html.formularios.control_entradas entrada_telefono = new inweb.modelos_html.formularios.control_entradas();
            entrada_telefono.iniciar(k_entradas_tipo_telefono, ok);
            if (ok.es == false) { return ok.es; }
            entrada_telefono.poner_en_formulario(formulario_simple, k_clave_telefono, null, tr.in(in, "Introduzca su teléfono. "), null, ok);
            if (ok.es == false) { return ok.es; }
            entrada_texto = new inweb.modelos_html.formularios.control_entradas();
            entrada_texto.iniciar(k_entradas_tipo_texto, ok);
            if (ok.es == false) { return ok.es; }
            entrada_texto.poner_en_formulario(formulario_simple, k_clave_calle, null, tr.in(in, "Introduzca primera parte de su dirección (solo nombre de la calle). "), null, ok);
            if (ok.es == false) { return ok.es; }
            inweb.modelos_html.formularios.control_entradas entrada_numero = new inweb.modelos_html.formularios.control_entradas();
            entrada_numero.iniciar(k_entradas_tipo_numero, ok);
            if (ok.es == false) { return ok.es; }
            entrada_numero.poner_en_formulario(formulario_simple, k_clave_portal_num, null, tr.in(in, "Introduzca el número del portal de su dirección. "), null, ok);
            if (ok.es == false) { return ok.es; }
            entrada_texto = new inweb.modelos_html.formularios.control_entradas();
            entrada_texto.iniciar(k_entradas_tipo_texto, ok);
            if (ok.es == false) { return ok.es; }
            Map <String, Object> opciones_mapa = new HashMap<>();
            opciones_mapa.put(k_opciones_mapa_no_requerido, true);
            entrada_texto.poner_en_formulario(formulario_simple, k_clave_calle_extra, null, tr.in(in, "Introduzca parte extra de su dirección (después se pedirá piso y puerta). "), opciones_mapa, ok);
            if (ok.es == false) { return ok.es; }
            entrada_numero = new inweb.modelos_html.formularios.control_entradas();
            entrada_numero.iniciar(k_entradas_tipo_numero, ok);
            if (ok.es == false) { return ok.es; }
            entrada_numero.poner_en_formulario(formulario_simple, k_clave_piso_num, null, tr.in(in, "Introduzca el piso de su dirección (0 si no hay). "), null, ok);
            if (ok.es == false) { return ok.es; }
            entrada_texto = new inweb.modelos_html.formularios.control_entradas();
            entrada_texto.iniciar(k_entradas_tipo_texto, ok);
            if (ok.es == false) { return ok.es; }
            entrada_texto.poner_en_formulario(formulario_simple, k_clave_puerta_num, null, tr.in(in, "Introduzca la puerta de su dirección. "), opciones_mapa, ok);
            if (ok.es == false) { return ok.es; }
            entrada_texto = new inweb.modelos_html.formularios.control_entradas();
            entrada_texto.iniciar(k_entradas_tipo_texto, ok);
            if (ok.es == false) { return ok.es; }
            entrada_texto.poner_en_formulario(formulario_simple, k_clave_vivienda_extra, null, tr.in(in, "Introduzca parte extra de identificacion de su vivienda (después se pedirá la ciudad). "), opciones_mapa, ok);
            if (ok.es == false) { return ok.es; }
            entrada_texto = new inweb.modelos_html.formularios.control_entradas();
            entrada_texto.iniciar(k_entradas_tipo_texto, ok);
            if (ok.es == false) { return ok.es; }
            entrada_texto.poner_en_formulario(formulario_simple, k_clave_ciudad, null, tr.in(in, "Introduzca la ciudad. "), null, ok);
            if (ok.es == false) { return ok.es; }
            entrada_numero = new inweb.modelos_html.formularios.control_entradas();
            entrada_numero.iniciar(k_entradas_tipo_numero, ok);
            if (ok.es == false) { return ok.es; }
            entrada_numero.poner_en_formulario(formulario_simple, k_clave_codigo_postal, null, tr.in(in, "Introduzca el código postal. "), null, ok);
            if (ok.es == false) { return ok.es; }
            entrada_texto = new inweb.modelos_html.formularios.control_entradas();
            entrada_texto.iniciar(k_entradas_tipo_texto, ok);
            if (ok.es == false) { return ok.es; }
            entrada_texto.poner_en_formulario(formulario_simple, k_clave_provincia_estado, null, tr.in(in, "Introduzca la provincia/estado. "), null, ok);
            if (ok.es == false) { return ok.es; }
            control_selecciones paises_seleccion = new control_selecciones();
            paises_seleccion.iniciar(null, ok);
            if (ok.es == false) { return ok.es; }
            paises_seleccion.cargar_control_con_propiedades(k_paises_seleccion_ruta, ok);
            if (ok.es == false) { return ok.es; }
            paises_seleccion.poner_en_formulario(formulario_simple, k_clave_pais, null, tr.in(in, "Introduzca el país. "), opciones_mapa, ok);
            if (ok.es == false) { return ok.es; }
            inweb.modelos_html.formularios.control_entradas entrada_contraseña = new inweb.modelos_html.formularios.control_entradas();
            entrada_contraseña.iniciar(k_entradas_tipo_password, ok);
            if (ok.es == false) { return ok.es; }
            entrada_contraseña.poner_en_formulario(formulario_simple, k_clave_password, null, tr.in(in, "Introduzca la contraseña que desea establecer. "), null, ok);
            if (ok.es == false) { return ok.es; }
            entrada_contraseña = new inweb.modelos_html.formularios.control_entradas();
            entrada_contraseña.iniciar(k_entradas_tipo_password, ok);
            if (ok.es == false) { return ok.es; }
            entrada_contraseña.poner_en_formulario(formulario_simple, k_clave_password_repetida, null, tr.in(in, "Repita la contraseña que desea establecer. "), null, ok);
            if (ok.es == false) { return ok.es; }
            inweb.modelos_html.formularios.control_entradas entrada_fecha_y_hora = new inweb.modelos_html.formularios.control_entradas() {
                @Override
                public boolean _validar_fecha_y_hora(Object objeto_a_validar, oks ok, Object ... extras_array) throws Exception {
                    try {
                        if (ok.es == false) { return false; }
                        super._validar_fecha_y_hora(objeto_a_validar, ok, extras_array);
                        if (ok.es == false) { return false; }
                        Date date;
                        date = (Date) super._convertir(k_fase_procesamiento, objeto_a_validar, ok, extras_array);
                        if (ok.es == false) { return false; }
                        Date actual_date = new Date();
                        if (actual_date.getTime() > date.getTime()) {
                            ok.setTxt(tr.in(in, "La fecha introducida no puede ser anterior a la fecha actual. "));
                            return ok.es;
                        }
                        Calendar calendar = Calendar.getInstance();
                        calendar.setTime(date);
                        Calendar actual_calendar = Calendar.getInstance();
                        actual_calendar.setTime(actual_date);
                        int año = calendar.get(Calendar.YEAR);
                        int actual_año = actual_calendar.get(Calendar.YEAR);
                        int dia_del_año = calendar.get(Calendar.DAY_OF_YEAR);
                        int actual_dia_del_año = actual_calendar.get(Calendar.DAY_OF_YEAR);
                        int dias_del_año = actual_calendar.getActualMaximum(Calendar.DAY_OF_YEAR);
                        if (año == actual_año) {
                            if ((actual_dia_del_año + 30) < dia_del_año) {
                                ok.setTxt(tr.in(in, "La fecha introducida no puede ser más de 30 días posterior a la actual. "));
                                return ok.es;
                            }
                        } else if (año == (actual_año + 1)) {
                            if (((actual_dia_del_año + 30) % dias_del_año) >= 31) {
                                ok.setTxt(tr.in(in, "La fecha introducida no puede ser más de 30 días posterior a la actual. "));
                                return ok.es;
                            } else if (dia_del_año >= ((actual_dia_del_año + 30) % dias_del_año)) {
                                ok.setTxt(tr.in(in, "La fecha introducida no puede ser más de 30 días posterior a la actual. "));
                                return ok.es;                                
                            }
                        } else {
                            ok.setTxt(tr.in(in, "La fecha introducida no puede ser más de 30 días posterior a la actual. "));
                            return ok.es;
                        }
                    } catch (Exception e) {
                        ok.setTxt(e);
                    }
                    return ok.es;
                }
            };
            entrada_fecha_y_hora.iniciar(k_entradas_tipo_fecha_y_hora, ok);
            if (ok.es == false) { return ok.es; }
            entrada_fecha_y_hora.poner_en_formulario(formulario_simple, k_clave_fecha_y_hora_disponibilidad, null, tr.in(in, "Introduzca la fecha y la hora a partir de la que desea que la información proporcionada quede disponible . "), null, ok);
            if (ok.es == false) { return ok.es; }
            control_textareas textarea = new control_textareas();
            textarea.iniciar(null, ok);
            if (ok.es == false) { return ok.es; }
            textarea.poner_en_formulario(formulario_simple, k_clave_comentarios, null, tr.in(in, "Comentarios adicionales: "), opciones_mapa, ok);
            if (ok.es == false) { return ok.es; }
            inweb.modelos_html.formularios.control_entradas entrada_reset = new inweb.modelos_html.formularios.control_entradas();
            entrada_reset.iniciar(k_entradas_tipo_reset, ok);
            if (ok.es == false) { return ok.es; }
            entrada_reset.poner_en_formulario(formulario_simple, k_clave_reset, null, tr.in(in, "Reiniciar"), null, ok);
            if (ok.es == false) { return ok.es; }
            inweb.modelos_html.formularios.control_entradas entrada_submit = new inweb.modelos_html.formularios.control_entradas();
            entrada_submit.iniciar(k_entradas_tipo_submit, ok);
            if (ok.es == false) { return ok.es; }
            entrada_submit.poner_en_formulario(formulario_simple, k_clave_submit, null, tr.in(in, "Enviar"), null, ok);
            if (ok.es == false) { return ok.es; }
        } catch (Exception e) {
            ok.setTxt(e);
        }
        return ok.es;
    }    

    public boolean capturar_formulario_simple(Map <String, String> valores_mapa, oks ok, Object... extra_array) throws Exception {
        try {
            if (ok.es == false) { return ok.es; }
            formulario_simple.iniciar(k_fragmentos_principales_ruta, valores_mapa, null, ok);
            if (ok.es == false) { return ok.es; }
            formulario_simple.capturar(ok);
            if (ok.es == false) { return ok.es; }
        } catch (Exception e) {
            ok.setTxt(e);
        }
        return ok.es;
    }    
    public boolean procesar_desde_servidor_https(Map<String, String[]> datos_mapa, oks ok, Object ... extras_array) throws Exception {
        ResourceBundle in;
        try {
            if (ok.es == false) { return ok.es; }
            String clave;
            String [] valor;
            Map.Entry nueva_entrada;
            List<Map.Entry<String, Object>> formulario_simple_claves_valor_lista = new LinkedList<>();
            for(Map.Entry<String, String[]> entry: datos_mapa.entrySet()) {
                clave = entry.getKey();
                valor = entry.getValue();
                int i = 0;
                int tam = valor.length;
                while (true) {
                    if (i >= tam) {
                        break;
                    }
                    nueva_entrada = new AbstractMap.SimpleEntry<>(clave, valor[i]);
                    formulario_simple_claves_valor_lista.add(nueva_entrada);
                    i = i + 1;
                }
            }
            construir_formulario_simple(ok);
            if (ok.es == false) { return false; }
            formulario_simple.iniciar(k_fragmentos_principales_ruta, formulario_simple_valores_mapa, null, ok);
            if (ok.es == false) { return false; }
            formulario_simple.importar_valores(formulario_simple_claves_valor_lista, ok);
            if (ok.es == false) { 
                if (ok.id.equals(k_importar_no_encontrado) == false) {
                    return false;
                } else {
                    ok.iniciar();
                }
            }
            formulario_simple.procesar(ok);
            if (ok.es == false) { return false; }
            String error_tex = formulario_simple.valores_mapa.get(k_valores_mapa_mensaje_error_tex);
            if (error_tex.isEmpty()) {
                in = ResourceBundles.getBundle(k_in_ruta);
                error_tex = tr.in(in, "Formulario completado con éxito. ");
                formulario_simple.valores_mapa.put(k_valores_mapa_mensaje_error_tex, error_tex);
            }
            if (ok.es == false) { return false; }
            capturar_formulario_simple(formulario_simple.getValores_mapa(), ok);
            if (ok.es == false) { return false; }
        } catch (Exception e) {
            ok.setTxt(e);
        }
        return ok.es;
    }
    
    public boolean ser_formulario_valido(oks ok, Object... extra_array) throws Exception {
        if (ok.es == false) { return ok.es; }
        ResourceBundle in;
        try {
            String error_tex;
            String password = "";
            String password_repetida = "";
            Map<String, String> valores_mapa;
            for (controles control : formulario_simple._controles_lista) {
                if (control.clave.equals(k_clave_password)) {
                    valores_mapa = (Map<String, String>) control.getValor();
                    password = valores_mapa.get(k_valores_mapa_valor_tex);
                } else if (control.clave.equals(k_clave_password_repetida)) {
                    valores_mapa = (Map<String, String>) control.getValor();
                    password_repetida = valores_mapa.get(k_valores_mapa_valor_tex);
                }
            }
            if (password.equals(password_repetida) == false) {
                in = ResourceBundle.getBundle(k_in_ruta);
                error_tex = tr.in(in, "La clave y la clave repetida no coinciden. ");
                oks ok_1 = new oks();
                formulario_simple.escribir_linea_error(error_tex, ok_1);
                if (ok_1.es == false) {
                    ok.setTxt(ok.getTxt(), ok_1.getTxt());                    
                }
            }
            return ok.es;
        } catch (Exception e) {
            ok.setTxt(e);
        }
        return ok.es;
    }    
}
