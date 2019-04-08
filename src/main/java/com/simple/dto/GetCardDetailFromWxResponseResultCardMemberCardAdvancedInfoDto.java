package com.simple.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class GetCardDetailFromWxResponseResultCardMemberCardAdvancedInfoDto implements Serializable {
  
  private List<String> timeLimit = new ArrayList<String>();
  private List<String> textImageList = new ArrayList<String>();
  private Boolean shareFriends = null;
  private List<String> businessService = new ArrayList<String>();
  private List<String> consumeShareCardList = new ArrayList<String>();

  
  /**
   * 时限
   **/
  public GetCardDetailFromWxResponseResultCardMemberCardAdvancedInfoDto timeLimit(List<String> timeLimit) {
    this.timeLimit = timeLimit;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "时限")
  @JsonProperty("time_limit")
  public List<String> getTimeLimit() {
    return timeLimit;
  }
  public void setTimeLimit(List<String> timeLimit) {
    this.timeLimit = timeLimit;
  }

  
  /**
   * 文本图片列表
   **/
  public GetCardDetailFromWxResponseResultCardMemberCardAdvancedInfoDto textImageList(List<String> textImageList) {
    this.textImageList = textImageList;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "文本图片列表")
  @JsonProperty("text_image_list")
  public List<String> getTextImageList() {
    return textImageList;
  }
  public void setTextImageList(List<String> textImageList) {
    this.textImageList = textImageList;
  }

  
  /**
   * 分享给朋友
   **/
  public GetCardDetailFromWxResponseResultCardMemberCardAdvancedInfoDto shareFriends(Boolean shareFriends) {
    this.shareFriends = shareFriends;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "分享给朋友")
  @JsonProperty("share_friends")
  public Boolean getShareFriends() {
    return shareFriends;
  }
  public void setShareFriends(Boolean shareFriends) {
    this.shareFriends = shareFriends;
  }

  
  /**
   * 商业服务
   **/
  public GetCardDetailFromWxResponseResultCardMemberCardAdvancedInfoDto businessService(List<String> businessService) {
    this.businessService = businessService;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "商业服务")
  @JsonProperty("business_service")
  public List<String> getBusinessService() {
    return businessService;
  }
  public void setBusinessService(List<String> businessService) {
    this.businessService = businessService;
  }

  
  /**
   * 消费共享卡列表
   **/
  public GetCardDetailFromWxResponseResultCardMemberCardAdvancedInfoDto consumeShareCardList(List<String> consumeShareCardList) {
    this.consumeShareCardList = consumeShareCardList;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "消费共享卡列表")
  @JsonProperty("consume_share_card_list")
  public List<String> getConsumeShareCardList() {
    return consumeShareCardList;
  }
  public void setConsumeShareCardList(List<String> consumeShareCardList) {
    this.consumeShareCardList = consumeShareCardList;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCardDetailFromWxResponseResultCardMemberCardAdvancedInfoDto getCardDetailFromWxResponseResultCardMemberCardAdvancedInfo = (GetCardDetailFromWxResponseResultCardMemberCardAdvancedInfoDto) o;
    return Objects.equals(timeLimit, getCardDetailFromWxResponseResultCardMemberCardAdvancedInfo.timeLimit) &&
        Objects.equals(textImageList, getCardDetailFromWxResponseResultCardMemberCardAdvancedInfo.textImageList) &&
        Objects.equals(shareFriends, getCardDetailFromWxResponseResultCardMemberCardAdvancedInfo.shareFriends) &&
        Objects.equals(businessService, getCardDetailFromWxResponseResultCardMemberCardAdvancedInfo.businessService) &&
        Objects.equals(consumeShareCardList, getCardDetailFromWxResponseResultCardMemberCardAdvancedInfo.consumeShareCardList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeLimit, textImageList, shareFriends, businessService, consumeShareCardList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCardDetailFromWxResponseResultCardMemberCardAdvancedInfoDto {\n");
    
    sb.append("    timeLimit: ").append(toIndentedString(timeLimit)).append("\n");
    sb.append("    textImageList: ").append(toIndentedString(textImageList)).append("\n");
    sb.append("    shareFriends: ").append(toIndentedString(shareFriends)).append("\n");
    sb.append("    businessService: ").append(toIndentedString(businessService)).append("\n");
    sb.append("    consumeShareCardList: ").append(toIndentedString(consumeShareCardList)).append("\n");
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

