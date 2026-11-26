public class simpleswitc{
    public static void main(String[] args){
 int a=5 ,b=7 ,c=6;
int choice=1;
     float sum=a+b;
     float sub=a-b;
     float div=a/b;
    float mul=a*b;
    float total=a+b+c;
    float avrg=total/3;
   switch(choice){
    case 1:System.out.println(sum);
    break;
    case 2:
    System.out.println(sub);
    break;
   case 3: System.out.println(div);
    break;
    case 4:System.out.println(mul);
    break;
    case 5:System.out.println(avrg);
    break;
    case 6:System.out.println(total);
    break;
   default : System.out.println("invalid");
   }
}
}