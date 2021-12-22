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
List subOutput=new ArrayList();

int number=0;
int length=0;
int stored=0;
double check=0.00;
String stringName="";

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
	System.out.println("how many string you want to append");
	length=inputCall.getNumber();
	Object []array=inputCall.getStringArray(length);
	output=arrayCall.addCustom(output,array);
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
	System.out.println("how many number you want to append");
	length=inputCall.getNumber();
	Object []array=inputCall.getIntArray(length);
	output=arrayCall.addCustom(output,array);
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
	System.out.println("how many Object you want to append");
	length=inputCall.getNumber();
	Object name[]=inputCall.getObject(length);
	output=arrayCall.addCustom(output,name);
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
	System.out.println("how many number you want to append");
	length=inputCall.getNumber();
	Object []array=inputCall.getIntArray(length);
	output=arrayCall.addCustom(output,array);
	System.out.println("how many string you want to append");
	int length1=inputCall.getNumber();
	Object []array1=inputCall.getStringArray(length1);
	output=arrayCall.addCustom(output,array1);
	System.out.println("how many number you want to append");
	length=inputCall.getNumber();
	Object name[]=inputCall.getObject(length);
	output=arrayCall.addCustom(output,name);
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
	output=arrayCall.callArrayList();
	System.out.println("how many string you want to append");
	length=inputCall.getNumber();
	Object []array=inputCall.getStringArray(length);
	output=arrayCall.addCustom(output,array);
	System.out.println("ArrayList is : "+output);
	System.out.println("Find the String index:");	
	stringName=inputCall.getStringName1();
	stored=arrayCall.addFindIndex(output,stringName);
	System.out.println("String index is : "+stored);
	System.out.println("ArrayList Size: "+arrayCall.arraySize(output));
    }
    catch(Exception e)
    {
     System.out.println(e.getMessage());
    }
    break;
case 7:
try{
	output=arrayCall.callArrayList();
	System.out.println("how many string you want to append");
	length=inputCall.getNumber();
	Object []array=inputCall.getStringArray(length);
	output=arrayCall.addCustom(output,array);
	int iter=arrayCall.arraySize(output);
	for(int i=0;i < iter;i++)
   {
	System.out.println(output.get(i));	
   }
	System.out.println("ArrayList is : "+output);
	System.out.println("ArrayList Size: "+arrayCall.arraySize(output));    
    }
    catch(Exception e)
    {
     System.out.println(e.getMessage());
    }
    break;
case 8:
try{    
	output=arrayCall.callArrayList();
	System.out.println("how many string you want to append");
	length=inputCall.getNumber();
	Object []array=inputCall.getStringArray(length);
	output=arrayCall.addCustom(output,array);
	System.out.println("ArrayList is : "+output);
	System.out.println("Find the String index number: ");
	stored=inputCall.getNumber();
	stringName=arrayCall.addIndex(output,stored);
	System.out.println("string output: "+stringName);
	System.out.println("ArrayList Size: "+arrayCall.arraySize(output));
    }
    catch(Exception e)
    {
     System.out.println(e.getMessage());
    }
    break;
case 9:
try{    
	output=arrayCall.callArrayList();
	System.out.println("how many string you want to append");
	length=inputCall.getNumber();
	Object []array=inputCall.getStringArray(length);
	output=arrayCall.addCustom(output,array);
	System.out.println("ArrayList is : "+output);
	System.out.println("Find string first  duplicates index: ");
	stringName=inputCall.getStringName1();
	stored=arrayCall.addDuplicatesFirst(output,stringName);
	System.out.println("String First duplicates index : "+stored);
	System.out.println("ArrayList Size: "+arrayCall.arraySize(output));
	System.out.println("String last duplicates index");
	stringName=inputCall.getStringName1();
	stored=arrayCall.addDuplicatesLast(output,stringName);
	System.out.println("String last duplicates index : "+stored);
	System.out.println("ArrayList Size: "+arrayCall.arraySize(output));
    }
    catch(Exception e)
    {
     System.out.println(e.getMessage());
    }
    break;
case 10:
try{
	output=arrayCall.callArrayList();
	System.out.println("how many string you want to append");
	length=inputCall.getNumber();
	Object []array=inputCall.getStringArray(length);
	output=arrayCall.addCustom(output,array);
	System.out.println("ArrayList is : "+output);
	System.out.println("set insert String: ");
	stringName=inputCall.getStringName1();
	System.out.println("set insert string index: ");
	stored=inputCall.getNumber();
	output=arrayCall.addGivenString(output,stringName,stored);
	System.out.println("ArrayList is : "+output);
	System.out.println("ArrayList Size: "+arrayCall.arraySize(output));
    }
    catch(Exception e)
    {
     System.out.println(e.getMessage());
    }
    break;
case 11:
try{
	output=arrayCall.callArrayList();
	System.out.println("how many string you want to append");
	length=inputCall.getNumber();
	Object []array=inputCall.getStringArray(length);
	output=arrayCall.addCustom(output,array);
	System.out.println("ArrayList is : "+output);
	subOutput=arrayCall.callArrayList();
	System.out.println("Starting position1: ");
	stored=inputCall.getNumber();
	System.out.println("Ending position2: ");
	length=inputCall.getNumber();
	output=arrayCall.addSubArrayList(output,subOutput,stored,length);
	System.out.println("ArrayList is : "+output);
	System.out.println("ArrayList Size: "+arrayCall.arraySize(output));
    }
    catch(Exception e)
    {
     System.out.println(e.getMessage());
    }
    break;
