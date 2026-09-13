class ImmutableBookingReceipt {
 private final String bookingId; private final String[] seatNumbers;
 public ImmutableBookingReceipt(String id,String[] seats){bookingId=id;seatNumbers=seats.clone();}
 public String[] getSeatNumbers(){return seatNumbers.clone();}
 public ImmutableBookingReceipt withUpdatedSeat(int i,String s){String[] a=seatNumbers.clone();a[i]=s;return new ImmutableBookingReceipt(bookingId,a);}
 static String processNightlySettlement(ImmutableBookingReceipt[] r){int p=0,n=0,g=0,i=0;for(ImmutableBookingReceipt x:r){if(x==null){n++;continue;}p++;if(x instanceof GroupBookingReceipt)g++;else i++;}return p+" processed | "+n+" null skipped | "+g+" group | "+i+" individual";}
 public static void main(String[] args){ImmutableBookingReceipt b=new ImmutableBookingReceipt("CH-1001",new String[]{"A1","A2"});String[] s=b.getSeatNumbers();s[0]="X";System.out.println(b.getSeatNumbers()[0]);ImmutableBookingReceipt u=b.withUpdatedSeat(1,"A3");System.out.println(java.util.Arrays.toString(u.getSeatNumbers()));System.out.println(processNightlySettlement(new ImmutableBookingReceipt[]{new GroupBookingReceipt("CH-2002",new String[]{"B1","B2"},2),null,new ImmutableBookingReceipt("CH-3003",new String[]{"C1"})}));}
}
class GroupBookingReceipt extends ImmutableBookingReceipt {int groupSize;GroupBookingReceipt(String id,String[] s,int n){super(id,s);groupSize=n;}}
