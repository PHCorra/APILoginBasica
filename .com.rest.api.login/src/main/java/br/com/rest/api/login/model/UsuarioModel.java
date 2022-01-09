package br.com.rest.api.login.model;



import javax.persistence.*;

@Entity(name = "tbl_usuarioLogin")
public class UsuarioModel {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer idUsuario;
    @Column(nullable = false, length = 100)
    public String usuarioNome;
    @Column(nullable = false, length = 100)
    public String usuarioLogin;
    @Column(nullable = false, length = 12)
    public String usuarioSenha;


    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsuarioNome() {
        return usuarioNome;
    }

    public void setUsuarioNome(String usuarioNome) {
        this.usuarioNome = usuarioNome;
    }

    public String getUsuarioLogin() {
        return usuarioLogin;
    }

    public void setUsuarioLogin(String usuarioLogin) {
        this.usuarioLogin = usuarioLogin;
    }

    public String getUsuarioSenha() {
        return usuarioSenha;
    }

    public void setUsuarioSenha(String usuarioSenha) {
        this.usuarioSenha = usuarioSenha;
    }
}

