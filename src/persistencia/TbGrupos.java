/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

/**
 *
 * @author Aluno
 */
public class TbGrupos implements java.io.Serializable {
    private String codigog;
    private String  nome;
    private int  codun;
    public TbGrupos(){
    
}
   
public TbGrupos(String codigog, int codun){
    this.codigog = codigog;
    this.codun = codun;
    
}
public TbGrupos(String codigog, String nome, int codun){
    this.codigog = codigog;
    this.nome = nome;
    this.codun = codun;
}
public String getCodigog() {
    return this.codigog;
}
}
