/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacao;

/**
 *
 * @author Admin
 */
public class Student extends Person {
    int notaFinal;
    boolean aprovado;
   
    public void isAprovacao() {
          if (notaFinal >= 5) {
            aprovado = true;
        } else {
            aprovado = false;
        }
    } 
    
    public String getStatusAprovacao() {
        return aprovado ? "Aprovado" : "Reprovado";
    }
    
    
    
    Student(String name,int age,int numberDocuments){
        super(name,age,numberDocuments);
    
    
    }

    void isAprovado() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
