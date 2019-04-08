package com.simple.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Objects;


public class GetCardDetailFromWxResponseResultCardMemberCardCustomField1Dto implements Serializable {
  
  private String name = null;
  private String url = null;

  
  /**
   * 名字
   **/
  public GetCardDetailFromWxResponseResultCardMemberCardCustomField1Dto name(String name) {
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
   * url
   **/
  public GetCardDetailFromWxResponseResultCardMemberCardCustomField1Dto url(String url) {
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
    GetCardDetailFromWxResponseResultCardMemberCardCustomField1Dto getCardDetailFromWxResponseResultCardMemberCardCustomField1 = (GetCardDetailFromWxResponseResultCardMemberCardCustomField1Dto) o;
    return Objects.equals(name, getCardDetailFromWxResponseResultCardMemberCardCustomField1.name) &&
        Objects.equals(url, getCardDetailFromWxResponseResultCardMemberCardCustomField1.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCardDetailFromWxResponseResultCardMemberCardCustomField1Dto {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

