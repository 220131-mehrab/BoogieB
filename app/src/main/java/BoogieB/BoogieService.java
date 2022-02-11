package BoogieB;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class BoogieService extends HttpServlet {
    private BoogieRepo boogieRepo;
    public BoogieService(BoogieRepo boogieRepo) {
        this.boogieRepo = boogieRepo;
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        for (String boogies : boogieRepo.getBoogieBees()) {
            resp.getWriter().println(boogies);
        }
    }
}

