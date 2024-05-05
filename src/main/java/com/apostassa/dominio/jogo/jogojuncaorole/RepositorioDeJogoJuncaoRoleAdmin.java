package com.apostassa.dominio.jogo.jogojuncaorole;

import java.util.List;

public interface RepositorioDeJogoJuncaoRoleAdmin {

    public void adicionarRoleAUmJogo(JogoJuncaoRole jogoJuncaoRole) throws AdicionarJogoJuncaoRoleException;

    public void removerRoleDeUmJogo(String roleJogoId, String jogoId) throws RemoverJogoJuncaoRoleException;

    public List<String> pegarTodosJogoJuncaoRolePorJogoId(String jogoId);
}
