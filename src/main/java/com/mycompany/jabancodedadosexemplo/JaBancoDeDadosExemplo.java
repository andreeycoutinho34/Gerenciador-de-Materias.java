/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jabancodedadosexemplo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author GRVA
 */
public class JaBancoDeDadosExemplo {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        try {
            Class.forName("org.postgresql.Driver"); // carregar o Driver
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
            "postgres", "Anaclara2013");
            if(conexao != null) {
               System.out.println("Banco de dados conectado com sucesso!");
               Statement stm = conexao.createStatement();
               consultaDados(stm);
            }
            else {
               System.out.println("Conexão falhou!"); 
            }
        } catch (ClassNotFoundException ex) {
            // Logger.getLogger(JaBancoDeDadosExemplo.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Driver do banco de dados não localizado");
        } catch (SQLException ex) {
            // Logger.getLogger(JaBancoDeDadosExemplo.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Conexão com o banco falhou");
        }
    }
    
    // Método consultaDados()
    public static void consultaDados(Statement stm){
      String sql = "select isbn, titulo from titulos";
        try {   
            ResultSet resultado = stm.executeQuery(sql);
            while(resultado.next()){
                System.out.println("ISBN:" + resultado.getString("isbn") + 
                                       "Titulo:" + resultado.getString("titulo"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(JaBancoDeDadosExemplo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
