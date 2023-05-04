package handlers;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.LogoutHandler;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

@Component
public class LogoutSuccessHandler implements LogoutHandler {
    @Override
    public void logout(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) {
        httpServletRequest.getSession().removeAttribute("currentUser");
        try {
            httpServletResponse.sendRedirect(String.format("%s/login", httpServletRequest.getContextPath()));
        } catch (IOException ex) {
            Logger.getLogger(LogoutSuccessHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
