package com.idv.hanjichen.software.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class log4j2Practice {
	// 定義日誌紀錄器物件
	private static final Logger logger = LoggerFactory.getLogger(log4j2Practice.class);
	public static void excute() {
        logger.debug("Debug-1 訊息測試log4j2Practice");
        logger.info("Info-1 訊息測試log4j2Practice");
        logger.warn("Warning-1 訊息測試log4j2Practice");
        logger.error("Error-1 訊息測試log4j2Practice");
	}
}
