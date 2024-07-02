package persistencia;
// Generated 07/07/2016 09:57:56 by Hibernate Tools 4.3.1



/**
 * Venda generated by hbm2java
 */
public class Venda  implements java.io.Serializable {


     private VendaId id;
     private Integer quantidade;
     private Integer valorunitario;

    public Venda() {
    }

	
    public Venda(VendaId id) {
        this.id = id;
    }
    public Venda(VendaId id, Integer quantidade, Integer valorunitario) {
       this.id = id;
       this.quantidade = quantidade;
       this.valorunitario = valorunitario;
    }
   
    public VendaId getId() {
        return this.id;
    }
    
    public void setId(VendaId id) {
        this.id = id;
    }
    public Integer getQuantidade() {
        return this.quantidade;
    }
    
    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
    public Integer getValorunitario() {
        return this.valorunitario;
    }
    
    public void setValorunitario(Integer valorunitario) {
        this.valorunitario = valorunitario;
    }




}


