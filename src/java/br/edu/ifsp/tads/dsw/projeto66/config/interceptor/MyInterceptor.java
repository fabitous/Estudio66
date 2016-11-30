package br.edu.ifsp.tads.dsw.projeto66.config.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class MyInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        
        String uri = request.getRequestURI();

        if(uri.endsWith("agenda")) {
            if (request.getSession().getAttribute("usuariologado") != null) {
                if (request.getSession().getAttribute("level").equals("adm")) {
                    return true;                                
                } else {
                    System.out.print("-.-");
                    response.sendRedirect("sorry");
                    return false;
                }   
            } else {
                response.sendRedirect("welcome");
                return false;
            }
        }
        
        if(uri.endsWith("welcome") || uri.endsWith("login") || uri.endsWith("logar") || uri.endsWith("cadastro") || uri.endsWith("reservas") || uri.endsWith("sorry") || uri.endsWith("logue")) {
            return true;
        } else if (uri.endsWith("agenda_ensaio") || uri.endsWith("agenda_estudo") || uri.endsWith("agenda_gravacao")) {
            if (request.getSession().getAttribute("usuariologado") != null) {
                return true;
            } else {
                response.sendRedirect("logue");
                return false;
            }
        }
        
        if(uri.endsWith("opcoes_ensaio") || uri.endsWith("opcoes_estudo") || uri.endsWith("opcoes_gravacao")) {
            if (request.getSession().getAttribute("usuariologado") != null) {
                return true;
            } else {
                response.sendRedirect("logue");
                return false;
            }
        }
        
        if(uri.endsWith("/ensaio") || uri.endsWith("/estudo") || uri.endsWith("/gravacao")) {
            if (request.getSession().getAttribute("usuariologado") != null) {
                return true;
            } else {
                response.sendRedirect("logue");
                return false;
            }
        }
        
        response.sendRedirect("welcome");
        return false;
    }
}