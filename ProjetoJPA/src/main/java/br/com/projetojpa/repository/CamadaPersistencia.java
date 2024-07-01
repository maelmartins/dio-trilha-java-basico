package br.com.projetojpa.repository;

import java.util.Date;
import java.util.List;

import br.com.projetojpa.model.Empresa;
import br.com.projetojpa.model.RamoAtividade;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class CamadaPersistencia {

	public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("AlgaWorksPU");

        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        // Declarando os repositórios
        RamoAtividades ramoAtividades = new RamoAtividades(em);
        Empresas empresas = new Empresas(em);

        // Buscando as informações do banco
        List<RamoAtividade> listaDeRamoAtividades = ramoAtividades.pesquisar("");
        List<Empresa> listaDeEmpresas = empresas.pesquisar("");
        System.out.println(listaDeEmpresas);

       
        Empresa empresa = new Empresa();
        empresa.setNomeFantasia("João da Silva");
        empresa.setCnpj("41.952.519/0001-57");
        empresa.setRazaoSocial("João da Silva 41952519000157");
        
        empresa.setDataFundacao(new Date());
        empresa.setRamoAtividade(listaDeRamoAtividades.get(0));

        // Salvando a empresa
        empresas.guardar(empresa);

        em.getTransaction().commit();

        // Verificando se a inserção funcionou
        List<Empresa> listaDeEmpresas2 = empresas.pesquisar("");
        System.out.println(listaDeEmpresas2);

        em.close();
        emf.close();
    }
				
	
}
