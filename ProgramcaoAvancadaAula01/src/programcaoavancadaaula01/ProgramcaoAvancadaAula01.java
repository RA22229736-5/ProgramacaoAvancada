/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programcaoavancadaaula01;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author miske
 */
public class ProgramcaoAvancadaAula01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello world!");
        JOptionPane.showMessageDialog(null, "OI");

        int idade = 20;
//        
//        double preco = 12.5;
//        
        String nome = "Kédma";
        System.out.println("Nome que está na tela é " + nome);
//        Scanner ler = new Scanner(System.in);
//        
//        System.out.println("Digite a idade de uma pessoa ");
//        idade = ler.nextInt();
        System.out.println("A idade digitada foi " + idade);
        String idadeStr = JOptionPane.showInputDialog("Digite a idade de uma pessoa");
        idade = Integer.parseInt(idadeStr);

        JOptionPane.showMessageDialog(null, "A idade digitada foi " + idade);

    }

}
