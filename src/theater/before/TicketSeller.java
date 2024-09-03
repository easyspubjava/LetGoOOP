package theater.before;

public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public void sellTo(Audience audience) {
        Ticket ticket = ticketOffice.getTicket();
        Long amount = audience.buy(ticket);
        ticketOffice.plusAmount(amount);

    }



    /*public TicketOffice getTicketOffice() {
        return ticketOffice;
    }*/
}
