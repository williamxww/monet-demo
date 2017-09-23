package com.bow.monet.entity;


/**
 * @author wwxiang
 * @since 2017/9/12.
 */
public class CacheOnuReport {

    @Field("id")
    private Integer id;
    @Field("emsId")
    private Integer emsId;
    @Field("neId")
    private Integer neId;
    @Field("areaNm")
    private String area;
    @Field("neNm")
    private String neName;
    @Field("neIp")
    private String neIp;
    @Field("portInd")
    private String portLogo;
    @Field("timeRng")
    private String timeRange;
    @Field("portShortNm")
    private String simpleName;
    @Field("boardId")
    private Integer boardId;
    @Field("onuId")
    private Integer onuId;
    @Field("portNo")
    private Integer portNo;
    @Field("boardNm")
    private String boardName;
    @Field("oltPonPrtNm")
    private String oltPonPortName;
    @Field("onuNm")
    private String onuName;
    @Field("onuSvcType")
    private String onuServiceType;
    @Field("portNm")
    private String portName;
    @Field("onuMark")
    private String onuCertificationMark;
    @Field("phySn")
    private String phySn;
    @Field("onuPwd")
    private String onuPassword;
    @Field("logicSn")
    private String logicSn;
    @Field("logicSnPwd")
    private String logicSnPassword;
    @Field("1529Max")
    private Double opticalPowerMax;
    @Field("1529Min")
    private Double opticalPowerMin;
    @Field("1528Max")
    private Double receiveOpticalPowerMax;
    @Field("1528Min")
    private Double receiveOpticalPowerMin;
    @Field("1527Max")
    private Double sendOpticalPowerMax;
    @Field("1527Min")
    private Double sendOpticalPowerMin;
    @Field("3045Max")
    private Double upOpticalAttenuationMax;
    @Field("3045Min")
    private Double upOpticalAttenuationMin;
    @Field("3046Max")
    private Double downOpticalAttenuationMax;
    @Field("3046Min")
    private Double downOpticalAttenuationMin;
    @Field("tmprtMax")
    private Double temperatureMax;
    @Field("tmprtMin")
    private Double temperatureMin;
    @Field("electricMax")
    private Double electricityMax;
    @Field("electricMin")
    private Double electricityMin;
    @Field("voltageMax")
    private Double voltageMax;
    @Field("voltageMin")
    private Double voltageMin;
    @Field("rate")
    private Double portRate;
    @Field("confGbw")
    private Double guaranteedBW;
    @Field("3195Avg")
    private Double downBusySpeedAvg;
    @Field("1491Max")
    private Double downSpeedMax;
    @Field("1491Avg")
    private Double downSpeedAvg;
    @Field("1491Min")
    private Double downSpeedMin;
    @Field("1491RcvAvg")
    private Double srcPortReceiveFlowAvg;
    @Field("3194Avg")
    private Double upBusySpeedAvg;
    @Field("1488Max")
    private Double upSpeedMax;
    @Field("1488Avg")
    private Double upSpeedAvg;
    @Field("1488Min")
    private Double upSpeedMin;
    @Field("1488SndAvg")
    private Double srcPortSendFlowAvg;
    @Field("3196Max")
    private Double bwuMax;
    @Field("3197Avg")
    private Double bwuBusyAvg;
    @Field("3197Max")
    private Double bwuBusyMax;
    @Field("3198Cur")
    private Double bwBusyness;
    @Field("3198Max")
    private Double bwBusynessMax;
    @Field("3198Min")
    private Double bwBusynessMin;
    @Field("3199Cur")
    private Double packetLossCount;
    @Field("3047Max")
    private Double maxUpErrorRate;
    @Field("3048Max")
    private Double maxDownErrorRate;
    @Field("3223Max")
    private Double maxUpPacketLossRate;
    @Field("3225Max")
    private Double maxDownPacketLossRate;
    @Field("1490Max")
    private Double upBandwidthUtilizationMax;
    @Field("1490Avg")
    private Double upBandwidthUtilizationAvg;
    @Field("1490Min")
    private Double upBandwidthUtilizationMin;
    @Field("1493Max")
    private Double downBandwidthUtilizationMax;
    @Field("1493Avg")
    private Double downBandwidthUtilizationAvg;
    @Field("1493Min")
    private Double downBandwidthUtilizationMin;
    @Field("3200Avg")
    private Double destPortSendFlowAvg;
    @Field("3201Avg")
    private Double destPortReceiveFlowAvg;
    @Field("rcvTrfcOcpRt")
    private Double receiveTrafficOccupancyRate;
    @Field("sndTrfcOcpRt")
    private Double sendTrafficOccupancyRate;
    @Field("confGbwpAvg")
    private Double guaranteedBWUBusyAvg;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEmsId() {
        return emsId;
    }

