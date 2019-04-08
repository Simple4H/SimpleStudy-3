package com.simple.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Objects;


public class GetCardDetailFromWxResponseResultCardMemberCardBaseInfoSkuDto implements Serializable {
  
  private Integer quantity = null;
  private Integer totalQuantiry = null;

  
  /**
   * 数量
   **/
  public GetCardDetailFromWxResponseResultCardMemberCardBaseInfoSkuDto quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "数量")
  @JsonProperty("quantity")
  public Integer getQuantity() {
    return quantity;
  }
  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  
  /**
   * 总数量
   **/
  public GetCardDetailFromWxResponseResultCardMemberCardBaseInfoSkuDto totalQuantiry(Integer totalQuantiry) {
    this.totalQuantiry = totalQuantiry;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "总数量")
  @JsonProperty("total_quantiry")
  public Integer getTotalQuantiry() {
    return totalQuantiry;
  }
  public void setTotalQuantiry(Integer totalQuantiry) {
    this.totalQuantiry = totalQuantiry;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCardDetailFromWxResponseResultCardMemberCardBaseInfoSkuDto getCardDetailFromWxResponseResultCardMemberCardBaseInfoSku = (GetCardDetailFromWxResponseResultCardMemberCardBaseInfoSkuDto) o;
    return Objects.equals(quantity, getCardDetailFromWxResponseResultCardMemberCardBaseInfoSku.quantity) &&
        Objects.equals(totalQuantiry, getCardDetailFromWxResponseResultCardMemberCardBaseInfoSku.totalQuantiry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quantity, totalQuantiry);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCardDetailFromWxResponseResultCardMemberCardBaseInfoSkuDto {\n");
    
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    totalQuantiry: ").append(toIndentedString(totalQuantiry)).append("\n");
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

