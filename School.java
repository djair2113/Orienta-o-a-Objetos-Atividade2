/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplicacao;

/**
 *
 * @author Admin
 */
public class School {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person pepleo = new Person("Rodrigo Guanabara",28,123456);
        
        
        
        System.out.println(pepleo.name + " " +  pepleo.age +" " + pepleo.numberDocuments);
        
       Teacher DS1 = new Teacher("Wagner",45,678910);
       
       
        System.out.println(DS1.name + " " + DS1.age + " " + DS1.numberDocuments );
        
        Student Std1 = new Student("Joao Pedro",17,8952414);
            
            Std1.notaFinal = 5;
                
                System.out.println(Std1.name + " " + Std1.age + " " + Std1.numberDocuments);
                
                
                
                Std1.isAprovacao();
                
                System.out.println(Std1.name + " está " + Std1.getStatusAprovacao());
                
                
                
                
        
       
       
               
       
        
        // TODO code application logic here
    }
    
}
