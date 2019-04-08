package com.simple.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class GetCardDetailFromWxResponseResultCardMemberCardBaseInfoDto implements Serializable {
  
  private String centerUrl = null;
  private String color = null;
  private String logoUrl = null;
  private String promotionUrlSubTitle = null;
  private Boolean canGiveFriend = null;
  private List<String> locationIdList = new ArrayList<String>();
  private String title = null;
  private List<String> areaCodeList = new ArrayList<String>();
  private Boolean useCustomCode = null;
  private Integer updateTime = null;
  private String customUrlSubTitle = null;
  private Boolean needPushOnView = null;
  private String id = null;
  private Boolean bindOpenid = null;
  private GetCardDetailFromWxResponseResultCardMemberCardBaseInfoSkuDto sku = null;
  private String codeType = null;
  private String notice = null;
  private String customUrl = null;
  private String centerSubTitle = null;
  private Integer getLimit = null;
  private Integer createTime = null;
  private String centerTitle = null;
  private String customUrlName = null;
  private String promotionUrlName = null;
  private Boolean canShare = null;
  private String brandName = null;
  private Boolean isPayAndQrcode = null;
  private String servicePhone = null;
  private String promotionUrl = null;
  private Boolean useAllLocations = null;
  private String dateInfo = null;
  private String status = null;

  
  /**
   * 中心网址
   **/
  public GetCardDetailFromWxResponseResultCardMemberCardBaseInfoDto centerUrl(String centerUrl) {
    this.centerUrl = centerUrl;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "中心网址")
  @JsonProperty("center_url")
  public String getCenterUrl() {
    return centerUrl;
  }
  public void setCenterUrl(String centerUrl) {
    this.centerUrl = centerUrl;
  }

  
  /**
   * 颜色
   **/
  public GetCardDetailFromWxResponseResultCardMemberCardBaseInfoDto color(String color) {
    this.color = color;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "颜色")
  @JsonProperty("color")
  public String getColor() {
    return color;
  }
  public void setColor(String color) {
    this.color = color;
  }

  
  /**
   * 图标路径
   **/
  public GetCardDetailFromWxResponseResultCardMemberCardBaseInfoDto logoUrl(String logoUrl) {
    this.logoUrl = logoUrl;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "图标路径")
  @JsonProperty("logo_url")
  public String getLogoUrl() {
    return logoUrl;
  }
  public void setLogoUrl(String logoUrl) {
    this.logoUrl = logoUrl;
  }

  
  /**
   * 促销网址子标题
   **/
  public GetCardDetailFromWxResponseResultCardMemberCardBaseInfoDto promotionUrlSubTitle(String promotionUrlSubTitle) {
    this.promotionUrlSubTitle = promotionUrlSubTitle;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "促销网址子标题")
  @JsonProperty("promotion_url_sub_title")
  public String getPromotionUrlSubTitle() {
    return promotionUrlSubTitle;
  }
  public void setPromotionUrlSubTitle(String promotionUrlSubTitle) {
    this.promotionUrlSubTitle = promotionUrlSubTitle;
  }

  
  /**
   * 可以给朋友
   **/
  public GetCardDetailFromWxResponseResultCardMemberCardBaseInfoDto canGiveFriend(Boolean canGiveFriend) {
    this.canGiveFriend = canGiveFriend;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "可以给朋友")
  @JsonProperty("can_give_friend")
  public Boolean getCanGiveFriend() {
    return canGiveFriend;
  }
  public void setCanGiveFriend(Boolean canGiveFriend) {
    this.canGiveFriend = canGiveFriend;
  }

  
  /**
   * 位置id列表
   **/
  public GetCardDetailFromWxResponseResultCardMemberCardBaseInfoDto locationIdList(List<String> locationIdList) {
    this.locationIdList = locationIdList;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "位置id列表")
  @JsonProperty("location_id_list")
  public List<String> getLocationIdList() {
    return locationIdList;
  }
  public void setLocationIdList(List<String> locationIdList) {
    this.locationIdList = locationIdList;
  }

  
  /**
   * 标题
   **/
  public GetCardDetailFromWxResponseResultCardMemberCardBaseInfoDto title(String title) {
    this.title = title;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "标题")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  
  /**
   * 区号列表
   **/
  public GetCardDetailFromWxResponseResultCardMemberCardBaseInfoDto areaCodeList(List<String> areaCodeList) {
    this.areaCodeList = areaCodeList;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "区号列表")
  @JsonProperty("area_code_list")
  public List<String> getAreaCodeList() {
    return areaCodeList;
  }
  public void setAreaCodeList(List<String> areaCodeList) {
    this.areaCodeList = areaCodeList;
  }

  
  /**
   * 使用自定义代码
   **/
  public GetCardDetailFromWxResponseResultCardMemberCardBaseInfoDto useCustomCode(Boolean useCustomCode) {
    this.useCustomCode = useCustomCode;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "使用自定义代码")
  @JsonProperty("use_custom_code")
  public Boolean getUseCustomCode() {
    return useCustomCode;
  }
  public void setUseCustomCode(Boolean useCustomCode) {
    this.useCustomCode = useCustomCode;
  }

  
  /**
   * 更新时间
   **/
  public GetCardDetailFromWxResponseResultCardMemberCardBaseInfoDto updateTime(Integer updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "更新时间")
  @JsonProperty("update_time")
  public Integer getUpdateTime() {
    return updateTime;
  }
  public void setUpdateTime(Integer updateTime) {
    this.updateTime = updateTime;
  }

  
  /**
   * 自定义url标题
   **/
  public GetCardDetailFromWxResponseResultCardMemberCardBaseInfoDto customUrlSubTitle(String customUrlSubTitle) {
    this.customUrlSubTitle = customUrlSubTitle;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "自定义url标题")
  @JsonProperty("custom_url_sub_title")
  public String getCustomUrlSubTitle() {
    return customUrlSubTitle;
  }
  public void setCustomUrlSubTitle(String customUrlSubTitle) {
    this.customUrlSubTitle = customUrlSubTitle;
  }

  
  /**
   * 需要推动视野
   **/
  public GetCardDetailFromWxResponseResultCardMemberCardBaseInfoDto needPushOnView(Boolean needPushOnView) {
    this.needPushOnView = needPushOnView;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "需要推动视野")
  @JsonProperty("need_push_on_view")
  public Boolean getNeedPushOnView() {
    return needPushOnView;
  }
  public void setNeedPushOnView(Boolean needPushOnView) {
    this.needPushOnView = needPushOnView;
  }

  
  /**
   * id
   **/
  public GetCardDetailFromWxResponseResultCardMemberCardBaseInfoDto id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "id")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * 绑定openID
   **/
  public GetCardDetailFromWxResponseResultCardMemberCardBaseInfoDto bindOpenid(Boolean bindOpenid) {
    this.bindOpenid = bindOpenid;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "绑定openID")
  @JsonProperty("bind_openid")
  public Boolean getBindOpenid() {
    return bindOpenid;
  }
  public void setBindOpenid(Boolean bindOpenid) {
    this.bindOpenid = bindOpenid;
  }

  
  /**
   **/
  public GetCardDetailFromWxResponseResultCardMemberCardBaseInfoDto sku(GetCardDetailFromWxResponseResultCardMemberCardBaseInfoSkuDto sku) {
    this.sku = sku;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sku")
  public GetCardDetailFromWxResponseResultCardMemberCardBaseInfoSkuDto getSku() {
    return sku;
  }
  public void setSku(GetCardDetailFromWxResponseResultCardMemberCardBaseInfoSkuDto sku) {
    this.sku = sku;
  }

  
  /**
   * 代码类型
   **/
  public GetCardDetailFromWxResponseResultCardMemberCardBaseInfoDto codeType(String codeType) {
    this.codeType = codeType;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "代码类型")
  @JsonProperty("code_type")
  public String getCodeType() {
    return codeType;
  }
  public void setCodeType(String codeType) {
    this.codeType = codeType;
  }

  
  /**
   * 通知
   **/
  public GetCardDetailFromWxResponseResultCardMemberCardBaseInfoDto notice(String notice) {
    this.notice = notice;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "通知")
  @JsonProperty("notice")
  public String getNotice() {
    return notice;
  }
  public void setNotice(String notice) {
    this.notice = notice;
  }

  
  /**
   * 自定义url
   **/
  public GetCardDetailFromWxResponseResultCardMemberCardBaseInfoDto customUrl(String customUrl) {
    this.customUrl = customUrl;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "自定义url")
  @JsonProperty("custom_url")
  public String getCustomUrl() {
    return customUrl;
  }
  public void setCustomUrl(String customUrl) {
    this.customUrl = customUrl;
  }

  
  /**
   * 中心名称子标题
   **/
  public GetCardDetailFromWxResponseResultCardMemberCardBaseInfoDto centerSubTitle(String centerSubTitle) {
    this.centerSubTitle = centerSubTitle;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "中心名称子标题")
  @JsonProperty("center_sub_title")
  public String getCenterSubTitle() {
    return centerSubTitle;
  }
  public void setCenterSubTitle(String centerSubTitle) {
    this.centerSubTitle = centerSubTitle;
  }

  
  /**
   * 获取权限
   **/
  public GetCardDetailFromWxResponseResultCardMemberCardBaseInfoDto getLimit(Integer getLimit) {
    this.getLimit = getLimit;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "获取权限")
  @JsonProperty("get_limit")
  public Integer getGetLimit() {
    return getLimit;
  }
  public void setGetLimit(Integer getLimit) {
    this.getLimit = getLimit;
  }

  
  /**
   * 创建时间
   **/
  public GetCardDetailFromWxResponseResultCardMemberCardBaseInfoDto createTime(Integer createTime) {
    this.createTime = createTime;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "创建时间")
  @JsonProperty("create_time")
  public Integer getCreateTime() {
    return createTime;
  }
  public void setCreateTime(Integer createTime) {
    this.createTime = createTime;
  }

  
  /**
   * 中心名称
   **/
  public GetCardDetailFromWxResponseResultCardMemberCardBaseInfoDto centerTitle(String centerTitle) {
    this.centerTitle = centerTitle;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "中心名称")
  @JsonProperty("center_title")
  public String getCenterTitle() {
    return centerTitle;
  }
  public void setCenterTitle(String centerTitle) {
    this.centerTitle = centerTitle;
  }

  
  /**
   * 自定义url名字
   **/
  public GetCardDetailFromWxResponseResultCardMemberCardBaseInfoDto customUrlName(String customUrlName) {
    this.customUrlName = customUrlName;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "自定义url名字")
  @JsonProperty("custom_url_name")
  public String getCustomUrlName() {
    return customUrlName;
  }
  public void setCustomUrlName(String customUrlName) {
    this.customUrlName = customUrlName;
  }

  
  /**
   * 促销网址名称
   **/
  public GetCardDetailFromWxResponseResultCardMemberCardBaseInfoDto promotionUrlName(String promotionUrlName) {
    this.promotionUrlName = promotionUrlName;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "促销网址名称")
  @JsonProperty("promotion_url_name")
  public String getPromotionUrlName() {
    return promotionUrlName;
  }
  public void setPromotionUrlName(String promotionUrlName) {
    this.promotionUrlName = promotionUrlName;
  }

  
  /**
   * 可以分享
   **/
  public GetCardDetailFromWxResponseResultCardMemberCardBaseInfoDto canShare(Boolean canShare) {
    this.canShare = canShare;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "可以分享")
  @JsonProperty("can_share")
  public Boolean getCanShare() {
    return canShare;
  }
  public void setCanShare(Boolean canShare) {
    this.canShare = canShare;
  }

  
  /**
   * 品牌
   **/
  public GetCardDetailFromWxResponseResultCardMemberCardBaseInfoDto brandName(String brandName) {
    this.brandName = brandName;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "品牌")
  @JsonProperty("brand_name")
  public String getBrandName() {
    return brandName;
  }
  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }

  
  /**
   * 是否付费url
   **/
  public GetCardDetailFromWxResponseResultCardMemberCardBaseInfoDto isPayAndQrcode(Boolean isPayAndQrcode) {
    this.isPayAndQrcode = isPayAndQrcode;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "是否付费url")
  @JsonProperty("is_pay_and_qrcode")
  public Boolean getIsPayAndQrcode() {
    return isPayAndQrcode;
  }
  public void setIsPayAndQrcode(Boolean isPayAndQrcode) {
    this.isPayAndQrcode = isPayAndQrcode;
  }

  
  /**
   * 服务电话
   **/
  public GetCardDetailFromWxResponseResultCardMemberCardBaseInfoDto servicePhone(String servicePhone) {
    this.servicePhone = servicePhone;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "服务电话")
  @JsonProperty("service_phone")
  public String getServicePhone() {
    return servicePhone;
  }
  public void setServicePhone(String servicePhone) {
    this.servicePhone = servicePhone;
  }

  
  /**
   * 促销网址
   **/
  public GetCardDetailFromWxResponseResultCardMemberCardBaseInfoDto promotionUrl(String promotionUrl) {
    this.promotionUrl = promotionUrl;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "促销网址")
  @JsonProperty("promotion_url")
  public String getPromotionUrl() {
    return promotionUrl;
  }
  public void setPromotionUrl(String promotionUrl) {
    this.promotionUrl = promotionUrl;
  }

  
  /**
   * 使用所有位置
   **/
  public GetCardDetailFromWxResponseResultCardMemberCardBaseInfoDto useAllLocations(Boolean useAllLocations) {
    this.useAllLocations = useAllLocations;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "使用所有位置")
  @JsonProperty("use_all_locations")
  public Boolean getUseAllLocations() {
    return useAllLocations;
  }
  public void setUseAllLocations(Boolean useAllLocations) {
    this.useAllLocations = useAllLocations;
  }

  
  /**
   * 类型
   **/
  public GetCardDetailFromWxResponseResultCardMemberCardBaseInfoDto dateInfo(String dateInfo) {
    this.dateInfo = dateInfo;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "类型")
  @JsonProperty("date_info")
  public String getDateInfo() {
    return dateInfo;
  }
  public void setDateInfo(String dateInfo) {
    this.dateInfo = dateInfo;
  }

  
  /**
   * 状态
   **/
  public GetCardDetailFromWxResponseResultCardMemberCardBaseInfoDto status(String status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "状态")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCardDetailFromWxResponseResultCardMemberCardBaseInfoDto getCardDetailFromWxResponseResultCardMemberCardBaseInfo = (GetCardDetailFromWxResponseResultCardMemberCardBaseInfoDto) o;
    return Objects.equals(centerUrl, getCardDetailFromWxResponseResultCardMemberCardBaseInfo.centerUrl) &&
        Objects.equals(color, getCardDetailFromWxResponseResultCardMemberCardBaseInfo.color) &&
        Objects.equals(logoUrl, getCardDetailFromWxResponseResultCardMemberCardBaseInfo.logoUrl) &&
        Objects.equals(promotionUrlSubTitle, getCardDetailFromWxResponseResultCardMemberCardBaseInfo.promotionUrlSubTitle) &&
        Objects.equals(canGiveFriend, getCardDetailFromWxResponseResultCardMemberCardBaseInfo.canGiveFriend) &&
        Objects.equals(locationIdList, getCardDetailFromWxResponseResultCardMemberCardBaseInfo.locationIdList) &&
        Objects.equals(title, getCardDetailFromWxResponseResultCardMemberCardBaseInfo.title) &&
        Objects.equals(areaCodeList, getCardDetailFromWxResponseResultCardMemberCardBaseInfo.areaCodeList) &&
        Objects.equals(useCustomCode, getCardDetailFromWxResponseResultCardMemberCardBaseInfo.useCustomCode) &&
        Objects.equals(updateTime, getCardDetailFromWxResponseResultCardMemberCardBaseInfo.updateTime) &&
        Objects.equals(customUrlSubTitle, getCardDetailFromWxResponseResultCardMemberCardBaseInfo.customUrlSubTitle) &&
        Objects.equals(needPushOnView, getCardDetailFromWxResponseResultCardMemberCardBaseInfo.needPushOnView) &&
        Objects.equals(id, getCardDetailFromWxResponseResultCardMemberCardBaseInfo.id) &&
        Objects.equals(bindOpenid, getCardDetailFromWxResponseResultCardMemberCardBaseInfo.bindOpenid) &&
        Objects.equals(sku, getCardDetailFromWxResponseResultCardMemberCardBaseInfo.sku) &&
        Objects.equals(codeType, getCardDetailFromWxResponseResultCardMemberCardBaseInfo.codeType) &&
        Objects.equals(notice, getCardDetailFromWxResponseResultCardMemberCardBaseInfo.notice) &&
        Objects.equals(customUrl, getCardDetailFromWxResponseResultCardMemberCardBaseInfo.customUrl) &&
        Objects.equals(centerSubTitle, getCardDetailFromWxResponseResultCardMemberCardBaseInfo.centerSubTitle) &&
        Objects.equals(getLimit, getCardDetailFromWxResponseResultCardMemberCardBaseInfo.getLimit) &&
        Objects.equals(createTime, getCardDetailFromWxResponseResultCardMemberCardBaseInfo.createTime) &&
        Objects.equals(centerTitle, getCardDetailFromWxResponseResultCardMemberCardBaseInfo.centerTitle) &&
        Objects.equals(customUrlName, getCardDetailFromWxResponseResultCardMemberCardBaseInfo.customUrlName) &&
        Objects.equals(promotionUrlName, getCardDetailFromWxResponseResultCardMemberCardBaseInfo.promotionUrlName) &&
        Objects.equals(canShare, getCardDetailFromWxResponseResultCardMemberCardBaseInfo.canShare) &&
        Objects.equals(brandName, getCardDetailFromWxResponseResultCardMemberCardBaseInfo.brandName) &&
        Objects.equals(isPayAndQrcode, getCardDetailFromWxResponseResultCardMemberCardBaseInfo.isPayAndQrcode) &&
        Objects.equals(servicePhone, getCardDetailFromWxResponseResultCardMemberCardBaseInfo.servicePhone) &&
        Objects.equals(promotionUrl, getCardDetailFromWxResponseResultCardMemberCardBaseInfo.promotionUrl) &&
        Objects.equals(useAllLocations, getCardDetailFromWxResponseResultCardMemberCardBaseInfo.useAllLocations) &&
        Objects.equals(dateInfo, getCardDetailFromWxResponseResultCardMemberCardBaseInfo.dateInfo) &&
        Objects.equals(status, getCardDetailFromWxResponseResultCardMemberCardBaseInfo.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(centerUrl, color, logoUrl, promotionUrlSubTitle, canGiveFriend, locationIdList, title, areaCodeList, useCustomCode, updateTime, customUrlSubTitle, needPushOnView, id, bindOpenid, sku, codeType, notice, customUrl, centerSubTitle, getLimit, createTime, centerTitle, customUrlName, promotionUrlName, canShare, brandName, isPayAndQrcode, servicePhone, promotionUrl, useAllLocations, dateInfo, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCardDetailFromWxResponseResultCardMemberCardBaseInfoDto {\n");
    
    sb.append("    centerUrl: ").append(toIndentedString(centerUrl)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    logoUrl: ").append(toIndentedString(logoUrl)).append("\n");
    sb.append("    promotionUrlSubTitle: ").append(toIndentedString(promotionUrlSubTitle)).append("\n");
    sb.append("    canGiveFriend: ").append(toIndentedString(canGiveFriend)).append("\n");
    sb.append("    locationIdList: ").append(toIndentedString(locationIdList)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    areaCodeList: ").append(toIndentedString(areaCodeList)).append("\n");
    sb.append("    useCustomCode: ").append(toIndentedString(useCustomCode)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    customUrlSubTitle: ").append(toIndentedString(customUrlSubTitle)).append("\n");
    sb.append("    needPushOnView: ").append(toIndentedString(needPushOnView)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    bindOpenid: ").append(toIndentedString(bindOpenid)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    codeType: ").append(toIndentedString(codeType)).append("\n");
    sb.append("    notice: ").append(toIndentedString(notice)).append("\n");
    sb.append("    customUrl: ").append(toIndentedString(customUrl)).append("\n");
    sb.append("    centerSubTitle: ").append(toIndentedString(centerSubTitle)).append("\n");
    sb.append("    getLimit: ").append(toIndentedString(getLimit)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    centerTitle: ").append(toIndentedString(centerTitle)).append("\n");
    sb.append("    customUrlName: ").append(toIndentedString(customUrlName)).append("\n");
    sb.append("    promotionUrlName: ").append(toIndentedString(promotionUrlName)).append("\n");
    sb.append("    canShare: ").append(toIndentedString(canShare)).append("\n");
    sb.append("    brandName: ").append(toIndentedString(brandName)).append("\n");
    sb.append("    isPayAndQrcode: ").append(toIndentedString(isPayAndQrcode)).append("\n");
    sb.append("    servicePhone: ").append(toIndentedString(servicePhone)).append("\n");
    sb.append("    promotionUrl: ").append(toIndentedString(promotionUrl)).append("\n");
    sb.append("    useAllLocations: ").append(toIndentedString(useAllLocations)).append("\n");
    sb.append("    dateInfo: ").append(toIndentedString(dateInfo)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

