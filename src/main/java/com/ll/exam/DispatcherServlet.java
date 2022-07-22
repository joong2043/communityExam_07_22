package com.ll.exam;

import com.ll.exam.article.ArticleController;
import com.ll.exam.member.MemberController;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/user/*")
public class DispatcherServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        Rq rq = new Rq(req,resp);

        MemberController memberController = new MemberController();
        ArticleController articleController = new ArticleController();

        String url = req.getRequestURI();

        switch (url){
            case "/user/article/list/free":
                articleController.showList(rq);
            case "/user/member/login":
                memberController.showList(rq);
        }
    }
}
