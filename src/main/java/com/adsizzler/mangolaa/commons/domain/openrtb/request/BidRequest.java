package com.adsizzler.mangolaa.commons.domain.openrtb.request;

import com.adsizzler.mangolaa.commons.domain.openrtb.enums.AuctionType;
import com.adsizzler.mangolaa.commons.domain.openrtb.enums.Category;
import com.adsizzler.mangolaa.commons.domain.openrtb.enums.Currency;
import com.adsizzler.mangolaa.commons.domain.openrtb.enums.Mode;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * Created by Ankush on 17/07/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@lombok.Data
public class BidRequest {

    @JsonProperty(value = "id", required = true)
    private final String id;

    @JsonProperty(value = "imps", required = true)
    private final Set<ImpressionRequest> impressionRequests;

    @JsonProperty(value = "test")
    private final Mode mode;

    @JsonProperty(value = "tmax")
    private final Short maxTimeToRespond;

    @JsonProperty(value = "wseat")
    private final Set<String> whitelistedAdvertisers;

    @JsonProperty(value = "bseat")
    private final Set<String> blacklistedAdvertisers;

    @JsonProperty(value = "cur")
    private final Set<Currency> currencies;

    @JsonProperty(value = "wlang")
    private final Set<String> whitelistedLanguages;

    @JsonProperty(value = "badv")
    private final Set<String> blockedAdvDomains;

    @JsonProperty(value = "bapp")
    private final Set<String> blockedApps;

    @JsonProperty(value = "source")
    private final Source source;

    @JsonProperty(value = "regs")
    private final Regulations regulations;

    @JsonProperty(value = "at")
    private final AuctionType auctionType;

    @JsonProperty(value = "allimps")
    private final Integer allImps;

    @JsonProperty(value = "bcat")
    private final Set<Category> blockedCategories;

    @JsonProperty(value = "ext")
    private final Map<String,Object> extensions;

    @JsonProperty(value = "device")
    private final Device device;

    @JsonProperty(value = "user")
    private final User user;


    @JsonIgnore
    public boolean forAllImps(){
        return Objects.equals(allImps,1);
    }

    @JsonIgnore
    public boolean hasExtensions(){
        return Objects.isNull(extensions);
    }

}
