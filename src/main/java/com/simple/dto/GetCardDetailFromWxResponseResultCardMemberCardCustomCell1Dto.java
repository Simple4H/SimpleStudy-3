package com.simple.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Objects;


public class GetCardDetailFromWxResponseResultCardMemberCardCustomCell1Dto implements Serializable {
  
  private String name = null;
  private String tips = null;
  private String url = null;

  
  /**
   * 名字
   **/
  public GetCardDetailFromWxResponseResultCardMemberCardCustomCell1Dto name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "名字")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * 描述
   **/
  public GetCardDetailFromWxResponseResultCardMemberCardCustomCell1Dto tips(String tips) {
    this.tips = tips;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "描述")
  @JsonProperty("tips")
  public String getTips() {
    return tips;
  }
  public void setTips(String tips) {
    this.tips = tips;
  }

  
  /**
   * url
   **/
  public GetCardDetailFromWxResponseResultCardMemberCardCustomCell1Dto url(String url) {
    this.url = url;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "url")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCardDetailFromWxResponseResultCardMemberCardCustomCell1Dto getCardDetailFromWxResponseResultCardMemberCardCustomCell1 = (GetCardDetailFromWxResponseResultCardMemberCardCustomCell1Dto) o;
    return Objects.equals(name, getCardDetailFromWxResponseResultCardMemberCardCustomCell1.name) &&
        Objects.equals(tips, getCardDetailFromWxResponseResultCardMemberCardCustomCell1.tips) &&
        Objects.equals(url, getCardDetailFromWxResponseResultCardMemberCardCustomCell1.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, tips, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCardDetailFromWxResponseResultCardMemberCardCustomCell1Dto {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tips: ").append(toIndentedString(tips)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

