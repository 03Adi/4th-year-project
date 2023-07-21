class Test
{
void cal()throws ArithmeticException,ArrayIndexOutOfBoundsException
{
int x = 10/0;
int y[] = new int[5];
y[100] = 1000;
}
public static void main(String arg[])
{
Test t1 = new Test();
try
{
t1.cal();
}
catch(Exception e)
{
System.out.println(e);
}
}
}
