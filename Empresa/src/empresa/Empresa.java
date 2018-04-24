/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

/**
 *
 * @author thierry.59521
 */
public class Empresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Professor prof = new Professor();

        System.out.println("Professor");
        prof.setNome("Thiéry Mayron");
        prof.setCPF("999.999.999.-99");
        prof.setRA(59521);
        prof.setTitulacao("Mestre");
        prof.relatorioMatricula();
        System.out.println("Titulação: " + prof.getTitulacao());

        Segurança sec = new Segurança();

        System.out.println("\nSegurança:");
        sec.setNome("Theslley Mayki");
        sec.setCPF("999.999.999-99");
        sec.setRA(99999);
        sec.setTurno("Noturno");
        sec.relatorioMatricula();
        System.out.println("Turno: " + sec.getTurno());

        Monitor mon = new Monitor();

        System.out.println("\nMonitor: ");
        mon.setNome("Bruno Oliveira");
        mon.setCPF("999.999.999-99");
        mon.setRA(99999);
        mon.setCargaHoraria("8h");

        mon.relatorioMatricula();
        System.out.println("Carga Horária: " + mon.getCargaHoraria());
    }

}
