package br.com.casacodigo.loja.daos;

import br.com.casacodigo.loja.models.Produto;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@org.springframework.transaction.annotation.Transactional
public class ProdutoDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public void gravar(Produto produto){
        entityManager.persist(produto);
    }

    public List<Produto> listar() {
        return entityManager.createQuery("select p from Produto p",Produto.class).getResultList();
    }
}

