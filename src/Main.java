import java.time.LocalDate;

import desafio.dominio.Bootcamp;
import desafio.dominio.Curso;
import desafio.dominio.Dev;
import desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args)  {
      Curso curso1 = new Curso();
      curso1.setTitulo("curso java");
      curso1.setDescricao("descricao curso java");
      curso1.setCargaHoraria(8);

      Curso curso2 = new Curso();
      curso2.setTitulo("curso js");
      curso2.setDescricao("descricao curso js");
      curso2.setCargaHoraria(4);         


      Mentoria mentoria = new Mentoria();
      mentoria.setTitulo("mentoria de java");
      mentoria.setDescricao("descrição mentoria java");
      mentoria.setData(LocalDate.now());

    //   System.out.println(curso1);
    //   System.out.println(curso2);
    //   System.out.println(mentoria);

    Bootcamp bootcamp = new Bootcamp();
    bootcamp.setNome("Bootcamp Java Developer");
    bootcamp.setDescricao("Descrição Bootcamp Java Developer");
    bootcamp.getConteudos().add(curso1);
    bootcamp.getConteudos().add(curso2);
    bootcamp.getConteudos().add(mentoria);


    Dev devWellington = new Dev();
    devWellington.setNome("Wellington");
    devWellington.inscreverBootcamp(bootcamp);
    
    devWellington.progredir();
    devWellington.progredir();

    System.out.println("--");
    System.out.println("Conteúdos Incritos Wellington:" + devWellington.getConteudosInscritos());
    System.out.println("Conteúdos Concluidos Wellington:" + devWellington.getConteudosConcluidos());  
    System.out.println("XP:" + devWellington.calcularTotalXp());
    System.out.println("-------");
    System.out.println("Quantidade de cursos para terminar o Bootcamp:" + devWellington.contadorCurso());


    System.out.println("----------------------------");
    
    Dev devMariano = new Dev();
    devMariano.setNome("Mariano");
    devMariano.inscreverBootcamp(bootcamp);
    
    devMariano.progredir();
    devMariano.progredir();
    devMariano.progredir();

    System.out.println("--");
    System.out.println("Conteúdos Incritos Mariano:" + devMariano.getConteudosInscritos());
    System.out.println("Conteúdos Concluidos Mariano:" + devMariano.getConteudosConcluidos());
    System.out.println("XP:" + devMariano.calcularTotalXp());  

    System.out.println("-------");
    System.out.println("Quantidade de cursos para terminar o Bootcamp:" + devMariano.contadorCurso());

   
    }
}
