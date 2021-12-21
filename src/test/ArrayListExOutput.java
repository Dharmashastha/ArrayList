package test;

import java.util.*;
import task.*;
public class ArrayListExOutput
{
public static void main(String []args)
{

ArrayListEx arrayCall=new ArrayListEx();
Input inputCall=new Input();
List output=new ArrayList();

int number=0;
int length=0;

System.out.println("Enter the Case:");
try
{
	number=inputCall.getI();
}
catch(Exception e)
{
	System.out.println("Skipping the input is prohibited");
}
switch(number)
{
case 1:
try
    {
	output=arrayCall.callArrayList();
        System.out.println("ArrayList Size: "+arrayCall.arraySize(output));
    }
    catch(Exception e)
    {
     System.out.println(e.getMessage());
    }
    break;
case 2:
try{
	output=arrayCall.callArrayList();
	length=inputCall.getNumber();
	String []array=inputCall.getStringArray(length);
	output=arrayCall.addString(output,array);
	System.out.println("ArrayList is : "+output);
	System.out.println("ArrayList Size: "+arrayCall.arraySize(output));

   }
   catch(Exception e)
   {
     System.out.println(e.getMessage());
   }
    break;
case 3:
try{    
	output=arrayCall.callArrayList();
	length=inputCall.getNumber();
	int []array=inputCall.getIntArray(length);
	output=arrayCall.addInteger(output,array);
	System.out.println("ArrayList is : "+output);
	System.out.println("ArrayList Size: "+arrayCall.arraySize(output));

    }
    catch(Exception e)
    {
     System.out.println(e.getMessage());
    }
    break;
case 4:
try{
	output=arrayCall.callArrayList();
	output=arrayCall.addCustom(output,inputCall);
	System.out.println("ArrayList is : "+output);
	System.out.println("ArrayList Size: "+arrayCall.arraySize(output));

    }
    catch(Exception e)
    {
     System.out.println(e.getMessage());
    }
    break;
case 5:
try{
	output=arrayCall.callArrayList();
	length=inputCall.getNumber();
	int []array=inputCall.getIntArray(length);
	output=arrayCall.addInteger(output,array);
	int length1=inputCall.getNumber();
	String []array1=inputCall.getStringArray(length1);
	output=arrayCall.addString(output,array1);
	output=arrayCall.addCustom(output,inputCall);
	output=arrayCall.addCustom(output,arrayCall);
	System.out.println("ArrayList is : "+output);
	System.out.println("ArrayList Size: "+arrayCall.arraySize(output));
    }
    catch(Exception e)
    {
     System.out.println(e.getMessage());
    }
    break;
case 6:
try{
    
    }
    catch(Exception e)
    {
     System.out.println(e.getMessage());
    }
    break;
case 7:
try{
    
    }
    catch(Exception e)
    {
     System.out.println(e.getMessage());
    }
    break;
case 8:
try{    
    
    }
    catch(Exception e)
    {
     System.out.println(e.getMessage());
    }
    break;
case 9:
try{    
    
    }
    catch(Exception e)
    {
     System.out.println(e.getMessage());
    }
    break;
case 10:
try{
    
    }
    catch(Exception e)
    {
     System.out.println(e.getMessage());
    }
    break;
case 11:
try{
    
    }
    catch(Exception e)
    {
     System.out.println(e.getMessage());
    }
    break;
case 12:
try{
    
    }
    catch(Exception e)
    {
     System.out.println(e.getMessage());
    }
    break;
case 13:
try{
    
    }
    catch(Exception e)
    {
     System.out.println(e.getMessage());
    }
    break;
case 14:
try{
    
    }
    catch(Exception e)
    {
     System.out.println(e.getMessage());
    }
    break;
case 15:
try{    
    
    }
    catch(Exception e)
    {
     System.out.println(e.getMessage());
    }
    break;
case 16:
try{
    
    
    
    }
    catch(Exception e)
    {
     System.out.println(e.getMessage());
    }
    break;
case 17:
try{
    
    }
    catch(Exception e)
    {
     System.out.println(e.getMessage());
    }  
    break;
case 18:
try{
    
    }
    catch(Exception e)
    {
     System.out.println(e.getMessage());
    }
    break;
case 19:
try{
    
    }
    catch(Exception e)
    {
     System.out.println(e.getMessage());
    }
    break;
default:
    System.out.println("Unavailable Task");
    System.out.println("Enter the Task Number 1 to 19");  
      
}
}
}
