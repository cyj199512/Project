/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import dao.BooksDao;
import dao.ComputersDAO;
import dao.MusicsDAO;
import java.io.IOException;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import pojo.Books;
import pojo.Computers;
import pojo.Musics;


/**
 *
 * @author Richard
 */
public class Cart extends HttpServlet {
     
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String part = req.getParameter("part5");
        HttpSession session = req.getSession();
        if(session.getAttribute("p5") != null){
             session.removeAttribute("p5");
        }
        session.setAttribute("p5", "cart");
        req.getRequestDispatcher("/WEB-INF/jsp/part5.jsp").forward(req, resp);
    }
    
     @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        String option = req.getParameter("tt");
       

        cartAuthentication(option, session, req, resp);   
    }
    
    
     public void cartAuthentication(String tt, HttpSession session, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
         
         if(tt.equals("Jbook")){
            BooksDao book = new BooksDao();
            
            HashSet<String> resultbooks= new HashSet<String>();
            try{
                String[] willbooks = request.getParameterValues("books");
                if(!book.getAll().isEmpty()){
                    List<Books> listBook = book.getAll();
                    for(Books bookl: listBook){
                        resultbooks.add(bookl.getName()); 
                    }
                }
                if(willbooks != null){
                    for(String willbook : willbooks){
                        if(book.getBooks(willbook).isEmpty()){
                            
                            book.addBooks(willbook);
                            resultbooks.add(willbook);  
                        }else{ 
                            book.deleteBooks(willbook);
                            resultbooks.remove(willbook);
                        }
                    }
                }
            }catch(Exception e){}  
           
            String[] rbook = new String[resultbooks.size()];
            Iterator<String> iterator = resultbooks.iterator();
            int i =0;
            while(iterator.hasNext()){
                String st=iterator.next();
                rbook[i] = st;
                i++;

            }
            session.removeAttribute("books");
            session.setAttribute("books", rbook);

            request.getRequestDispatcher("/WEB-INF/jsp/part5.jsp").forward(request, response);
            
            
        }
        else if(tt.equals("Jcomputer")){
            ComputersDAO computer = new ComputersDAO();
            HashSet<String> resultcomputers= new HashSet<String>();
           
            try{
                if(! computer.getAll().isEmpty()){
                    List<Computers> listComputer = computer.getAll();
                    for(Computers computerl: listComputer){
                       resultcomputers.add(computerl.getName()); 
                    }
                }
                String[] willcomputers = request.getParameterValues("computers");
                if(willcomputers != null){
                    for(String willcomputer : willcomputers){
                        if(computer.getComputers(willcomputer).isEmpty()){
                            computer.addComputers(willcomputer);
                            resultcomputers.add(willcomputer);  
                        }else{
                             
                            computer.deleteComputers(willcomputer);
                            resultcomputers.remove(willcomputer);
                        }
                    }
                }
            }catch(Exception e){} 
            
            String[] rcomputer = new String[resultcomputers.size()];
            Iterator<String> iterator = resultcomputers.iterator();
            int i =0;
            while(iterator.hasNext()){
                String st=iterator.next();
                rcomputer[i] = st;
                i++;
                
            }

            session.removeAttribute("computers");
            session.setAttribute("computers", rcomputer);
            request.getRequestDispatcher("/WEB-INF/jsp/part5.jsp").forward(request, response);
           

        }else if(tt.equals("Jmusic")){
            MusicsDAO music = new MusicsDAO();
            HashSet<String> resultmusics= new HashSet<String>();
            try{
                if(! music.getAll().isEmpty()){
                    List<Musics> listMusic = music.getAll();
                    for(Musics musicsl: listMusic){
                       resultmusics.add(musicsl.getName()); 
                    }
                }
                String[] willmusics = request.getParameterValues("musics");
                if(willmusics != null){
                    for(String willmusic : willmusics){
                        if(music.getMusics(willmusic).isEmpty()){
                            music.addMusics(willmusic);
                            resultmusics.add(willmusic);  
                        }else{
                            music.deleteMusics(willmusic);
                            resultmusics.remove(willmusic);
                        }
                    }
                }
            }catch(Exception e){} 
            
            String[] rmusic = new String[resultmusics.size()];
            Iterator<String> iterator = resultmusics.iterator();
            int i =0;
            while(iterator.hasNext()){
                String st=iterator.next();
                rmusic[i] = st;
                i++;
                
            }

            session.removeAttribute("musics");
            session.setAttribute("musics", rmusic);
            request.getRequestDispatcher("/WEB-INF/jsp/part5.jsp").forward(request, response);
          
        }
     
     }
}
