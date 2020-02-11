/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.juneexamclient;

import com.mycompany.juneexamservice.Director;
import com.mycompany.juneexamservice.Exam;
import com.mycompany.juneexamservice.ExamImplService;
import com.mycompany.juneexamservice.Movie;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author biar
 */
public class Client {
    public static void main(String[] args) {
        List<Integer> movies = new LinkedList<>();
        try {
            ExamImplService service = new ExamImplService();
            Exam port = service.getExamImplPort();
            
            movies = port.getMovies();
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        Director director;
        Movie movie;
        for(int i = 0; i < movies.size(); i++) {
            try {
                ExamImplService service = new ExamImplService();
                Exam port = service.getExamImplPort();
                
                movie = port.getMovie(movies.get(i));
                director = port.getDirector(movie.getDirectorID());

                System.out.println("Movie " + movie.getID() + ": "
                                   + movie.getTitle() + " (" + movie.getYear() + ")\n"
                                   + "Director " + director.getID() + ": "
                                   + director.getName() + " (" + director.getYearOfBirth() + ")\n");

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}