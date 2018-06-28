package com.ynhuang;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.ynhuang.http.HttpAPIService;

/**
 * 定时去请求12306余票信息
 * 
 * @author ynhuang
 *
 */
@Component
public class ScheduledTask {

	@Autowired
	private HttpAPIService apiService;

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	/**
	 * 每隔十秒定时跑任务
	 */
	@Scheduled(fixedRate = 10 * 1000)
	public void logTime() {
		String str1;
		try {
			str1 = apiService.doGet(
					"https://kyfw.12306.cn/otn/leftTicket/query?leftTicketDTO.train_date=2018-06-28&leftTicketDTO.from_station=SHH&leftTicketDTO.to_station=CSQ&purpose_codes=ADULT");
			System.out.println(str1);
			logger.info("定时任务，现在时间：" + System.currentTimeMillis());
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.toString());
		}

	}

}
