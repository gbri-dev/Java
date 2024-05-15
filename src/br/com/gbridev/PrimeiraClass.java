package br.com.gbridev;

public class PrimeiraClass {
   public static void main(String args[]) {
       String ambiente = args[0];
       if(ambiente.equalsIgnoreCase("dev")){
           System.out.println("Hello World, executando em ambiente de desenvolvimento!");
       }
   }
}
