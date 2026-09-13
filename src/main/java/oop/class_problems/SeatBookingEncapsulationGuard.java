class SeatBookingEncapsulationGuard {
 private int seatsTotal,seatsAvailable;
 SeatBookingEncapsulationGuard(int n){if(n<=0)throw new IllegalArgumentException("construction rejected");seatsTotal=n;seatsAvailable=n;}
 void bookSeat(){if(seatsAvailable>0)seatsAvailable--;}
 void cancelBooking(){if(seatsAvailable<seatsTotal)seatsAvailable++;}
 int getSeatsAvailable(){return seatsAvailable;}
 public static void main(String[] args){SeatBookingEncapsulationGuard c=new SeatBookingEncapsulationGuard(2);c.bookSeat();c.bookSeat();c.bookSeat();System.out.println(c.getSeatsAvailable());c.cancelBooking();c.cancelBooking();c.cancelBooking();System.out.println(c.getSeatsAvailable());}
}
