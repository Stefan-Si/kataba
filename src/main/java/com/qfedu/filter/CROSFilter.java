package com.qfedu.filter;
import javax.servlet.annotation.WebFilter;
import javax.servlet.*;
import java.io.IOException;

/**
 * projectName: kataba
 *
 * @author: stefan si
 * time: 2020/10/19 17:44
 * description:
 */
@WebFilter("/*")
public class CROSFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

    }
}
