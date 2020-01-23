package com.mycompany.tennis.webui.controller;

import com.mycompany.tennis.Entity.Joueur;
import com.mycompany.tennis.service.JoueurService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ListJoueurServlete extends HttpServlet {
    JoueurService joueurService ;
    public ListJoueurServlete() {
         this.joueurService = new JoueurService();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Joueur> joueurList = joueurService.getAllJoueur() ;
        request.setAttribute("listJoueurs", joueurList);
        System.out.println(joueurList.size());
        System.out.println("coucu");
        request.getRequestDispatcher("lists.jsp").forward(request,response);

    }
}
