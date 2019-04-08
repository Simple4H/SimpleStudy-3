package com.simple.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Objects;


public class GetCardDetailFromWxResponseResultCardDto implements Serializable {
  
  private GetCardDetailFromWxResponseResultCardMemberCardDto memberCard = null;
  private String cardType = null;

  
  /**
   **/
  public GetCardDetailFromWxResponseResultCardDto memberCard(GetCardDetailFromWxResponseResultCardMemberCardDto memberCard) {
    this.memberCard = memberCard;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("member_card")
  public GetCardDetailFromWxResponseResultCardMemberCardDto getMemberCard() {
    return memberCard;
  }
  public void setMemberCard(GetCardDetailFromWxResponseResultCardMemberCardDto memberCard) {
    this.memberCard = memberCard;
  }

  
  /**
   * 卡类型
   **/
  public GetCardDetailFromWxResponseResultCardDto cardType(String cardType) {
    this.cardType = cardType;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "卡类型")
  @JsonProperty("card_type")
  public String getCardType() {
    return cardType;
  }
  public void setCardType(String cardType) {
    this.cardType = cardType;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCardDetailFromWxResponseResultCardDto getCardDetailFromWxResponseResultCard = (GetCardDetailFromWxResponseResultCardDto) o;
    return Objects.equals(memberCard, getCardDetailFromWxResponseResultCard.memberCard) &&
        Objects.equals(cardType, getCardDetailFromWxResponseResultCard.cardType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(memberCard, cardType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCardDetailFromWxResponseResultCardDto {\n");
    
    sb.append("    memberCard: ").append(toIndentedString(memberCard)).append("\n");
    sb.append("    cardType: ").append(toIndentedString(cardType)).append("\n");
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

