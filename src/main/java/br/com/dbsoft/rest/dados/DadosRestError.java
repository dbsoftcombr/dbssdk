package br.com.dbsoft.rest.dados;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import br.com.dbsoft.rest.interfaces.IRestError;
import br.com.dbsoft.rest.interfaces.IRestErrorCode;

@JsonInclude(value=Include.NON_NULL)
@JsonTypeInfo(use = JsonTypeInfo.Id.NONE)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class DadosRestError implements IRestError{

	private static final long serialVersionUID = 3059562643463340866L;
	
	@JsonProperty("description")
	private String			wDescription;
	@JsonProperty("code")
	private IRestErrorCode	wCode;
	
	@Override
	public String getDescription() {
		return wDescription;
	}
	@Override
	public void setDescription(String pText) {
		wDescription = pText;
	}
	@Override
	public IRestErrorCode getCode() {
		return wCode;
	}
	@Override
	public void setCode(IRestErrorCode pCode) {
		wCode = pCode;
	}
	
}
