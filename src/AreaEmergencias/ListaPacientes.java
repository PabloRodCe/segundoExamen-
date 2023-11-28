/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AreaEmergencias;

import java.util.ArrayList;

/**
 *
 * @author Student
 */
public class ListaPacientes {

    private ArrayList<Pacientes> listaPacientes = new ArrayList<>();

    public void AgregarPaciente(int id, String nombre, String fecha, String horaLlegada, String horaSalida, String clasificacion) {
        Pacientes paciente = new Pacientes();
        if (listaPacientes.isEmpty() && paciente.getClasificacion().equals("rojo")) {
            listaPacientes.add(paciente);

        } else if (paciente.getClasificacion().equals("amrillo") && listaPacientes.isEmpty()) {
            listaPacientes.add(paciente);

        } else if (paciente.getClasificacion().equals("verde") && listaPacientes.isEmpty()) {
            listaPacientes.add(paciente);
        }

    }

    public void atendido(String horaSalida, int id) {
        Pacientes paciente = new Pacientes();
        for (Pacientes listaPaciente : listaPacientes) {
            
        

        if (paciente.getId() == id && paciente.getHoraSalida().equals(horaSalida)) {
            listaPacientes.remove(paciente.getId());

        }
    }
    }

    public void buscarPaciente(int id) {
        Pacientes paciente = new Pacientes();
        for (Pacientes listaPaciente : listaPacientes) {
            if (paciente.getId() == id) {

            }
            return;
        }
    }

}
