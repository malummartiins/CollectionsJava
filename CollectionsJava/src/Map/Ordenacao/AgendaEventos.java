package Map.Ordenacao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        Evento evento = new Evento(nome, atracao); // instanciei o evento
        eventosMap.put(data, evento);
    }

    public void exibirAgenda() { // uso treeMap pq quero organizar em ordem crescente
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento(){
        
    }

    // TESTANDO
    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
    }

}
