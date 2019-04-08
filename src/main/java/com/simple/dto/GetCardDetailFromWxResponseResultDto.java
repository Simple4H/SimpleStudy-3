package com.simple.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Objects;


public class GetCardDetailFromWxResponseResultDto implements Serializable {
  
  private Integer errorcode = null;
  private String errmsg = null;
  private GetCardDetailFromWxResponseResultCardDto card = null;

  
  /**
   * 状态码
   **/
  public GetCardDetailFromWxResponseResultDto errorcode(Integer errorcode) {
    this.errorcode = errorcode;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "状态码")
  @JsonProperty("errorcode")
  public Integer getErrorcode() {
    return errorcode;
  }
  public void setErrorcode(Integer errorcode) {
    this.errorcode = errorcode;
  }

  
  /**
   * 错误信息
   **/
  public GetCardDetailFromWxResponseResultDto errmsg(String errmsg) {
    this.errmsg = errmsg;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "错误信息")
  @JsonProperty("errmsg")
  public String getErrmsg() {
    return errmsg;
  }
  public void setErrmsg(String errmsg) {
    this.errmsg = errmsg;
  }

  
  /**
   **/
  public GetCardDetailFromWxResponseResultDto card(GetCardDetailFromWxResponseResultCardDto card) {
    this.card = card;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("card")
  public GetCardDetailFromWxResponseResultCardDto getCard() {
    return card;
  }
  public void setCard(GetCardDetailFromWxResponseResultCardDto card) {
    this.card = card;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCardDetailFromWxResponseResultDto getCardDetailFromWxResponseResult = (GetCardDetailFromWxResponseResultDto) o;
    return Objects.equals(errorcode, getCardDetailFromWxResponseResult.errorcode) &&
        Objects.equals(errmsg, getCardDetailFromWxResponseResult.errmsg) &&
        Objects.equals(card, getCardDetailFromWxResponseResult.card);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorcode, errmsg, card);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCardDetailFromWxResponseResultDto {\n");
    
    sb.append("    errorcode: ").append(toIndentedString(errorcode)).append("\n");
    sb.append("    errmsg: ").append(toIndentedString(errmsg)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

