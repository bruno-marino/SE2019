/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.juneexamservice;

import javax.xml.ws.Endpoint;
/**
 *
 * @author biar
 */
public class SoapServer {
    public static void main(String[] args) {
        ExamImpl implementor = new ExamImpl();
        String address = "http://localhost:8080/JuneExamService";
        Endpoint.publish(address, implementor);
        System.out.println("Server ready...");
    }
}