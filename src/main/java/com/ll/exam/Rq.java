package com.ll.exam;

import com.ll.exam.article.dto.ArticleDto;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

public class Rq {
    private final HttpServletRequest req;
    private final HttpServletResponse resp;
    public Rq(HttpServletRequest req, HttpServletResponse resp) {
        this.req = req;
        this.resp = resp;
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=utf-8");
    }

    public int getIntParam(String paramName, int defaultValue){
        String value = req.getParameter(paramName);

        if(value==null){
            return defaultValue;
        }

        return Integer.parseInt(value);
    }

    public void appendBody(String str){
        try {
            resp.getWriter().append(str);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public void setAttr(String articles, List<ArticleDto> articleDtos) {
        req.setAttribute(articles,articleDtos);
    }

    public void view(String s) {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/jsp/"+s+".jsp");

        try {
            requestDispatcher.forward(req,resp);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
