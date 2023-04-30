import dominio.Bootcamp;
import dominio.Conteudo;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Aprendendo Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Aprendendo Js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Aulas de Mentoria Java");
        mentoria.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria de Javascript");
        mentoria2.setDescricao("Aulas de Mentoria Js");
        mentoria2.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        bootcamp.getConteudos().add(mentoria2);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:");
        System.out.println("");
            for (Conteudo conteudo : devCamila.getConteudosInscritos()) {
        System.out.println(" * " + conteudo);
        System.out.println("");
        };
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos que faltam concluir Camila:");
        System.out.println("");
            for (Conteudo conteudo : devCamila.getConteudosInscritos()) {
        System.out.println(" * " + conteudo);
        System.out.println("");
        };
        System.out.println("--");
        System.out.println("Conteúdos Concluídos Camila:");
        System.out.println("");
            for (Conteudo conteudo: devCamila.getConteudosConcluidos()){
        System.out.println(" * " + conteudo);
        System.out.println("");                
            };
        System.out.println("---");
        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:");
        System.out.println("");
            for (Conteudo conteudo: devJoao.getConteudosInscritos()){
                System.out.println(" * " + conteudo);
                System.out.println("");
            };
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos que faltam concluir João:");
        System.out.println("");
            for (Conteudo conteudo: devJoao.getConteudosInscritos()){
                System.out.println(" * " + conteudo);
                System.out.println("");
            };
        System.out.println("--");
        System.out.println("Conteúdos Concluidos João:");
        System.out.println("");
            for (Conteudo conteudo: devJoao.getConteudosConcluidos()){
                System.out.println(" * " + conteudo);
                System.out.println("");
            };
            System.out.println("---");
        System.out.println("XP:" + devJoao.calcularTotalXp());
        System.out.println("-------");
    }

}