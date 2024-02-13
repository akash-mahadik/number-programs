
class Prime_range_count
{
public static void main(String[] args)
{
int start=1;
int end=20;
int count=0;
while(start<=end)
{
int den=2;
for( ;den<end;den++)
{
if(start%den==0){
break;
}
}
if(start==den)
{
count++;
System.out.println(start);
}
start++;
}
System.out.println("count of prime_range: " +count);
}
}
