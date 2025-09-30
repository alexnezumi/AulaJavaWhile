import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main (String[]args){
       /*
        Scanner grava = new Scanner(System.in);

        int tentativas = 0;

            while (tentativas < 3){

            System.out.println("Insira seu nome de Usuario");
            String usuario = grava.next();
            System.out.println("Insira sua senha");
            String senha = grava.next();


            if (usuario.equals("Banana") && senha.equals("123")){
                System.out.println("Bem vindo ao sistema");
                tentativas = tentativas + 3;
            }
            else{
                tentativas++;
                if (tentativas < 3){
                    System.out.println("Negado, tente novamente");
                }
                else {
                    System.out.println("Tentativas demais, login bloqueado");
                }

            }
            }
        */

        /*
        Scanner grava = new Scanner(System.in);
        int num = 0, quant=0;
        double media = 0.0;

        while (num >= 0 ){
            System.out.println("Digite um numero inteiro, quando quiser sair do progama digite um numero negativo");
            num = grava.nextInt();
            quant++;

            if (num >= 0) {
            media = media + num;
            }
            else{
              quant--;
              media = media / quant;
              System.out.println(media);
            }
        }
         */

        Scanner grava = new Scanner(System.in);
        Random num = new Random();

        //combatente
        int vidaCombatente = 50;
        int danoComba = 12;
        int bloqueioComba = 5;
        int HabilidadeComba = danoComba*2;
        //Ocultista
        int vidaOcultista = 30;
        int danoOcul = 7;
        int bloqueioOcul = 2;
        int habilidadeOcul = bloqueioOcul*2;
        //Especialista
        int vidaEspecialista = 45;
        int danoEspeci = 10;
        int bloqueioEspeci = 5;
        int habilidadeEspeci = vidaEspecialista+5;
        //AMIGO IMAGINARIO
        int acao = 0;
        int vidaAI = 100;
        int derreter = 8;
        int garra = 3;
        int oSino = 6;
        int dissolverOcul = vidaOcultista - vidaOcultista;
        int dissolverEspecil = vidaEspecialista - vidaEspecialista;
        int dissolverComb = vidaCombatente - vidaCombatente;


        int classe, ataques;
        ataques = num.nextInt(3);

        System.out.println("""
                O paranormal não vem para nossa realidade de maneira fácil, selecione sua classe
                1 - COMBATENTE
                2 - OCULTISTA
                3 - ESPECIALISTA
                """);
        classe = grava.nextInt();

        System.out.println("Quando o Sino tocar, a criatura vai retornar e todo mundo vai morrer.");
        System.out.println("Tudo tá derretendo. Nada parece real, nada é real. Ele é real. A criatura é real, e vocês vão todos morrer.");

        while (vidaAI >= 0){
            System.out.println("""
                    O que você vai fazer ?
                    1 - ATACAR
                    2 - BLOQUEAR
                    3 - HABILIDADE DE CLASSE
                    """);
            acao = grava.nextInt();
            }
            if (classe == 1 && acao ==1){
                System.out.println("Você pega sua acha e corta um dos tentaculos da criatura " + danoComba + " de dano");
                vidaAI = vidaAI- danoComba;
            } else if (classe == 1 && acao == 2) {
                System.out.println("Você bloqueia o ataque da criatura ");




            }

        }
    }


