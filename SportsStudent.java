import java.util.*;
interface Student 
{
int score=10;
void displayscore();
}
interface Sports
{
int score=25;
void displaySportsscore();
}
class Result implements Student,Sports
{
public void displayscore()
{
System.out.println("Academic score:"+Student.score);
}
public void displaySportsscore()
{
System.out.println("Sportsscore:"+Sports.score);
}
}
class SportsStudent
{
public static void main(String[]args)
{
Result r=new Result();
r.displayscore();
r.displaySportsscore();
}
}

