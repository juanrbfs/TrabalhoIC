/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

/**
 *
 * @author HugoEduardo
 */
public class DocenteRestricao {
    private int docente; //codigo de docente
    private int timeslot;//codigo de timeslot

    /**
     * @return the docente
     */
    public int getDocente() {
        return docente;
    }

    /**
     * @return the timeslot
     */
    public int getTimeslot() {
        return timeslot;
    }

    /**
     * @param docente the docente to set
     */
    public void setDocente(int docente) {
        this.docente = docente;
    }

    /**
     * @param timeslot the timeslot to set
     */
    public void setTimeslot(int timeslot) {
        this.timeslot = timeslot;
    }
    
}
