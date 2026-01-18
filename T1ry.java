public class T1ry{
public static void main (String[] args){
 int i= 0;
 int[] j={1,2,3};
 try{
  for(i=0;i<4;i++){
   if(j[i]==(i+1))
      System.out.println(j[i]);
  }
 }catch (ArrayIndexOutOfBoundsException e){
   System.out.println(e.getMessage());
  }

}
}