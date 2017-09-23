package com.bow.monet.dao;

import com.bow.monet.entity.CacheOnuReport;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author wwxiang
 * @since 2017/9/12.
 */
public class FakeCacheData {


	private BufferedWriter bw;

	public void setup() throws IOException {
		File file = new File("D:/data_300_500.csv");
		FileOutputStream fos = new FileOutputStream(file);
		bw = new BufferedWriter(new OutputStreamWriter(fos, "utf-8"));
	}

	public static List<CacheOnuReport> buildReport(int begin, int end) {
		System.out.println("try to insert " + begin + "-" + (end-1));
		List<CacheOnuReport> list = new ArrayList();

		for (int i = begin; i < end; i++) {
			CacheOnuReport cache = new CacheOnuReport();
			cache.setId(i);
			cache.setEmsId(10000);
			cache.setNeId(19930320 + i % 100);
			cache.setBoardId(20170411 + i % 10000);
			cache.setOnuId(19700000 + i);
			cache.setPortNo(i % 10);
			cache.setPortLogo(
					cache.getEmsId() + "-" + cache.getNeId() + "-" + cache.getBoardId() + "-" + cache.getPortNo());

			cache.setPortName("EC8B[4]:PON" + i + ":PON[" + i + "]-AN5006-04[19]:PON1_flag" + i);
			cache.setBoardName("EC8B[" + i + "]_flag" + i);
			cache.setOltPonPortName("EC8B[4]:PON5_flag" + i);
			cache.setOnuName("PON[5]-AN5006-04[" + i + "]_flag" + i);
			cache.setNeName("网元AN5516-01_10.207.1.1_flag" + i);
			cache.setArea("ems1-武汉_flag" + i);
			cache.setSimpleName("网元AN5516-01_10.207.1." + i + "/\\n4/5/19_flag" + i);
			cache.setNeIp("10.207.1." + i + "_flag" + i);

			if (i % 2 == 0) {
				cache.setOnuServiceType("普通客户");
			} else {
				cache.setOnuServiceType("Vip");
			}
			cache.setOnuCertificationMark("::54-4b-40-94-d4-50:_flag" + i);
			cache.setOnuPassword("who are you" + i);
			cache.setPhySn("54-4b-40" + i + "-94-d4-50");
			cache.setLogicSn("hehe" + i);
			cache.setLogicSnPassword("hhe cep");
			cache.setTimeRange("2017-08-26");
			cache.setPortRate(1000.0 + i);
			cache.setBwBusyness(100.0 + i);
			cache.setBwBusynessMax(200.0 + i);
			cache.setBwBusynessMin(0.0 + i);
			cache.setBwuBusyAvg(0.0 + i);
			cache.setBwuBusyMax(10.0 + i);
			cache.setBwuMax((i % 100) / 100.0);
			cache.setDestPortReceiveFlowAvg(0.0 + i);
			cache.setDestPortSendFlowAvg(1.0 + i);
			cache.setSrcPortReceiveFlowAvg(i % 10000.0);
			cache.setSrcPortSendFlowAvg(i % 9999.0);
			cache.setDownBandwidthUtilizationAvg((i % 100) / 100.0);
			cache.setDownBandwidthUtilizationMax((i % 100) / 100.0);
			cache.setDownBandwidthUtilizationMin((i % 100) / 100.0);
			cache.setUpBandwidthUtilizationAvg((i % 100) / 100.0);
			cache.setUpBandwidthUtilizationMax((i % 100) / 100.0);
			cache.setUpBandwidthUtilizationMin((i % 100) / 100.0);
			cache.setDownOpticalAttenuationMax(100.0 + i);
			cache.setDownOpticalAttenuationMin(90.0 + i);
			cache.setDownBusySpeedAvg(250.0 + i);
			cache.setDownSpeedAvg(125.0 + i);
			cache.setDownSpeedMax(150.0 + i);
			cache.setDownSpeedMin(100.0 + i);
			cache.setUpSpeedAvg(i % 10000.0);
			cache.setUpSpeedMax(i % 12000.0);
			cache.setUpSpeedMin(i % 9000.0);
			cache.setElectricityMax(10.0 + i % 100);
			cache.setElectricityMin(i % 100.0);
			cache.setGuaranteedBW(1250.0);
			cache.setGuaranteedBWUBusyAvg(1000.0);
			cache.setMaxDownErrorRate(i % 1000.0);
			cache.setMaxDownPacketLossRate(i % 101.0);
			cache.setMaxUpErrorRate(i % 900.0);
			cache.setMaxUpPacketLossRate(i % 120.0);
			cache.setOpticalPowerMax(-20.0 + i % 60);
			cache.setOpticalPowerMin(-40.0 + i % 60);
			cache.setPacketLossCount(i % 150.0);
			cache.setReceiveTrafficOccupancyRate(i % 100.0);
			cache.setSendTrafficOccupancyRate(i % 90.0);
			cache.setTemperatureMax(i % 100.0);
			cache.setTemperatureMin(i % 80.0);
			cache.setVoltageMax(10.0 + i);
			cache.setVoltageMin(0.0 + i);
			cache.setUpBusySpeedAvg(20.0 + i);
			cache.setReceiveOpticalPowerMin(i % 500.0);
			cache.setReceiveOpticalPowerMax(100.0 + i % 500.0);
			cache.setSendOpticalPowerMax(200.0 + i % 500.0);
			cache.setSendOpticalPowerMin(15 + i % 500.0);
			cache.setUpOpticalAttenuationMin(i % 400.0);
			cache.setUpOpticalAttenuationMax(i % 600.0);
			list.add(cache);
		}
		return list;
	}

