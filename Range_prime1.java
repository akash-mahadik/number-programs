class Range_prime1{
public static void main(String[]args)
{
int start=1;
int end=10;
while(start<=end)
{
int din=2;
for( ;din<end/2;din++)
{
if(start%din==0)
{
break;
}
}
if(start==din)
{
System.out.println(start);
}
start++;
}
}
}