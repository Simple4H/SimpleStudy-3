package com.simple.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Objects;


public class GetCardDetailFromWxResponseResultCardMemberCardDto implements Serializable {
  
  private GetCardDetailFromWxResponseResultCardMemberCardCustomCell1Dto customCell1 = null;
  private GetCardDetailFromWxResponseResultCardMemberCardAdvancedInfoDto advancedInfo = null;
  private String prerogative = null;
  private Boolean autoActivate = null;
  private Boolean supplyBonus = null;
  private GetCardDetailFromWxResponseResultCardMemberCardCustomField1Dto customField1 = null;
  private GetCardDetailFromWxResponseResultCardMemberCardCustomField1Dto customField3 = null;
  private GetCardDetailFromWxResponseResultCardMemberCardCustomField1Dto customField2 = null;
  private Integer discount = null;
  private GetCardDetailFromWxResponseResultCardMemberCardBaseInfoDto baseInfo = null;
  private Boolean supplyBalance = null;
  private Boolean wxActivate = null;

  
  /**
   **/
  public GetCardDetailFromWxResponseResultCardMemberCardDto customCell1(GetCardDetailFromWxResponseResultCardMemberCardCustomCell1Dto customCell1) {
    this.customCell1 = customCell1;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("custom_cell1")
  public GetCardDetailFromWxResponseResultCardMemberCardCustomCell1Dto getCustomCell1() {
    return customCell1;
  }
  public void setCustomCell1(GetCardDetailFromWxResponseResultCardMemberCardCustomCell1Dto customCell1) {
    this.customCell1 = customCell1;
  }

  
  /**
   **/
  public GetCardDetailFromWxResponseResultCardMemberCardDto advancedInfo(GetCardDetailFromWxResponseResultCardMemberCardAdvancedInfoDto advancedInfo) {
    this.advancedInfo = advancedInfo;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("advanced_info")
  public GetCardDetailFromWxResponseResultCardMemberCardAdvancedInfoDto getAdvancedInfo() {
    return advancedInfo;
  }
  public void setAdvancedInfo(GetCardDetailFromWxResponseResultCardMemberCardAdvancedInfoDto advancedInfo) {
    this.advancedInfo = advancedInfo;
  }

  
  /**
   * 特权
   **/
  public GetCardDetailFromWxResponseResultCardMemberCardDto prerogative(String prerogative) {
    this.prerogative = prerogative;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "特权")
  @JsonProperty("prerogative")
  public String getPrerogative() {
    return prerogative;
  }
  public void setPrerogative(String prerogative) {
    this.prerogative = prerogative;
  }

  
  /**
   * 自动激活
   **/
  public GetCardDetailFromWxResponseResultCardMemberCardDto autoActivate(Boolean autoActivate) {
    this.autoActivate = autoActivate;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "自动激活")
  @JsonProperty("auto_activate")
  public Boolean getAutoActivate() {
    return autoActivate;
  }
  public void setAutoActivate(Boolean autoActivate) {
    this.autoActivate = autoActivate;
  }

  
  /**
   * 供应奖金
   **/
  public GetCardDetailFromWxResponseResultCardMemberCardDto supplyBonus(Boolean supplyBonus) {
    this.supplyBonus = supplyBonus;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "供应奖金")
  @JsonProperty("supply_bonus")
  public Boolean getSupplyBonus() {
    return supplyBonus;
  }
  public void setSupplyBonus(Boolean supplyBonus) {
    this.supplyBonus = supplyBonus;
  }

  
  /**
   **/
  public GetCardDetailFromWxResponseResultCardMemberCardDto customField1(GetCardDetailFromWxResponseResultCardMemberCardCustomField1Dto customField1) {
    this.customField1 = customField1;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("custom_field1")
  public GetCardDetailFromWxResponseResultCardMemberCardCustomField1Dto getCustomField1() {
    return customField1;
  }
  public void setCustomField1(GetCardDetailFromWxResponseResultCardMemberCardCustomField1Dto customField1) {
    this.customField1 = customField1;
  }

  
  /**
   **/
  public GetCardDetailFromWxResponseResultCardMemberCardDto customField3(GetCardDetailFromWxResponseResultCardMemberCardCustomField1Dto customField3) {
    this.customField3 = customField3;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("custom_field3")
  public GetCardDetailFromWxResponseResultCardMemberCardCustomField1Dto getCustomField3() {
    return customField3;
  }
  public void setCustomField3(GetCardDetailFromWxResponseResultCardMemberCardCustomField1Dto customField3) {
    this.customField3 = customField3;
  }

  
  /**
   **/
  public GetCardDetailFromWxResponseResultCardMemberCardDto customField2(GetCardDetailFromWxResponseResultCardMemberCardCustomField1Dto customField2) {
    this.customField2 = customField2;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("custom_field2")
  public GetCardDetailFromWxResponseResultCardMemberCardCustomField1Dto getCustomField2() {
    return customField2;
  }
  public void setCustomField2(GetCardDetailFromWxResponseResultCardMemberCardCustomField1Dto customField2) {
    this.customField2 = customField2;
  }

  
  /**
   * 折扣
   **/
  public GetCardDetailFromWxResponseResultCardMemberCardDto discount(Integer discount) {
    this.discount = discount;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "折扣")
  @JsonProperty("discount")
  public Integer getDiscount() {
    return discount;
  }
  public void setDiscount(Integer discount) {
    this.discount = discount;
  }

  
  /**
   **/
  public GetCardDetailFromWxResponseResultCardMemberCardDto baseInfo(GetCardDetailFromWxResponseResultCardMemberCardBaseInfoDto baseInfo) {
    this.baseInfo = baseInfo;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("base_info")
  public GetCardDetailFromWxResponseResultCardMemberCardBaseInfoDto getBaseInfo() {
    return baseInfo;
  }
  public void setBaseInfo(GetCardDetailFromWxResponseResultCardMemberCardBaseInfoDto baseInfo) {
    this.baseInfo = baseInfo;
  }

  
  /**
   * 供应平衡
   **/
  public GetCardDetailFromWxResponseResultCardMemberCardDto supplyBalance(Boolean supplyBalance) {
    this.supplyBalance = supplyBalance;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "供应平衡")
  @JsonProperty("supply_balance")
  public Boolean getSupplyBalance() {
    return supplyBalance;
  }
  public void setSupplyBalance(Boolean supplyBalance) {
    this.supplyBalance = supplyBalance;
  }

  
  /**
   * 微信激活
   **/
  public GetCardDetailFromWxResponseResultCardMemberCardDto wxActivate(Boolean wxActivate) {
    this.wxActivate = wxActivate;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "微信激活")
  @JsonProperty("wx_activate")
  public Boolean getWxActivate() {
    return wxActivate;
  }
  public void setWxActivate(Boolean wxActivate) {
    this.wxActivate = wxActivate;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCardDetailFromWxResponseResultCardMemberCardDto getCardDetailFromWxResponseResultCardMemberCard = (GetCardDetailFromWxResponseResultCardMemberCardDto) o;
    return Objects.equals(customCell1, getCardDetailFromWxResponseResultCardMemberCard.customCell1) &&
        Objects.equals(advancedInfo, getCardDetailFromWxResponseResultCardMemberCard.advancedInfo) &&
        Objects.equals(prerogative, getCardDetailFromWxResponseResultCardMemberCard.prerogative) &&
        Objects.equals(autoActivate, getCardDetailFromWxResponseResultCardMemberCard.autoActivate) &&
        Objects.equals(supplyBonus, getCardDetailFromWxResponseResultCardMemberCard.supplyBonus) &&
        Objects.equals(customField1, getCardDetailFromWxResponseResultCardMemberCard.customField1) &&
        Objects.equals(customField3, getCardDetailFromWxResponseResultCardMemberCard.customField3) &&
        Objects.equals(customField2, getCardDetailFromWxResponseResultCardMemberCard.customField2) &&
        Objects.equals(discount, getCardDetailFromWxResponseResultCardMemberCard.discount) &&
        Objects.equals(baseInfo, getCardDetailFromWxResponseResultCardMemberCard.baseInfo) &&
        Objects.equals(supplyBalance, getCardDetailFromWxResponseResultCardMemberCard.supplyBalance) &&
        Objects.equals(wxActivate, getCardDetailFromWxResponseResultCardMemberCard.wxActivate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customCell1, advancedInfo, prerogative, autoActivate, supplyBonus, customField1, customField3, customField2, discount, baseInfo, supplyBalance, wxActivate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCardDetailFromWxResponseResultCardMemberCardDto {\n");
    
    sb.append("    customCell1: ").append(toIndentedString(customCell1)).append("\n");
    sb.append("    advancedInfo: ").append(toIndentedString(advancedInfo)).append("\n");
    sb.append("    prerogative: ").append(toIndentedString(prerogative)).append("\n");
    sb.append("    autoActivate: ").append(toIndentedString(autoActivate)).append("\n");
    sb.append("    supplyBonus: ").append(toIndentedString(supplyBonus)).append("\n");
    sb.append("    customField1: ").append(toIndentedString(customField1)).append("\n");
    sb.append("    customField3: ").append(toIndentedString(customField3)).append("\n");
    sb.append("    customField2: ").append(toIndentedString(customField2)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
    sb.append("    baseInfo: ").append(toIndentedString(baseInfo)).append("\n");
    sb.append("    supplyBalance: ").append(toIndentedString(supplyBalance)).append("\n");
    sb.append("    wxActivate: ").append(toIndentedString(wxActivate)).append("\n");
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

