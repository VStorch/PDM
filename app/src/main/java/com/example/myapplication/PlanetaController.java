package com.example.myapplication;

import java.util.ArrayList;

public class PlanetaController {
    PlanetaDAO planetaDAO;

    public PlanetaController() {
        planetaDAO = new PlanetaDAO();
    }

    public void addPlaneta(Planeta planeta) {
        // Verifica a lógica de negócio aqui
    }

    public ArrayList<Planeta> getPlaneta() {
        return planetaDAO.getPlanetas();
    }

    public ArrayList<String> getNomePlanetas() {
        ArrayList<String> nomes = new ArrayList<String>();
        for (Planeta planeta: planetaDAO.getPlanetas()) {
            nomes.add(planeta.nome);
        }
        return nomes;
    }

}
