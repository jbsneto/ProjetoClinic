/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clinic.util;

import java.util.ResourceBundle;

/**
 *
 * @author Marcelo
 */
public class MensagensUtil {
    
    private static final String FILE_NAME = "mensagens";
    public static final String SUCESSO_SALVAR = "msg_sucesso_salvar";
    public static final String SUCESSO_DELETAR = "msg_sucesso_deletar";
    public static final String SUCESSO_EDITAR = "msg_sucesso_editar";
    public static final String SUCESSO_SALVAR_GENERICA = "msg_sucesso_salvar_generica";
    public static final String LOGIN_SENHA_INVALIDO = "msg_login_senha_invalido";
    
    public static final String DESEJA_DELETAR = "msg_deseja_deletar";
    public static final String DESEJA_EDITAR = "msg_deseja_editar";
    
    public static final String ERRO_SALVAR = "msg_erro_salvar";
    public static final String ERRO_EDITAR = "msg_erro_editar";
    public static final String ERRO_DELETAR = "msg_erro_deletar";
    public static final String ERRO_CONSULTAR = "msg_erro_consultar";
    public static final String ERRO_CONSULTAR_ID = "msg_erro_consultar_id";
    
    public static final String CADASTRO_NAO_ENCONTRADO = "msg_cadastro_nao_encontrado";
    
    
    
    private static ResourceBundle bundle;
    
    static{
        bundle = ResourceBundle.getBundle(FILE_NAME);
    }
    
    public static String getValor(String chave){
        return bundle.getString(chave);
    }
    
    public static String getValor(String chave, String valor){
        return String.format(bundle.getString(chave), valor);
    }
}
