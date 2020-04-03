package com.aoher.ejb;

import javax.ejb.EJB;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet({
        "/",
        "/ejbServlet"
})
public class EJBServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @EJB
    private SampleStatelessBean sampleStatelessBean;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter writer = response.getWriter();
        String message = sampleStatelessBean.hello();
        writer.println(message);
    }
}
