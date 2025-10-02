import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
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
        Random ataque = new Random();
        int criatura = ataque.nextInt(3);

        int turnos = 0;

        //combatente
        int vidaCombatente = 50;
        int danoComba = 12;
        int bloqueioComba = 5;
        int habilidadeComba = danoComba * 2;
        //Ocultista
        int vidaOcultista = 30;
        int danoOcul = 7;
        int bloqueioOcul = 2;
        int habilidadeOcul = danoOcul * 2;
        //Especialista
        int vidaEspecialista = 45;
        int danoEspeci = 10;
        int bloqueioEspeci = 5;
        int habilidadeEspeci = danoEspeci * 2;
        //AMIGO IMAGINARIO
        int acao = 0;
        int vidaAI = 100;
        int derreter = 8; //0
        int garra = 3; //1
        int oSino = 6; //2
        int dissolverOcul = vidaOcultista - vidaOcultista;
        int dissolverEspecil = vidaEspecialista - vidaEspecialista;
        int dissolverComb = vidaCombatente - vidaCombatente;


        int classe;

        System.out.println("""
                O paranormal não vem para nossa realidade de maneira fácil, selecione sua classe
                1 - COMBATENTE
                2 - OCULTISTA
                3 - ESPECIALISTA
                """);
        classe = grava.nextInt();

        System.out.println("Quando o Sino tocar, a criatura vai retornar e todo mundo vai morrer.");
        System.out.println("Tudo tá derretendo. Nada parece real, nada é real. Ele é real. A criatura é real, e vocês vão todos morrer.");

        while (vidaAI > 0 || vidaCombatente > 0 || vidaEspecialista > 0 || vidaOcultista > 0) {

            System.out.println("""
                    O que você vai fazer ?
                    1 - ATACAR
                    2 - BLOQUEAR
                    3 - HABILIDADE DE CLASSE (Só pode ser usada a cada 3 rodadas)
                    """);
            acao = grava.nextInt();
            turnos++;
            System.out.println("Turno: " + turnos);


            switch (acao) {
                case 1:
                    if (classe == 1 && acao == 1) {
                        System.out.println("Você ataca com sua acha um dos tentaculos da criatura");
                        vidaAI = vidaAI - danoComba;
                        System.out.println("Você deu " + danoComba);
                        System.out.println("");
                    } else if (classe == 2 && acao == 1) {
                        System.out.println("Você queima com um ritual um dos tentaculos da criatura");
                        vidaAI = vidaAI - danoOcul;
                        System.out.println("Você deu " + danoOcul);
                        System.out.println("");
                    } else if (classe == 3 && acao == 1) {
                        System.out.println("Você atira na criatura, e estilhaça o tentaculo da criatura");
                        vidaAI = vidaAI - danoEspeci;
                        System.out.println("");
                    }
                    break;
                case 2:
                    if (classe == 1 && acao == 2) {
                        System.out.println("A criaura joga uma especie de tinta em você, você sente como se sua pele queimasse, mas consegue evitar um ferimento grava");
                        vidaCombatente = (vidaCombatente + bloqueioComba);
                        System.out.println("");
                    } else if (classe == 2 && acao == 2) {
                        System.out.println("A criatura avança pra cima de você com suas garras mas rapidamente você usa o paranormal para evitar o ataque");
                        vidaOcultista = (vidaOcultista + bloqueioOcul);
                        System.out.println("");
                    } else if (classe == 3 && acao == 2) {
                        System.out.println("A criatura emite um especie de som parecido com um sino, isso machuca seus timpanos mas você consegue abafar um pouco o som");
                        vidaEspecialista = (vidaEspecialista + bloqueioEspeci);
                        System.out.println("");
                    }
                    break;
                case 3:
                    if (classe == 1 && turnos % 3 == 0 && acao == 3) {
                        System.out.println("Com toda sua força você prende sua acha no peito da criatura a fazendo sangrar bastante");
                        vidaAI = vidaAI - habilidadeComba;
                        System.out.println("Você deu " + habilidadeComba);
                        System.out.println("");
                    } else if (classe == 2 && turnos % 3 == 0 && acao == 3) {
                        System.out.println("Você sente o paranormal consumindo você e uma forte rajada de luz sai de você");
                        vidaAI = vidaAI - habilidadeOcul;
                        System.out.println("Você deu " + habilidadeOcul);
                        System.out.println("");
                    } else if (classe == 3 && turnos % 3 == 0 && acao == 3) {
                        System.out.println("Com seu rifle em mãos você estrassalha o peito da criatura");
                        vidaAI = vidaAI - habilidadeEspeci;
                        System.out.println("Você deu " + habilidadeEspeci);
                        System.out.println("");
                    }else {
                        System.out.println("Turno errado, perdeu o turno");
                    }
                    break;
                default:
                    System.out.println("Opção invalida, perdeu o turno");
                    break;

            }
            switch (criatura){
                case 0:
                    if (classe == 1) {
                        System.out.println("A criatura se aproxima de você, ela começa a derreter algum tipo de tinta em você");
                        vidaCombatente = vidaCombatente - derreter;
                        System.out.println(vidaCombatente);
                        System.out.println("Sua vida atual " + vidaCombatente);
                        System.out.println("");
                    } else if (classe == 2) {
                        System.out.println("A criatura se aproxima de você, ela começa a derreter algum tipo de tinta em você");
                        vidaOcultista = vidaOcultista - derreter;
                        System.out.println(vidaOcultista);
                        System.out.println("Sua vida atual " + vidaOcultista);
                        System.out.println("");
                    } else if (classe == 3) {
                        System.out.println("A criatura se aproxima de você, ela começa a derreter algum tipo de tinta em você");
                        vidaEspecialista = vidaEspecialista - derreter;
                        System.out.println("Sua vida atual " + vidaEspecialista);
                        System.out.println("");
                    }
                case 1:
                    if (classe == 1) {
                        System.out.println("Ela avança com tudo e arranha você com suas garras enormes");
                        vidaCombatente = vidaCombatente - garra;
                        System.out.println(vidaCombatente);
                        System.out.println("Sua vida atual " + vidaCombatente);
                        System.out.println("");
                    } else if (classe == 2) {
                        System.out.println("A criatura se aproxima de você, ela começa a derreter algum tipo de tinta em você");
                        vidaOcultista = vidaOcultista - garra;
                        System.out.println(vidaOcultista);
                        System.out.println("Sua vida atual " + vidaOcultista);
                        System.out.println("");
                    } else if (classe == 3) {
                        System.out.println("A criatura se aproxima de você, ela começa a derreter algum tipo de tinta em você");
                        vidaEspecialista = vidaEspecialista - garra;
                        System.out.println("Sua vida atual " + vidaEspecialista);
                        System.out.println("");
                    }
            }
        }
    }
}


