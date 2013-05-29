package rmi;

import java.rmi.Naming;

public class RmiClient {
	
   public static void main(String[] args) {
      
	   try {
		   
         RmiFunctions obj = (RmiFunctions)Naming.lookup("//localhost/RmiFunctions");
         
         boolean reservaRestaurante = obj.reservarRestaurante(1, 2);
         boolean compraIngressoCinema = obj.comprarIngressoCinema(1, 2, 1);
         boolean compraIngressoTeatro = obj.comprarIngressoTeatro(1, 4, 1);
         
         System.out.println("Mensagem do Servidor: " + (reservaRestaurante ? "Reserva de restaurante realizada" : "Reserva de restaurante n�o realizada"));
         
         System.out.println("Mensagem do Servidor: " + (compraIngressoCinema ? "Compra de ingresso do cinema realizada" : "Compra de ingresso do cinema n�o realizada"));
         
         System.out.println("Mensagem do Servidor: " + (compraIngressoTeatro ? "Compra de ingresso do teatro realizada" : "Compra de ingresso do teatro n�o realizada"));
         
      } catch (Exception ex) {
    	  
         System.out.println("Exception: " + ex.getMessage());
         
      }
	   
   }
   
}
