package test;

import java.util.*;
import task.*;
import java.util.Scanner;

public class HashMapExOutput
{
public static void main(String []args)
{

HashMapEx mapCall=new HashMapEx();
Map<Object,Object> output=new HashMap<Object,Object>();
Map<Object,Object> subOutput=new HashMap<Object,Object>();
Scanner scan=new Scanner(System.in);


int number=0;
int stored=0;
//int subStored=0;
Object objectKey;
Object objectValue;

System.out.println("Enter the Case:");
try
{
	number=scan.nextInt();
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
	output=mapCall.createHashMap();
	System.out.println("HashMap Size: "+mapCall.mapSize(output));
    }
    catch(Exception e)
    {
     System.out.println(e.getMessage());
    }
    break;
case 2:
try{
	output=mapCall.createHashMap();
	System.out.println("how many keys strings&values you want to append");
	stored=scan.nextInt();
	scan.nextLine();
	for(int iter=0;iter < stored;iter++)
	{
		System.out.println("Enter the Key");
		objectKey=scan.nextLine();
		System.out.println("Enter the Value");
		objectValue=scan.nextLine();
		output=mapCall.addValues(output,objectKey,objectValue);
	}
	System.out.println("Hashmap is: "+output);
	System.out.println("HashMap Size: "+mapCall.mapSize(output));
	
   }
   catch(Exception e)
   {
     System.out.println(e.getMessage());
   }
    break;
case 3:
try{    
	output=mapCall.createHashMap();
	System.out.println("how many keys strings&values you want to append");
	stored=scan.nextInt();
	scan.nextLine();
	for(int iter=0;iter < stored;iter++)
	{
		System.out.println("Enter the Key");
		objectKey=scan.nextInt();
		System.out.println("Enter the Value");
		objectValue=scan.nextInt();
		output=mapCall.addValues(output,objectKey,objectValue);
	}
	System.out.println("Hashmap is: "+output);
	System.out.println("HashMap Size: "+mapCall.mapSize(output));
    }
    catch(Exception e)
    {
     System.out.println(e.getMessage());
    }
    break;
case 4:
try{
	output=mapCall.createHashMap();
	System.out.println("how many keys strings&values you want to append");
	stored=scan.nextInt();
	scan.nextLine();
	for(int iter=0;iter < stored;iter++)
	{
		System.out.println("Enter the Key");
		objectKey=scan.nextLine();
		System.out.println("Enter the Value");
		objectValue=scan.nextInt();
		scan.nextLine();
		output=mapCall.addValues(output,objectKey,objectValue);
	}
	System.out.println("Hashmap is: "+output);
	System.out.println("HashMap Size: "+mapCall.mapSize(output));
    }
    catch(Exception e)
    {
     System.out.println(e.getMessage());
    }
    break;
case 5:
try{
	output=mapCall.createHashMap();
	System.out.println("how many keys strings&object you want to append");
	stored=scan.nextInt();
	scan.nextLine();
	for(int iter=0;iter < stored;iter++)
	{
		System.out.println("Enter the Key");
		objectKey=scan.nextLine();
		objectValue=new Object();
		output=mapCall.addValues(output,objectKey,objectValue);
	}
	System.out.println("Hashmap is: "+output);
	System.out.println("HashMap Size: "+mapCall.mapSize(output));
    }
    catch(Exception e)
    {
     System.out.println(e.getMessage());
    }
    break;
case 6:
try{
	output=mapCall.createHashMap();
	System.out.println("how many keys strings&object you want to append");
	stored=scan.nextInt();
	System.out.println("Enter the null position:");
	int nullKey=scan.nextInt();
	scan.nextLine();
	Object objKey="";
	for(int iter=0;iter < stored;iter++)
	{
	if(iter!=nullKey)
		{
		System.out.println("Enter the Key");
		objKey=scan.nextLine();
		}
		System.out.println("Enter the Value");
		objectValue=scan.nextLine();
	if(iter == nullKey)
		{
		objKey=null;
		output=mapCall.addValues(output,objKey,objectValue);
		}
	output=mapCall.addValues(output,objKey,objectValue);
	}
	System.out.println("Hashmap is: "+output);
	System.out.println("HashMap Size: "+mapCall.mapSize(output));
   }
    catch(Exception e)
    {
     System.out.println(e.getMessage());
    }
    break;
case 7:
try{
	output=mapCall.createHashMap();
	System.out.println("how many keys strings&object you want to append");
	stored=scan.nextInt();
	System.out.println("Enter the null position:");
	int nullValue=scan.nextInt();
	scan.nextLine();
	Object objValue="";
	for(int iter=0;iter < stored;iter++)
	{
	System.out.println("Enter the Key");
		objectKey=scan.nextLine();
	if(iter!=nullValue)
		{
		System.out.println("Enter the Value");
		objValue=scan.nextLine();		
		}
	if(iter == nullValue)
		{
		objValue=null;
		output=mapCall.addValues(output,objectKey,objValue);
		}
	output=mapCall.addValues(output,objectKey,objValue);
	}
	System.out.println("Hashmap is: "+output);
	System.out.println("HashMap Size: "+mapCall.mapSize(output));
   }
    catch(Exception e)
    {
     System.out.println(e.getMessage());
    }
    break;
case 8:
try{    
	output=mapCall.createHashMap();
	System.out.println("how many keys strings&values you want to append");
	stored=scan.nextInt();
	scan.nextLine();
	for(int iter=0;iter < stored;iter++)
	{
		System.out.println("Enter the Key");
		objectKey=scan.nextLine();
		System.out.println("Enter the Value");
		objectValue=scan.nextLine();
		output=mapCall.addValues(output,objectKey,objectValue);
	}
	System.out.println("Hashmap is: "+output);
	System.out.println("HashMap Size: "+mapCall.mapSize(output));
	System.out.println("Enter check the Key");
	objectKey=scan.nextLine();
	boolean outputCheck=mapCall.checkKey(output,objectKey);
	System.out.println("check a key exists in a HashMap: "+outputCheck);
	System.out.println("Hashmap is: "+output);
	System.out.println("HashMap Size: "+mapCall.mapSize(output));
   }
    catch(Exception e)
    {
     System.out.println(e.getMessage());
    }
    break;
case 9:
try{    
	output=mapCall.createHashMap();
	System.out.println("how many keys strings&values you want to append");
	stored=scan.nextInt();
	scan.nextLine();
	for(int iter=0;iter < stored;iter++)
	{
		System.out.println("Enter the Key");
		objectKey=scan.nextLine();
		System.out.println("Enter the Value");
		objectValue=scan.nextLine();
		output=mapCall.addValues(output,objectKey,objectValue);
	}
	System.out.println("Hashmap is: "+output);
	System.out.println("HashMap Size: "+mapCall.mapSize(output));
	System.out.println("Enter check the Value");
	objectValue=scan.nextLine();
	boolean checkOutput=mapCall.checkValue(output,objectValue);
	System.out.println("check a value exists in a HashMap "+checkOutput);
	System.out.println("HashMap Size: "+mapCall.mapSize(output));
    }
    catch(Exception e)
    {
     System.out.println(e.getMessage());
    }
    break;
case 10:
try{
	output=mapCall.createHashMap();
	System.out.println("how many keys strings&values you want to append");
	stored=scan.nextInt();
	scan.nextLine();
	objectKey="";
	for(int iter=0;iter < stored;iter++)
	{
		System.out.println("Enter the Key");
		objectKey=scan.nextLine();
		System.out.println("Enter the Value");
		objectValue=scan.nextLine();
		output=mapCall.addValues(output,objectKey,objectValue);
	}
	System.out.println("Hashmap is: "+output);
	System.out.println("HashMap Size: "+mapCall.mapSize(output));
	for(Object outputString:output.keySet())
	{
	    System.out.println("Enter the new Value for this key: "+outputString);
	    String valueString=scan.nextLine();
	    output.replace(outputString,valueString);
	}
	System.out.println("HashMap is: "+output);
	System.out.println("HashMap Size: "+mapCall.mapSize(output));
    }
    catch(Exception e)
    {
     System.out.println(e.getMessage());
    }
    break;
case 11:
try{
	output=mapCall.createHashMap();
	System.out.println("how many keys strings&values you want to append");
	stored=scan.nextInt();
	scan.nextLine();
	for(int iter=0;iter < stored;iter++)
	{
		System.out.println("Enter the Key");
		objectKey=scan.nextLine();
		System.out.println("Enter the Value");
		objectValue=scan.nextLine();
		output=mapCall.addValues(output,objectKey,objectValue);
	}
	System.out.println("Hashmap is: "+output);
	System.out.println("HashMap Size: "+mapCall.mapSize(output));
	System.out.println("Enter the Key");
	objectKey=scan.nextLine();
	Object objOutput=mapCall.getValue(output,objectKey);
	System.out.println("Hashmap is: "+objOutput);
	System.out.println("HashMap Size: "+mapCall.mapSize(output));   
    }
    catch(Exception e)
    {
     System.out.println(e.getMessage());
    }
    break;
case 12:
try{
	output=mapCall.createHashMap();
	System.out.println("how many keys strings&values you want to append");
	stored=scan.nextInt();
	scan.nextLine();
	for(int iter=0;iter < stored;iter++)
	{
		System.out.println("Enter the Key");
		objectKey=scan.nextLine();
		System.out.println("Enter the Value");
		objectValue=scan.nextLine();
		output=mapCall.addValues(output,objectKey,objectValue);
	}
	System.out.println("Hashmap is: "+output);
	System.out.println("HashMap Size: "+mapCall.mapSize(output));
	System.out.println("Enter the Key");
	objectKey=scan.nextLine();
	Object objOutput=mapCall.getValue(output,objectKey);
	System.out.println("Hashmap is: "+objOutput);
	System.out.println("HashMap Size: "+mapCall.mapSize(output));
    }
    catch(Exception e)
    {
     System.out.println(e.getMessage());
    }
    break;
case 13:
try{
	output=mapCall.createHashMap();
	System.out.println("how many keys strings&values you want to append");
	stored=scan.nextInt();
	scan.nextLine();
	for(int iter=0;iter < stored;iter++)
	{
		System.out.println("Enter the Key");
		objectKey=scan.nextLine();
		System.out.println("Enter the Value");
		objectValue=scan.nextLine();
		output=mapCall.addValues(output,objectKey,objectValue);
	}
	System.out.println("Hashmap is: "+output);
	System.out.println("HashMap Size: "+mapCall.mapSize(output));
	System.out.println("Enter the Key");
	objectKey=scan.nextLine();
	System.out.println("Enter the Value");
	objectValue=scan.nextLine();
	Object objOutput=mapCall.returnValue(output,objectKey,objectValue);
	System.out.println("Hashmap is: "+objOutput);
	System.out.println("HashMap Size: "+mapCall.mapSize(output));
    }
    catch(Exception e)
    {
     System.out.println(e.getMessage());
    }
    break;
case 14:
try{
	output=mapCall.createHashMap();
	System.out.println("how many keys strings&values you want to append");
	stored=scan.nextInt();
	scan.nextLine();
	for(int iter=0;iter < stored;iter++)
	{
		System.out.println("Enter the Key");
		objectKey=scan.nextLine();
		System.out.println("Enter the Value");
		objectValue=scan.nextLine();
		output=mapCall.addValues(output,objectKey,objectValue);
	}
	System.out.println("Hashmap is: "+output);
	System.out.println("HashMap Size: "+mapCall.mapSize(output));
	System.out.println("Enter the Key");
	objectKey=scan.nextLine();
	output=mapCall.removeKey(output,objectKey);
	System.out.println("Hashmap is: "+output);
	System.out.println("HashMap Size: "+mapCall.mapSize(output));
    }
    catch(Exception e)
    {
     System.out.println(e.getMessage());
    }
    break;
case 15:
try{    
	output=mapCall.createHashMap();
	System.out.println("how many keys strings&values you want to append");
	stored=scan.nextInt();
	scan.nextLine();
	for(int iter=0;iter < stored;iter++)
	{
		System.out.println("Enter the Key");
		objectKey=scan.nextLine();
		System.out.println("Enter the Value");
		objectValue=scan.nextLine();
		output=mapCall.addValues(output,objectKey,objectValue);
	}
	System.out.println("Hashmap is: "+output);
	System.out.println("HashMap Size: "+mapCall.mapSize(output));
	System.out.println("Enter the Key");
	objectKey=scan.nextLine();
	System.out.println("Enter the Value");
	objectValue=scan.nextLine();
	output=mapCall.removeValue(output,objectKey,objectValue);
	System.out.println("Hashmap is: "+output);
	System.out.println("HashMap Size: "+mapCall.mapSize(output));
    }
    catch(Exception e)
    {
     System.out.println(e.getMessage());
    }
    break;
case 16:
try{
	output=mapCall.createHashMap();
	System.out.println("how many keys strings&values you want to append");
	stored=scan.nextInt();
	scan.nextLine();
	for(int iter=0;iter < stored;iter++)
	{
		System.out.println("Enter the Key");
		objectKey=scan.nextLine();
		System.out.println("Enter the Value");
		objectValue=scan.nextLine();
		output=mapCall.addValues(output,objectKey,objectValue);
	}
	System.out.println("Hashmap is: "+output);
	System.out.println("HashMap Size: "+mapCall.mapSize(output));
	System.out.println("Enter the Key");
	objectKey=scan.nextLine();
	System.out.println("Enter the Value");
	objectValue=scan.nextLine();
	output=mapCall.replace(output,objectKey,objectValue);
	System.out.println("Hashmap is: "+output);
	System.out.println("HashMap Size: "+mapCall.mapSize(output));
    }
    catch(Exception e)
    {
     System.out.println(e.getMessage());
    }
    break;
case 17:
try{
	output=mapCall.createHashMap();
	System.out.println("how many keys strings&values you want to append");
	stored=scan.nextInt();
	scan.nextLine();
	for(int iter=0;iter < stored;iter++)
	{
		System.out.println("Enter the Key");
		objectKey=scan.nextLine();
		System.out.println("Enter the Value");
		objectValue=scan.nextLine();
		output=mapCall.addValues(output,objectKey,objectValue);
	}
	System.out.println("Hashmap is: "+output);
	System.out.println("HashMap Size: "+mapCall.mapSize(output));
	System.out.println("Enter the Key");
	objectKey=scan.nextLine();
	System.out.println("Enter the OldValue");
	objectValue=scan.nextLine();
	System.out.println("Enter the NewValue");
	Object objectNewValue=scan.nextLine();
	output=mapCall.replaceOne(output,objectKey,objectValue,objectNewValue);
	System.out.println("Hashmap is: "+output);
	System.out.println("HashMap Size: "+mapCall.mapSize(output));
    }
    catch(Exception e)
    {
     System.out.println(e.getMessage());
    }  
    break;
case 18:
try{
	output=mapCall.createHashMap();
	System.out.println("how many keys strings&values you want to append");
	stored=scan.nextInt();
	scan.nextLine();
	for(int iter=0;iter < stored;iter++)
	{
		System.out.println("Enter the Key");
		objectKey=scan.nextLine();
		System.out.println("Enter the Value");
		objectValue=scan.nextLine();
		output=mapCall.addValues(output,objectKey,objectValue);
	}
	System.out.println("Hashmap is: "+output);
	System.out.println("HashMap Size: "+mapCall.mapSize(output));
	subOutput=mapCall.createHashMap();
	output=mapCall.transfer(output,subOutput);
	System.out.println("Hashmap is: "+output);
	System.out.println("HashMap Size: "+mapCall.mapSize(output));
    }
    catch(Exception e)
    {
     System.out.println(e.getMessage());
    }
    break;
case 19:
try{
	output=mapCall.createHashMap();
	System.out.println("how many keys strings&values you want to append");
	stored=scan.nextInt();
	scan.nextLine();
	for(int iter=0;iter < stored;iter++)
	{
		System.out.println("Enter the Key");
		objectKey=scan.nextLine();
		System.out.println("Enter the Value");
		objectValue=scan.nextLine();
		output=mapCall.addValues(output,objectKey,objectValue);
	}
	Iterator iter=output.entrySet().iterator();
	while(iter.hasNext())
	{
		System.out.println(iter.next());
	}
    }
    catch(Exception e)
    {
     System.out.println(e.getMessage());
    }
    break;
case 20:
try{
	output=mapCall.createHashMap();
	System.out.println("how many keys strings&values you want to append");
	stored=scan.nextInt();
	scan.nextLine();
	for(int iter=0;iter < stored;iter++)
	{
		System.out.println("Enter the Key");
		objectKey=scan.nextLine();
		System.out.println("Enter the Value");
		objectValue=scan.nextLine();
		output=mapCall.addValues(output,objectKey,objectValue);
	}
	System.out.println("Hashmap is: "+output);
	System.out.println("HashMap Size: "+mapCall.mapSize(output));
	output=mapCall.removeAll(output);
	System.out.println("Hashmap is: "+output);
	System.out.println("HashMap Size: "+mapCall.mapSize(output));	
    }
    catch(Exception e)
    {
     System.out.println(e.getMessage());
    }
    break;

default:
    System.out.println("Unavailable Task");
    System.out.println("Enter the Task Number 1 to 20");       
}
}
}
