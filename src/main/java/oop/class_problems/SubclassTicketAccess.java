class SubclassTicketAccess {
 static String classifyAccess(String m,String c){
  if(m.equals("private")||m.equals("default")) return "DENIED";
  if(m.equals("protected")) return c.equals("SUBCLASS_DIFFERENT_PACKAGE_OWN_TYPE")?"ALLOWED":"DENIED";
  if(m.equals("public")) return "ALLOWED"; return "DENIED";
 }
 public static void main(String[] args){System.out.println(classifyAccess("protected","SUBCLASS_DIFFERENT_PACKAGE_OWN_TYPE"));System.out.println(classifyAccess("protected","SUBCLASS_DIFFERENT_PACKAGE_PARENT_TYPE"));}
}
