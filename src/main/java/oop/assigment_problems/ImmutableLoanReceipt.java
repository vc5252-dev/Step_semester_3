class ImmutableLoanReceipt {
 private final String memberId; private final String[] bookIds;
 public ImmutableLoanReceipt(String id,String[] books){memberId=id;bookIds=books.clone();}
 public String[] getBookIds(){return bookIds.clone();}
 public ImmutableLoanReceipt withCorrectedBookId(int i,String id){String[] a=bookIds.clone();a[i]=id;return new ImmutableLoanReceipt(memberId,a);}
 static String processNightlyCirculation(ImmutableLoanReceipt[] r){int p=0,n=0,ref=0,reg=0;for(ImmutableLoanReceipt x:r){if(x==null){n++;continue;}p++;if(x instanceof ReferenceOnlyLoanReceipt)ref++;else reg++;}return p+" processed | "+n+" null skipped | "+ref+" reference-only | "+reg+" regular";}
 public static void main(String[] args){ImmutableLoanReceipt r=new ImmutableLoanReceipt("LIB-8841",new String[]{"BK-100","BK-101"});String[] a=r.getBookIds();a[0]="HACKED";System.out.println(r.getBookIds()[0]);ImmutableLoanReceipt c=r.withCorrectedBookId(1,"BK-102");System.out.println(java.util.Arrays.toString(c.getBookIds()));System.out.println(processNightlyCirculation(new ImmutableLoanReceipt[]{new ReferenceOnlyLoanReceipt("LIB-001",new String[]{"BK-200"},"Reading Room 3"),null,new ImmutableLoanReceipt("LIB-002",new String[]{"BK-201"})}));}
}
class ReferenceOnlyLoanReceipt extends ImmutableLoanReceipt {String roomNumber;ReferenceOnlyLoanReceipt(String id,String[] b,String room){super(id,b);roomNumber=room;}}
