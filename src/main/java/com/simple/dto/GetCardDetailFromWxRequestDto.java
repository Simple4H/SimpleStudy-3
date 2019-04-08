package com.simple.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Objects;

public class GetCardDetailFromWxRequestDto implements Serializable {
  
  private Integer entId = null;
  private String wxCardId = null;

  
  /**
   **/
  public GetCardDetailFromWxRequestDto entId(Integer entId) {
    this.entId = entId;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("ent_id")
  public Integer getEntId() {
    return entId;
  }
  public void setEntId(Integer entId) {
    this.entId = entId;
  }

  
  /**
   **/
  public GetCardDetailFromWxRequestDto wxCardId(String wxCardId) {
    this.wxCardId = wxCardId;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("wx_card_id")
  public String getWxCardId() {
    return wxCardId;
  }
  public void setWxCardId(String wxCardId) {
    this.wxCardId = wxCardId;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCardDetailFromWxRequestDto getCardDetailFromWxRequest = (GetCardDetailFromWxRequestDto) o;
    return Objects.equals(entId, getCardDetailFromWxRequest.entId) &&
        Objects.equals(wxCardId, getCardDetailFromWxRequest.wxCardId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entId, wxCardId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCardDetailFromWxRequestDto {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    entId: ").append(toIndentedString(entId)).append("\n");
    sb.append("    wxCardId: ").append(toIndentedString(wxCardId)).append("\n");
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