    public void setEmsId(Integer emsId) {
        this.emsId = emsId;
    }

    public Integer getNeId() {
        return neId;
    }

    public void setNeId(Integer neId) {
        this.neId = neId;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getNeName() {
        return neName;
    }

    public void setNeName(String neName) {
        this.neName = neName;
    }

    public String getNeIp() {
        return neIp;
    }

    public void setNeIp(String neIp) {
        this.neIp = neIp;
    }

    public String getPortLogo() {
        return portLogo;
    }

    public void setPortLogo(String portLogo) {
        this.portLogo = portLogo;
    }

    public String getTimeRange() {
        return timeRange;
    }

    public void setTimeRange(String timeRange) {
        this.timeRange = timeRange;
    }

    public String getSimpleName() {
        return simpleName;
    }

    public void setSimpleName(String simpleName) {
        this.simpleName = simpleName;
    }

    public Integer getBoardId() {
        return boardId;
    }

    public void setBoardId(Integer boardId) {
        this.boardId = boardId;
    }

    public Integer getOnuId() {
        return onuId;
    }

    public void setOnuId(Integer onuId) {
        this.onuId = onuId;
    }

    public Integer getPortNo() {
        return portNo;
    }

    public void setPortNo(Integer portNo) {
        this.portNo = portNo;
    }

    public String getBoardName() {
        return boardName;
    }

    public void setBoardName(String boardName) {
        this.boardName = boardName;
    }

    public String getOltPonPortName() {
        return oltPonPortName;
    }

    public void setOltPonPortName(String oltPonPortName) {
        this.oltPonPortName = oltPonPortName;
    }

    public String getOnuName() {
        return onuName;
    }

    public void setOnuName(String onuName) {
        this.onuName = onuName;
    }

    public String getOnuServiceType() {
        return onuServiceType;
    }

    public void setOnuServiceType(String onuServiceType) {
        this.onuServiceType = onuServiceType;
    }

    public String getPortName() {
        return portName;
    }

    public void setPortName(String portName) {
        this.portName = portName;
    }

    public String getOnuCertificationMark() {
        return onuCertificationMark;
    }

    public void setOnuCertificationMark(String onuCertificationMark) {
        this.onuCertificationMark = onuCertificationMark;
    }

    public String getPhySn() {
        return phySn;
    }

    public void setPhySn(String phySn) {
        this.phySn = phySn;
    }

    public String getOnuPassword() {
        return onuPassword;
    }

    public void setOnuPassword(String onuPassword) {
        this.onuPassword = onuPassword;
    }

    public String getLogicSn() {
        return logicSn;
    }

    public void setLogicSn(String logicSn) {
        this.logicSn = logicSn;
    }

    public String getLogicSnPassword() {
        return logicSnPassword;
    }

    public void setLogicSnPassword(String logicSnPassword) {
        this.logicSnPassword = logicSnPassword;
    }

    public Double getOpticalPowerMax() {
        return opticalPowerMax;
    }

    public void setOpticalPowerMax(Double opticalPowerMax) {
        this.opticalPowerMax = opticalPowerMax;
    }

    public Double getOpticalPowerMin() {
        return opticalPowerMin;
    }

    public void setOpticalPowerMin(Double opticalPowerMin) {
        this.opticalPowerMin = opticalPowerMin;
    }

    public Double getReceiveOpticalPowerMax() {
        return receiveOpticalPowerMax;
    }

    public void setReceiveOpticalPowerMax(Double receiveOpticalPowerMax) {
        this.receiveOpticalPowerMax = receiveOpticalPowerMax;
    }

    public Double getReceiveOpticalPowerMin() {
        return receiveOpticalPowerMin;
    }

    public void setReceiveOpticalPowerMin(Double receiveOpticalPowerMin) {
        this.receiveOpticalPowerMin = receiveOpticalPowerMin;
    }

    public Double getSendOpticalPowerMax() {
        return sendOpticalPowerMax;
    }

    public void setSendOpticalPowerMax(Double sendOpticalPowerMax) {
        this.sendOpticalPowerMax = sendOpticalPowerMax;
    }

    public Double getSendOpticalPowerMin() {
        return sendOpticalPowerMin;
    }

    public void setSendOpticalPowerMin(Double sendOpticalPowerMin) {
        this.sendOpticalPowerMin = sendOpticalPowerMin;
    }

    public Double getUpOpticalAttenuationMax() {
        return upOpticalAttenuationMax;
    }

    public void setUpOpticalAttenuationMax(Double upOpticalAttenuationMax) {
        this.upOpticalAttenuationMax = upOpticalAttenuationMax;
    }

    public Double getUpOpticalAttenuationMin() {
        return upOpticalAttenuationMin;
    }

    public void setUpOpticalAttenuationMin(Double upOpticalAttenuationMin) {
        this.upOpticalAttenuationMin = upOpticalAttenuationMin;
    }

    public Double getDownOpticalAttenuationMax() {
        return downOpticalAttenuationMax;
    }

    public void setDownOpticalAttenuationMax(Double downOpticalAttenuationMax) {
        this.downOpticalAttenuationMax = downOpticalAttenuationMax;
    }

    public Double getDownOpticalAttenuationMin() {
        return downOpticalAttenuationMin;
    }

    public void setDownOpticalAttenuationMin(Double downOpticalAttenuationMin) {
        this.downOpticalAttenuationMin = downOpticalAttenuationMin;
    }

    public Double getTemperatureMax() {
        return temperatureMax;
    }

    public void setTemperatureMax(Double temperatureMax) {
        this.temperatureMax = temperatureMax;
    }

    public Double getTemperatureMin() {
        return temperatureMin;
    }

    public void setTemperatureMin(Double temperatureMin) {
        this.temperatureMin = temperatureMin;
    }

    public Double getElectricityMax() {
        return electricityMax;
    }

    public void setElectricityMax(Double electricityMax) {
        this.electricityMax = electricityMax;
    }

    public Double getElectricityMin() {
        return electricityMin;
    }

    public void setElectricityMin(Double electricityMin) {
        this.electricityMin = electricityMin;
    }

    public Double getVoltageMax() {
        return voltageMax;
    }

    public void setVoltageMax(Double voltageMax) {
        this.voltageMax = voltageMax;
    }

    public Double getVoltageMin() {
        return voltageMin;
    }

    public void setVoltageMin(Double voltageMin) {
        this.voltageMin = voltageMin;
    }

    public Double getPortRate() {
        return portRate;
    }

    public void setPortRate(Double portRate) {
        this.portRate = portRate;
    }

    public Double getGuaranteedBW() {
        return guaranteedBW;
    }

    public void setGuaranteedBW(Double guaranteedBW) {
        this.guaranteedBW = guaranteedBW;
    }

    public Double getDownBusySpeedAvg() {
        return downBusySpeedAvg;
    }

    public void setDownBusySpeedAvg(Double downBusySpeedAvg) {
        this.downBusySpeedAvg = downBusySpeedAvg;
    }

    public Double getDownSpeedMax() {
        return downSpeedMax;
    }

    public void setDownSpeedMax(Double downSpeedMax) {
        this.downSpeedMax = downSpeedMax;
    }

    public Double getDownSpeedAvg() {
        return downSpeedAvg;
    }

    public void setDownSpeedAvg(Double downSpeedAvg) {
        this.downSpeedAvg = downSpeedAvg;
    }

    public Double getDownSpeedMin() {
        return downSpeedMin;
    }

    public void setDownSpeedMin(Double downSpeedMin) {
        this.downSpeedMin = downSpeedMin;
    }

    public Double getSrcPortReceiveFlowAvg() {
        return srcPortReceiveFlowAvg;
    }

    public void setSrcPortReceiveFlowAvg(Double srcPortReceiveFlowAvg) {
        this.srcPortReceiveFlowAvg = srcPortReceiveFlowAvg;
    }

    public Double getUpBusySpeedAvg() {
        return upBusySpeedAvg;
    }

    public void setUpBusySpeedAvg(Double upBusySpeedAvg) {
        this.upBusySpeedAvg = upBusySpeedAvg;
    }

    public Double getUpSpeedMax() {
        return upSpeedMax;
    }

    public void setUpSpeedMax(Double upSpeedMax) {
        this.upSpeedMax = upSpeedMax;
    }

    public Double getUpSpeedAvg() {
        return upSpeedAvg;
    }

    public void setUpSpeedAvg(Double upSpeedAvg) {
        this.upSpeedAvg = upSpeedAvg;
    }

    public Double getUpSpeedMin() {
        return upSpeedMin;
    }

    public void setUpSpeedMin(Double upSpeedMin) {
        this.upSpeedMin = upSpeedMin;
    }

    public Double getSrcPortSendFlowAvg() {
        return srcPortSendFlowAvg;
    }

    public void setSrcPortSendFlowAvg(Double srcPortSendFlowAvg) {
        this.srcPortSendFlowAvg = srcPortSendFlowAvg;
    }

    public Double getBwuMax() {
        return bwuMax;
    }

    public void setBwuMax(Double bwuMax) {
        this.bwuMax = bwuMax;
    }

    public Double getBwuBusyAvg() {
        return bwuBusyAvg;
    }

    public void setBwuBusyAvg(Double bwuBusyAvg) {
        this.bwuBusyAvg = bwuBusyAvg;
    }

    public Double getBwuBusyMax() {
        return bwuBusyMax;
    }

    public void setBwuBusyMax(Double bwuBusyMax) {
        this.bwuBusyMax = bwuBusyMax;
    }

    public Double getBwBusyness() {
        return bwBusyness;
    }

    public void setBwBusyness(Double bwBusyness) {
        this.bwBusyness = bwBusyness;
    }

    public Double getBwBusynessMax() {
        return bwBusynessMax;
    }

    public void setBwBusynessMax(Double bwBusynessMax) {
        this.bwBusynessMax = bwBusynessMax;
    }

    public Double getBwBusynessMin() {
        return bwBusynessMin;
    }

    public void setBwBusynessMin(Double bwBusynessMin) {
        this.bwBusynessMin = bwBusynessMin;
    }

    public Double getPacketLossCount() {
        return packetLossCount;
    }

    public void setPacketLossCount(Double packetLossCount) {
        this.packetLossCount = packetLossCount;
    }

    public Double getMaxUpErrorRate() {
        return maxUpErrorRate;
    }

    public void setMaxUpErrorRate(Double maxUpErrorRate) {
        this.maxUpErrorRate = maxUpErrorRate;
    }

    public Double getMaxDownErrorRate() {
        return maxDownErrorRate;
    }

    public void setMaxDownErrorRate(Double maxDownErrorRate) {
        this.maxDownErrorRate = maxDownErrorRate;
    }

    public Double getMaxUpPacketLossRate() {
        return maxUpPacketLossRate;
    }

    public void setMaxUpPacketLossRate(Double maxUpPacketLossRate) {
        this.maxUpPacketLossRate = maxUpPacketLossRate;
    }

    public Double getMaxDownPacketLossRate() {
        return maxDownPacketLossRate;
    }

    public void setMaxDownPacketLossRate(Double maxDownPacketLossRate) {
        this.maxDownPacketLossRate = maxDownPacketLossRate;
    }

    public Double getUpBandwidthUtilizationMax() {
        return upBandwidthUtilizationMax;
    }

    public void setUpBandwidthUtilizationMax(Double upBandwidthUtilizationMax) {
        this.upBandwidthUtilizationMax = upBandwidthUtilizationMax;
    }

    public Double getUpBandwidthUtilizationAvg() {
        return upBandwidthUtilizationAvg;
    }

    public void setUpBandwidthUtilizationAvg(Double upBandwidthUtilizationAvg) {
        this.upBandwidthUtilizationAvg = upBandwidthUtilizationAvg;
    }

    public Double getUpBandwidthUtilizationMin() {
        return upBandwidthUtilizationMin;
    }

    public void setUpBandwidthUtilizationMin(Double upBandwidthUtilizationMin) {
        this.upBandwidthUtilizationMin = upBandwidthUtilizationMin;
    }

    public Double getDownBandwidthUtilizationMax() {
        return downBandwidthUtilizationMax;
    }

    public void setDownBandwidthUtilizationMax(Double downBandwidthUtilizationMax) {
        this.downBandwidthUtilizationMax = downBandwidthUtilizationMax;
    }

    public Double getDownBandwidthUtilizationAvg() {
        return downBandwidthUtilizationAvg;
    }

    public void setDownBandwidthUtilizationAvg(Double downBandwidthUtilizationAvg) {
        this.downBandwidthUtilizationAvg = downBandwidthUtilizationAvg;
    }

    public Double getDownBandwidthUtilizationMin() {
        return downBandwidthUtilizationMin;
    }

    public void setDownBandwidthUtilizationMin(Double downBandwidthUtilizationMin) {
        this.downBandwidthUtilizationMin = downBandwidthUtilizationMin;
    }

    public Double getDestPortSendFlowAvg() {
        return destPortSendFlowAvg;
    }

    public void setDestPortSendFlowAvg(Double destPortSendFlowAvg) {
        this.destPortSendFlowAvg = destPortSendFlowAvg;
    }

    public Double getDestPortReceiveFlowAvg() {
        return destPortReceiveFlowAvg;
    }

    public void setDestPortReceiveFlowAvg(Double destPortReceiveFlowAvg) {
        this.destPortReceiveFlowAvg = destPortReceiveFlowAvg;
    }

    public Double getReceiveTrafficOccupancyRate() {
        return receiveTrafficOccupancyRate;
    }

    public void setReceiveTrafficOccupancyRate(Double receiveTrafficOccupancyRate) {
        this.receiveTrafficOccupancyRate = receiveTrafficOccupancyRate;
    }

    public Double getSendTrafficOccupancyRate() {
        return sendTrafficOccupancyRate;
    }

    public void setSendTrafficOccupancyRate(Double sendTrafficOccupancyRate) {
        this.sendTrafficOccupancyRate = sendTrafficOccupancyRate;
    }

    public Double getGuaranteedBWUBusyAvg() {
        return guaranteedBWUBusyAvg;
    }

    public void setGuaranteedBWUBusyAvg(Double guaranteedBWUBusyAvg) {
        this.guaranteedBWUBusyAvg = guaranteedBWUBusyAvg;
    }
}
