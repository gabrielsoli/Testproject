package cursoselenium;

import org.openqa.selenium.WebDriver;

public class MultinotasPage {

	private DSL dsl;
	
	
	public MultinotasPage(WebDriver driver) {
		
		dsl = new DSL(driver);
		
	}
	
	//////////////////// login ////////////////
	
	public void setLogin(String email) {
		
		dsl.escrevernocampo("username", email);
	}
	
	public void setSeha(String senha) {
		
		dsl.escrevernocampo("password", senha);
	}
	
	public void logar() {
		
		dsl.clicarnocampo("regularsubmit");
	}


//////////////////// criar grupo empresarial ///////// 
	
	public void setCodigo(String codigo) {
		
		dsl.escrevernocampo("codigo",codigo);
		
	}
	
	public void clicarCampoDescricao() {
		
		dsl.clicarnocampo("descricao");
	}
	
	public void setDescricao (String descricao) {
		
		dsl.escrevernocampo("descricao", descricao);
	}
	
	public void saveByCss() {
		
		dsl.clicarporCSS(".btn-save");
	}
	
	
	////////////////// Criar empresa /////////////
	
	public void setNomeFantasia(String nome_fantasia) {
		
		dsl.escrevernocampo("nome_fantasia",nome_fantasia);
	}
	
	public void setRazaoSocial (String razao_social) {
		
		dsl.escrevernocampo("razaosocial",razao_social);
	} 
	
	public void setCNPJ (String cnpj) {
		
		dsl.escrevernocampo("cnpj",cnpj);
	}
	
	public void setLogradouro(String logra) {
		
		dsl.escrevernocampo("logradouro",logra);
	}
	
	public void setNumeroLograd(String num) {
		
		dsl.escrevernocampo("logradouro",num);
	}
	
	public void setCep (String cep) {
		
		dsl.escrevernocampo("cep",cep);
	}
	
	public void selecionarUF(String uf) {
		
		dsl.selecionarvalor("uf", uf);
	}


	public void selecionarMunicipio (String municipio) {
		
		dsl.selecionarvalor("municipio", municipio);
	}


	public void setBairro (String bairro) {
		
		dsl.escrevernocampo("bairro", bairro);
	}
	
	public void setEmail(String email) {
		
		dsl.escrevernocampo("email_notificacao",email);
	}

	
	public void selecionaGEmpresarial (String grupo) {
		
		dsl.selecionarvalorporCSS("#grupoempresarial > .ui-select-match > .btn", grupo);
	
	}

	
	public void salvarempresa() {
		
		dsl.clicarporCSS(".btn-save");
	}
	
	public void criarempresa() {
		
		dsl.clicarnocampo("regularsubmit");
	}
}
