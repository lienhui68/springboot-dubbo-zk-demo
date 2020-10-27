package com.eh.ticket.service;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;


@Component
@Service(version = "1.0.0") //可以被扫描到，在项目启动时自动注册到注册中心
public class TicketServiceImpl implements TicketService {
    @Override
    public String getTicket() {
        return "《三国演义》";
    }
}
