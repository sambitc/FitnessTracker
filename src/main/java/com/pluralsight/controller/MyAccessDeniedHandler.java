///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.pluralsight.controller;
//
//import java.io.IOException;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import org.springframework.security.access.AccessDeniedException;
//import org.springframework.security.web.access.AccessDeniedHandler;
//
//public class MyAccessDeniedHandler implements AccessDeniedHandler {
//
//    private String errorPage;
//
//    public MyAccessDeniedHandler() {
//    }
//
//    public MyAccessDeniedHandler(String errorPage) {
//        this.errorPage = errorPage;
//    }
//
//    public String getErrorPage() {
//        return errorPage;
//    }
//
//    public void setErrorPage(String errorPage) {
//        this.errorPage = errorPage;
//    }
//
//    @Override
//    public void handle(HttpServletRequest request, HttpServletResponse response,
//            AccessDeniedException accessDeniedException)
//            throws IOException, ServletException {
//        
//        
//
//        //do some business logic, then redirect to errorPage url
//        response.sendRedirect(errorPage);
//
//    }
//
//}