case 12:
try{
	output=arrayCall.callArrayList();
	System.out.println("how many string you want to append");
	length=inputCall.getNumber();
	Object []array=inputCall.getStringArray(length);
	output=arrayCall.addCustom(output,array);
	System.out.println("ArrayList is : "+output);
	subOutput=arrayCall.callArrayList();
	System.out.println("how many string you want to append");
	stored=inputCall.getNumber();
	Object []array1=inputCall.getStringArray(stored);
	subOutput=arrayCall.addCustom(subOutput,array1);
	System.out.println("ArrayList is : "+subOutput);
	output=arrayCall.addThirdArrayList(output,subOutput);
	System.out.println("ArrayList is : "+output);
	System.out.println("ArrayList Size: "+arrayCall.arraySize(output));
    }
    catch(Exception e)
    {
     System.out.println(e.getMessage());
    }
    break;
case 13:
try{
	output=arrayCall.callArrayList();
	System.out.println("how many string you want to append");
	length=inputCall.getNumber();
	Object []array=inputCall.getStringArray(length);
	output=arrayCall.addCustom(output,array);
	System.out.println("ArrayList is : "+output);
	subOutput=arrayCall.callArrayList();
	System.out.println("how many string you want to append");
	stored=inputCall.getNumber();
	Object []array1=inputCall.getStringArray(stored);
	subOutput=arrayCall.addCustom(subOutput,array1);
	System.out.println("ArrayList is : "+subOutput);
	output=arrayCall.addThirdArrayList(subOutput,output);
	System.out.println("ArrayList is : "+output);
	System.out.println("ArrayList Size: "+arrayCall.arraySize(output));
    }
    catch(Exception e)
    {
     System.out.println(e.getMessage());
    }
    break;
case 14:
try{
	output=arrayCall.callArrayList();
	System.out.println("how many double you want to append");
	length=inputCall.getNumber();
	Object []array=inputCall.getDoubleArray(length);
	output=arrayCall.addCustom(output,array);
	System.out.println("ArrayList is : "+output);
	System.out.println("remove the double value: ");
	check=inputCall.getDouble();
	output=arrayCall.remove(output,check);
	System.out.println("ArrayList is : "+output);
	System.out.println("ArrayList Size: "+arrayCall.arraySize(output));
    }
    catch(Exception e)
    {
     System.out.println(e.getMessage());
    }
    break;
case 15:
try{    
	output=arrayCall.callArrayList();
	System.out.println("how many double you want to append");
	length=inputCall.getNumber();
	Object []array=inputCall.getDoubleArray(length);
	output=arrayCall.addCustom(output,array);
	System.out.println("ArrayList is : "+output);
	System.out.println("Remove the index: ");
	stored=inputCall.getNumber();
	output=arrayCall.removePosition(output,stored);
	System.out.println("ArrayList is : "+output);
	System.out.println("ArrayList Size: "+arrayCall.arraySize(output));
    }
    catch(Exception e)
    {
     System.out.println(e.getMessage());
    }
    break;
case 16:
try{
	output=arrayCall.callArrayList();
	System.out.println("how many string you want to append");
	length=inputCall.getNumber();
	Object []array=inputCall.getStringArray(length);
	output=arrayCall.addCustom(output,array);
	System.out.println("List:"+output);
	System.out.println("ArrayList is : "+output);
	subOutput=arrayCall.callArrayList();
	System.out.println("how many string you want to append");
	stored=inputCall.getNumber();
	Object []array1=inputCall.getStringArray(stored);
	subOutput=arrayCall.addCustom(subOutput,array1);
	System.out.println("ArrayList is : "+subOutput);
	output=arrayCall.removeElement(output,subOutput);
	System.out.println("ArrayList is : "+output);
	System.out.println("ArrayList Size: "+arrayCall.arraySize(output));
    
    
    }
    catch(Exception e)
    {
     System.out.println(e.getMessage());
    }
    break;
case 17:
try{
	output=arrayCall.callArrayList();
	System.out.println("how many string you want to append");
	length=inputCall.getNumber();
	Object []array=inputCall.getStringArray(length);
	output=arrayCall.addCustom(output,array);
	System.out.println("ArrayList is : "+output);
	subOutput=arrayCall.callArrayList();
	System.out.println("how many string you want to append");
	stored=inputCall.getNumber();
	Object []array1=inputCall.getStringArray(stored);
	subOutput=arrayCall.addCustom(subOutput,array1);
	System.out.println("ArrayList is : "+subOutput);
	output=arrayCall.removeElements(output,subOutput);
	System.out.println("ArrayList is : "+output);
	System.out.println("ArrayList Size: "+arrayCall.arraySize(output));
    }
    catch(Exception e)
    {
     System.out.println(e.getMessage());
    }  
    break;
case 18:
try{
	output=arrayCall.callArrayList();
	System.out.println("how many long you want to append");
	length=inputCall.getNumber();
	Object []array=inputCall.getLongArray(length);
	output=arrayCall.addCustom(output,array);
	System.out.println("ArrayList is : "+output);
	output=arrayCall.removeAll(output);
	System.out.println("ArrayList is : "+output);
	System.out.println("ArrayList Size: "+arrayCall.arraySize(output));
    }
    catch(Exception e)
    {
     System.out.println(e.getMessage());
    }
    break;
case 19:
try{
	output=arrayCall.callArrayList();
	System.out.println("how many string you want to append");
	length=inputCall.getNumber();
	Object []array=inputCall.getStringArray(length);
	output=arrayCall.addCustom(output,array);
	System.out.println("ArrayList is : "+output);
	System.out.println("check String in ArrayList ");
	stringName=inputCall.getStringName1();
	boolean run=arrayCall.addCheckString(output,stringName);
	System.out.println("Given String is present in arraylist: "+run);
	System.out.println("ArrayList Size: "+arrayCall.arraySize(output));
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