	private static String convertToCsv(List<CacheOnuReport> reports) throws Exception {
		List<String> fields = getFields();
		StringBuilder sb = new StringBuilder();
		for (CacheOnuReport report : reports) {
			for (int i = 0; i < fields.size(); i++) {
				if (i != 0) {
					sb.append(",");
				}
				String field = fields.get(i);
				String first = field.substring(0, 1).toUpperCase();
				String remain = field.substring(1);
				Method method = CacheOnuReport.class.getMethod("get" + first + remain, null);
				Object value = method.invoke(report, null);
				sb.append(value);
			}
			sb.append("\n");
		}
		return sb.toString();
	}


	private static List<String> getFields() {
		String[] ary = new String[] { "id", "emsId", "neId", "boardId", "onuId", "portNo", "area", "neName", "neIp",
				"portLogo", "timeRange", "simpleName", "boardName", "oltPonPortName", "onuName", "onuServiceType",
				"portName", "onuCertificationMark", "phySn", "onuPassword", "logicSn", "logicSnPassword",
				"opticalPowerMax", "opticalPowerMin", "receiveOpticalPowerMax", "receiveOpticalPowerMin",
				"sendOpticalPowerMax", "sendOpticalPowerMin", "upOpticalAttenuationMax", "upOpticalAttenuationMin",
				"downOpticalAttenuationMax", "downOpticalAttenuationMin", "temperatureMax", "temperatureMin",
				"electricityMax", "electricityMin", "voltageMax", "voltageMin", "portRate", "guaranteedBW",
				"downBusySpeedAvg", "downSpeedMax", "downSpeedAvg", "downSpeedMin", "srcPortReceiveFlowAvg",
				"upBusySpeedAvg", "upSpeedMax", "upSpeedAvg", "upSpeedMin", "srcPortSendFlowAvg", "bwuMax",
				"bwuBusyAvg", "bwuBusyMax", "bwBusyness", "bwBusynessMax", "bwBusynessMin", "packetLossCount",
				"maxUpErrorRate", "maxDownErrorRate", "maxUpPacketLossRate", "maxDownPacketLossRate",
				"upBandwidthUtilizationMax", "upBandwidthUtilizationAvg", "upBandwidthUtilizationMin",
				"downBandwidthUtilizationMax", "downBandwidthUtilizationAvg", "downBandwidthUtilizationMin",
				"destPortSendFlowAvg", "destPortReceiveFlowAvg", "receiveTrafficOccupancyRate",
				"sendTrafficOccupancyRate", "guaranteedBWUBusyAvg" };

		List<String> fields = Arrays.asList(ary);
		return fields;
	}

	public static void main(String[] args) throws Exception {
		FakeCacheData fake = new FakeCacheData();
		fake.setup();

		for (int i = 300; i < 500; i++) {
			int batSize = 10000;
			String csv = convertToCsv(buildReport(i * batSize, (i + 1) * batSize));
			fake.bw.write(csv);
			fake.bw.flush();
		}
		fake.bw.close();
	}
}
