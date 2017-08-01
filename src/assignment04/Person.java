package assignment04;

class Person extends Thread{

    Reservation reserve;
    private int requestedSeats;
    private String name;

    public Person(Reservation reserve, int requestedSeats, String name){
        this.reserve = reserve;
        this.requestedSeats = requestedSeats;
        this.name = name;
        
    }

    @Override
    public void run(){
        reserve.reserveSeat(requestedSeats, name);
    }
    
}