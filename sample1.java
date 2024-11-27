class fact{
  public static void main (String args[]){
    scanner sc=new scanner(System.in);
    int fact=1;
    System.out.println("Enter the number:");
    int no=sc.nextInt();
    for(int i=1;i<=no;i++){
      fact=fact*i;
    }
    System.out.println("factorial of "+no+"is" +fact);
  }
}
