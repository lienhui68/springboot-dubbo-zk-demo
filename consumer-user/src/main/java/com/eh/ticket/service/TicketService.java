package com.eh.ticket.service;

/**
 * 实际开发中服务提供者需要单独写一个api工程，install到仓库中供消费者使用
 */
public interface TicketService {

    public String getTicket();
}
