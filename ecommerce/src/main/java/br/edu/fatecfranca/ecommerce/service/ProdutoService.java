package br.edu.fatecfranca.ecommerce.service;

import br.edu.fatecfranca.ecommerce.dto.ProdutoDTO;
import br.edu.fatecfranca.ecommerce.model.Produto;
import br.edu.fatecfranca.ecommerce.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {
    // injeção de dependências - não precisa instanciar objeto para chamar seus métodos
    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> listarTodos() {
        return produtoRepository.findAll();
    }

    public Optional<Produto> buscarPorId(Long id) {
        return produtoRepository.findById(id);
    }
    public Produto salvar(ProdutoDTO produtoDTO) {
        Produto produto = new Produto();
        produto.setNome(produto.getNome());
        produto.setDescricao(produto.getDescricao());
        produto.setPreco(produto.getPreco());
        produto.setUrl_imagem(produto.getUrl_imagem());
        return produtoRepository.save(produto);

    }
}
