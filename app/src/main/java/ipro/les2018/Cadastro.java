package ipro.les2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;

import org.json.JSONObject;

import ipro.les2018.Model.Usuario;
import ipro.les2018.Model.Validar;


public class Cadastro extends AppCompatActivity {
    //Elementos da activitie Cadastro
    private EditText edtLogin,edtSenha,edtConfirmaSenha;
    private TextView btnCadastrar, btnCancelar;
    private String login,senha,confirmaSenha,json;
    private boolean resp;
    private Usuario user;
    Validar validar = new Validar ();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_cadastro );

        //identificando os objetos que serão acessados da Activitie
        edtLogin = findViewById ( R.id.edtCadastroLogin );
        edtSenha = findViewById ( R.id.edtCadastroSenha );
        edtConfirmaSenha = findViewById ( R.id.edtCadastroConfirmaSenha );
        btnCadastrar = findViewById ( R.id.btnCadastroCadastrar );
        btnCancelar = findViewById ( R.id.btnCadastroCancelar);
        this.resp = false;
        /*Configuração dos eventos dos botões da tela de Login*/

        //Botão Cadastrar
        btnCadastrar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                    cadastrar();
            }
        } );

        //Botão Cancelar
        btnCancelar.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                onBackPressed ();
            }
        } );


    }
    public boolean cadastrarUsuario(){
        String email =edtLogin.getText ().toString (), senha = edtSenha.getText ().toString ();
        if(validar.validaEmail ( email )&& validar.validaSenha ( senha )) {
            user = new Usuario ( email, senha,"cliente","ativo" );
            return true;
        }else{
            Toast.makeText ( this, "Email ou Senha Fora do Padrão", Toast.LENGTH_SHORT ).show ();
            return false;
        }
    }



    @Override
    public void onBackPressed() {
        Intent it = new Intent ( this, Login.class );
        startActivity ( it );
    }
    private void cadastrar () {
        this.login = edtLogin.getText ().toString ();
        this.senha = edtSenha.getText ().toString ();
        String confirmaSenha = edtConfirmaSenha.getText().toString();
        enviar(login,senha);
        if (this.resp){
            Toast.makeText(this, "Usuário enviado com sucesso", Toast.LENGTH_SHORT).show();
            setResp(false);
        }else{
            Toast.makeText(this, "Falha ao inserir o usuário", Toast.LENGTH_SHORT).show();
        }
    }



    public void enviar(String login, String senha){

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        //String url = "http://192.168.15.4/PhpProject2/api-ins.php?id="+this.login;
        //String url = "http://stormsystems.com.br/api/api-usuario-cons.php?login="+this.login+"&senha="+this.senha+"";
        String url = "http://stormsystems.com.br/api/api-usuario-inse.php?login="+this.login+"&senha="+this.senha+"&tipo=cliente&status=ativo";
        JsonObjectRequest objectRequest = new JsonObjectRequest (
                Request.Method.GET, url, null, new Response.Listener<JSONObject> () {
            @Override
            public void onResponse(JSONObject response) {
                Log.e("Rest response", response.toString ());
                sendMessage (response.toString () );
                setResp(true);
            }
        }, new Response.ErrorListener () {
            @Override
            public void onErrorResponse(VolleyError error) {
                sendMessage(error.toString ());
                setResp(false);

            }
        }
        );


        requestQueue.add ( objectRequest );



    }

    public void setJson(String jsonCad){
    this.json = jsonCad;
    }
    private void sendMessage(String texto){
        Toast.makeText(this, texto, Toast.LENGTH_SHORT).show();
    }
    private void setResp(boolean res){
        resp = res;
    }
}

