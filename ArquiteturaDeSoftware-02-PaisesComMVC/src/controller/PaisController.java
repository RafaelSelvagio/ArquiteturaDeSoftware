package controller;

import java.util.ArrayList;
import java.util.List;

import model.Pais;
import view.PaisView;

public class PaisController {
	// Cria uma coleção em forma de List, para armazenar objetos do tipo Pais
    private List<Pais> listaDePaises;
    
    // Cria um objeto paisView, para poder exibir informações ao usuário
    private PaisView paisView;

    // Ao criar um PaisController, o método construtor tbm instancia a lista de países e a classe paisView
    public PaisController() {
        listaDePaises = new ArrayList<>();
        paisView = new PaisView();
    }

    // Método adicionar país
    public void adicionarPais(String nome, String capital) {
    	// Cria um objeto do tipo Pais
        Pais pais = new Pais(nome, capital);
        
        // Adiciona um objeto Pais na listaDePaises usando o método add
        listaDePaises.add(pais);
    }

    // Método exibir lista de países
    public void exibirListaDePaises() {
    	// Utiliza paisView para invocar o método exibirListaDePaises
        paisView.exibirListaDePaises(listaDePaises);
    }
    
    // Método remover país
    public void removerPais(String nomePaisRemover) {
    	// Variável do tipo boolean (true/false) que terá a informação se o país foi ou não removido, iniciada com false
        boolean paisRemovido = false;
        
        // Estrutura de repetição "for" preparada para trabalhar com coleções, também conhecida como "foreach"
        for (Pais pais : listaDePaises) {
        	
        	// Estrutura condicional que verifica se o nome do país da lista é igual ao nome do país recebido por parametro
        	// Método equalsIgnoreCase -> ignora letras maiúsculas e minúsculas
            if (pais.getNome().equalsIgnoreCase(nomePaisRemover)) {
            	// Método que remove o país da lista
            	listaDePaises.remove(pais);
            	
            	// Atribui true para variável de controle que guarda a informação true/false sobre a remoção do país d alista
                paisRemovido = true;
                
                // Ao remover o país da lista, não temos a necessidade de continuar percorrendo a lista, por isso, o comando break termina os loops do for
                break;
            }
        }

        // Invoca o método removerPais do paisView e passa a informação (paisRemovido) se o país foi removido
    	paisView.removerPais(paisRemovido);
    }
    
    
    public void limparListaDePaises() {
    	listaDePaises.clear();
    	paisView.limparListaDePaises();
    }
}
