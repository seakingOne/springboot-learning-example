package com.ynhuang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ynhuang.http.HttpAPIService;

@RestController
public class HttpClientController {
	@Autowired
	private HttpAPIService httpAPIService;

	@RequestMapping("httpclient")
	public String test() throws Exception {
		String str1 = httpAPIService.doGet("https://kyfw.12306.cn/otn/leftTicket/query?leftTicketDTO.train_date=2018-06-28&leftTicketDTO.from_station=SHH&leftTicketDTO.to_station=CSQ&purpose_codes=ADULT");
		System.out.println(str1);
		return str1;
	}
}
