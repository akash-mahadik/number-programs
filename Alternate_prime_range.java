class Alternate_prime_range
{
public static void main(String[]args)
{
int start=1;
int end=20;
int count=0;
while(start<=end)
{
int den=2;
for(;den<end;den++)
{
if(start%den==0){
break;
}
}
if(start==den){
count++;
if(count%2==0){
System.out.println(start);
}
}
start++;
}
}
}