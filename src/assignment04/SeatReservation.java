package assignment04;

class SeatReservation{
	
    public static void main(String[] args) throws InterruptedException{
        
    	Reservation reserve = new Reservation(); // LINE A
        
    	Person thread1 = new Person(reserve, 2, "Teo"); // LINE B
        thread1.start();
        Person thread2 = new Person(reserve, 3, "Agnes");
        thread2.start();
        Person thread3 = new Person(reserve, 4, "Danny");
        thread3.start();
        Person thread4 = new Person(reserve, 5, "Charles");
        thread4.start();
        Person thread5 = new Person(reserve, 1, "Paul");
        thread5.start();
        Person thread6 = new Person(reserve, 2, "Hannah");
        thread6.start();
        
       
    }
}
