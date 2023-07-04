import java.util.*; 
class LinkedLists{
public static void main(String[] args){ 
LinkedList<String>ll=new LinkedList<String>();
ll.add("a");
ll.add("b");
ll.add("c");
ll.add("d");
ll.add("e");
System.out.println("current contents of ll:"+ll);
ll.clear();
System.out.println("contents of ll after deletion:"+ll);
}
}


output
------
  ksb@ksb-ThinkCentre-Edge72:~/javaLab$ java LinkedLists
current contents of ll:[a, b, c, d, e]
contents of ll after deletion:[]
