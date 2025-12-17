import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso introdutório de Java.");
        curso1.setCargaHoraria(20);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Curso introdutório de JavaScript.");
        curso2.setCargaHoraria(20);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria java");
        mentoria.setDescricao("Descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("====================");
        System.out.println("Conteúdos inscritos de "+ devCamila.getNome() +": " + devCamila.getConteudosInscritos());
        System.out.println("XP: " + devCamila.calcularTotalXp());
        devCamila.progredir();
        System.out.println("Conteúdos Concluidos de "+ devCamila.getNome() +": " + devCamila.getConteudosConcluidos());

        System.out.println("====================");
        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de "+ devJoao.getNome() +": " + devJoao.getConteudosInscritos());
        System.out.println("XP: " + devJoao.calcularTotalXp());
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("Conteúdos concluidos de "+ devJoao.getNome() +": " + devJoao.getConteudosConcluidos());


        System.out.println("====================");
        System.out.println("Conteúdos inscritos de "+ devCamila.getNome() +": " + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos inscritos de "+ devJoao.getNome() +": " + devJoao.getConteudosInscritos());
        System.out.println("XP: " + devCamila.calcularTotalXp());
        System.out.println("XP: " + devJoao.calcularTotalXp());

        Dev devGabriel = new Dev();
        devGabriel.setNome("Gabriel");
        devGabriel.progredir();
    }
}
