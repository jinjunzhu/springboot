package org.boot.support;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.filter.OncePerRequestFilter;
import org.thymeleaf.util.StringUtils;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author:jinjunzhu
 * @Description:
 * @Date: Created in 2018/6/23
 */
public class ValidateCodeFilter extends OncePerRequestFilter {

    private Logger logger = LoggerFactory.getLogger(ValidateCodeFilter.class);

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        response.setHeader("X-Frame-Options", "SAMEORIGIN");
        if(StringUtils.equals("/login", request.getRequestURI()) && StringUtils.equalsIgnoreCase(request.getMethod(), "post")) {
            logger.info(request.getQueryString());
        }
        filterChain.doFilter(request, response);
    }
}
