class BookCopyCirculationGuard {
 private int copiesTotal,copiesAvailable;
 BookCopyCirculationGuard(int n){if(n<=0)throw new IllegalArgumentException("construction rejected");copiesTotal=n;copiesAvailable=n;}
 void checkOut(){if(copiesAvailable>0)copiesAvailable--;} void checkIn(){if(copiesAvailable<copiesTotal)copiesAvailable++;}
 int getCopiesAvailable(){return copiesAvailable;}
 public static void main(String[] args){BookCopyCirculationGuard b=new BookCopyCirculationGuard(3);b.checkOut();b.checkOut();b.checkOut();b.checkOut();System.out.println(b.getCopiesAvailable());b.checkIn();b.checkIn();b.checkIn();b.checkIn();System.out.println(b.getCopiesAvailable());}
}
