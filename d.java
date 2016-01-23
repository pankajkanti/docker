import java.util.*;
class d{

public static void main(String arg[]){
new A().show(new Integer(1));
}
}

class A{
void show(int a){

System.out.println("primitive"+a);
}

void show(Integer a){

System.out.println("wrapper"+a);
}

}
