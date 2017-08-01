package assignment04;

class Reservation{

    static int availableSeats = 7;

    synchronized void reserveSeat(int requestedSeats, String name){
    	
        if (availableSeats >= requestedSeats){
            System.out.println("Congrats " + name + "!! Seats are booked for you.");
            System.out.println(requestedSeats + " seats reserved.");
            
            availableSeats = availableSeats - requestedSeats;
        }
    }
    
}

