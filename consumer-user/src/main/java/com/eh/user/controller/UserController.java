package com.eh.user.controller;

import com.eh.ticket.service.TicketService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    //timeout 可以不指定，但是version一定要指定 不然会找不到服务 直连需要加url="dubbo://localhost:20880"
    @Reference(version = "1.0.0")
    TicketService ticketService;

    @GetMapping("/hello")
    public void hello() {
        String ticket = ticketService.getTicket();
        System.out.println("买到票了：" + ticket);
    }

}
