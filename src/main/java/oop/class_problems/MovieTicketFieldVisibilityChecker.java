class MovieTicketFieldVisibilityChecker {
 static String classifyAccess(String m,String c){
  if(m.equals("private")) return c.equals("SAME_CLASS")?"ALLOWED":"DENIED";
  if(m.equals("default")) return (c.equals("SAME_CLASS")||c.equals("SAME_PACKAGE"))?"ALLOWED":"DENIED";
  if(m.equals("protected")) return (c.equals("SAME_CLASS")||c.equals("SAME_PACKAGE"))?"ALLOWED":"DENIED";
  if(m.equals("public")) return "ALLOWED"; return "DENIED";
 }
 static String summarizeBatch(String[][] a){int x=0,y=0;for(String[] z:a)if(classifyAccess(z[0],z[1]).equals("ALLOWED"))x++;else y++;return "Allowed: "+x+" | Denied: "+y;}
 public static void main(String[] args){String[][] a={{"default","SAME_PACKAGE"},{"default","DIFFERENT_PACKAGE"},{"public","DIFFERENT_PACKAGE"}};System.out.println(classifyAccess("private","SAME_CLASS"));System.out.println(classifyAccess("protected","DIFFERENT_PACKAGE"));System.out.println(summarizeBatch(a));}
}
