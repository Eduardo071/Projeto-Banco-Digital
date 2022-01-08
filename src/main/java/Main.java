import javax.sound.midi.Soundbank;
import javax.swing.*;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Cliente venilton = new Cliente();
        venilton.setNome("Venilton");
        venilton.setCelular("+55 (34) 99536-2054");
        venilton.setCpf("320.596.415-09");
        venilton.setNomedamae("Marilene Silva Chaves");
        venilton.setNomedopai("Paulo Matheus Braga");
String B = "320.596.415-09";

        Conta cc_do_Venilton = new ContaCorrente(venilton);
        Conta poupanca_do_Venilton = new ContaPoupanca(venilton);


        Cliente Eduardo = new Cliente();
        Eduardo.setNome("Eduardo");
        Eduardo.setCelular("+55 (34) 99339-8973");
        Eduardo.setCpf("197.561.734-00");
        Eduardo.setNomedopai("Gilberto Borges Alves");
        Eduardo.setNomedamae("Simone Pereira De Lima");
        String A;

        Conta cc_do_Eduardo = new ContaCorrente(Eduardo);
        Conta poupanca_do_Eduardo = new ContaPoupanca(Eduardo);

        cc_do_Venilton.depositar(1500);
        cc_do_Venilton.transferir(850.63, poupanca_do_Eduardo);


            System.out.println("\n" + "Seja muito Bem Vindo Eduardo, segue abaixo informações: " + "\n");
            cc_do_Eduardo.imprimirExtrato(cc_do_Eduardo.saldo);
            poupanca_do_Eduardo.imprimirExtrato(poupanca_do_Eduardo.saldo);

             System.out.println("\n" + "Seja muito Bem Vindo Venilson, segue abaixo informações: " + "\n");
             cc_do_Venilton.imprimirExtrato(cc_do_Venilton.saldo);
             poupanca_do_Venilton.imprimirExtrato(poupanca_do_Venilton.saldo);


    }

}
