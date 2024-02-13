class Range_prime{
public static void main(String[]args)
{
int start=1;
int end=9;
while(start<=end)
{
int den=2;
for(;den<end;den++)
{
if(start%den==0)
break;
}
if(start==den)
{
System.out.println(start);
}
start++;
}
}
}
