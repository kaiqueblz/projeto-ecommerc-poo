package DTO;

public class PedidoDTO {
    private int id;
    private boolean status;
    private String data;
    private double valorTotal;
    private int quantidadeProduto;
    private ProdutoDTO produto;

    public PedidoDTO(int id, String data, boolean status, double valorTotal) {
        this.id = id;
        this.data = data;
        this.status = status;
        this.valorTotal = valorTotal;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    public ProdutoDTO getProduto() {
        return produto;
    }

    public void setProduto(ProdutoDTO produto) {
        this.produto = produto;
    }
    
    public void adicionarProduto(ProdutoDTO objProdutoDto){
        this.setQuantidadeProduto(this.getQuantidadeProduto()+1);
        this.setValorTotal(this.getValorTotal()+objProdutoDto.getPreco());
    }
    
    public void removerProduto(ProdutoDTO objProdutoDt){
        this.setQuantidadeProduto(this.getQuantidadeProduto()-1);
    }
    
    public void finalizarPedido(ProdutoDTO objProdutoDt){
        
    }
    
    }
