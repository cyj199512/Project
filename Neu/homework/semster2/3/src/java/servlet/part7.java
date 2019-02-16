/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import dao.MovieDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import pojo.Movie;

/**
 *
 * @author Richard
 */
public class part7 extends HttpServlet{
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String dbType = request.getParameter("select");
        String type = request.getParameter("part");
        if(type.equals("index")){
            if(dbType.equals("browse" ) ){
                request.getRequestDispatcher("/WEB-INF/jsp/part7_searchMovie.jsp").forward(request, response);
            }else if(dbType.equals("add") ){
                request.getRequestDispatcher("/WEB-INF/jsp/part7_addMovie.jsp").forward(request, response);
            }
        }else if(type.equals("add")){
            
            String title = request.getParameter("title");
            String actor = request.getParameter("actor");
            String actress = request.getParameter("title");
            String gene = request.getParameter("gene");
            String year = request.getParameter("year");
            
            MovieDAO movieDao = new MovieDAO();
            int rs = movieDao.addMovies(title, actor, actress, gene, year);
            if (rs != 0) {
                request.getRequestDispatcher("/WEB-INF/jsp/part7_addSuccess.jsp").forward(request, response);      
            }
        }else if(type.equals("main")){
            request.getRequestDispatcher("/WEB-INF/jsp/part7.jsp").forward(request, response);
                    
        }else if(type.equals("search")){
            HttpSession session = request.getSession();
            String searchType = request.getParameter("searchType");
            String keyword = request.getParameter("keyWord");
            
            MovieDAO movieDao = new MovieDAO();
            List<Movie> movieList = movieDao.searchMovie(searchType, keyword);
            session.setAttribute("movieList", movieList);
            session.setAttribute("keyWord", keyword);
            request.getRequestDispatcher("/WEB-INF/jsp/part7_searchResult.jsp").forward(request, response);
               
            
        }
    
    }
}
