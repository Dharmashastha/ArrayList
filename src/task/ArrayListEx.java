package task;

import java.util.*;
import java.util.Iterator;


public class ArrayListEx
{

private void checkArrayList(List checkArray) throws Exception
{
if(checkArray == null)
{
	throw new Exception("ArrayList can't be empty");
}
}

public List callArrayList()
{
 	List start=new ArrayList(); 	
return start;
}

					//program 1
public int arraySize(List sizeArray) throws Exception
{
	checkArrayList(sizeArray);
	int size=sizeArray.size();
return size;
}

					//program 2
/*public List addString(List addArray,String name[]) throws Exception
{
	checkArrayList(addArray);
for(String stringName: name)
{
	addArray.add(stringName);
}
return addArray;
}

					//program 3
public List addInteger(List addArray,int number[]) throws Exception
{
	checkArrayList(addArray);
for(int numberInt:number)
{
	addArray.add(numberInt);
}
return addArray;
}*/

					//program 4
public List addCustom(List addArray,Object[] arrayObj) throws Exception
{
	checkArrayList(addArray);
	addArray.addAll(Arrays.asList(arrayObj));
//Collections.addAll(addArray,arrayObj);
return addArray;
}

					//program 5
/*public List addAll(List addArray,String stringName[],int number[],Object arrayObj1,Object arrayobj2) throws Exception
{
	checkArrayList(addArray);
	addString(addarray,stringName);
	addInteger(addArray,number);
	addCustom(addArray,arrayObj1);
	addCustom(addArray,arrayObj2);
return addArray;
}*/

					//program 6
public int addFindIndex(List addArray,String input) throws Exception
{
	checkArrayList(addArray);
	int index=addArray.indexOf(input);
return index;	
}
					//program 7
/*public List addIterator(List addArray) throws Exception
{
	checkArrayList(addArray);
	Iterator iter=addArray.iterator();
return addArray;
}*/

					//program 8
public String addIndex(List addArray,int index) throws Exception
{
	checkArrayList(addArray);
	//int position=addArray.indexOf(index);
	int size=arraySize(addArray);
	String stringName="";
if(size > index)
    {
	stringName=(String)addArray.get(index);
    }
return stringName;
}

					//program 9.1
public int addDuplicatesFirst(List addArray,String input) throws Exception
{
	checkArrayList(addArray);
	int position=addArray.indexOf(input);
return position;
}

					//program 9.2
public int addDuplicatesLast(List addArray,String input) throws Exception
{
	checkArrayList(addArray);
	int position=addArray.lastIndexOf(input);
return position;
}
					//program 10
public List addGivenString(List addArray,String input,int index) throws Exception
{
	checkArrayList(addArray);
	int size=arraySize(addArray);
if(size > index)
    {
	addArray.set(index,input);
    }
return addArray;
}

					//program 11
public List addSubArrayList(List addArray,List addSubArray,int position1,int position2) throws Exception
{
	checkArrayList(addArray);
	checkArrayList(addSubArray);
	int size=arraySize(addArray);
if(size > position1)
   {
	addSubArray = (List)addArray.subList(position1,position2);
   }
return addSubArray;
}
					//program 12
public List addThirdArrayList(List addArray,List addSubArray) throws Exception
{
	checkArrayList(addArray);
	checkArrayList(addSubArray);
	//addArray.addAll(addSubArray);
	addSubArray.addAll(addArray);
return addSubArray;
}

					//program 13
/*public List addThirdArray(List addArray,List addSubArray) throws Exception
{
	checkArrayList(addArray);
	checkArrayList(addSubArray);
	//addSubArray.addAll(addArray);
	addArray.addAll(addSubArray);
return addArray;
}
					
public List addDecimal(List addArray,double value[]) throws Exception
{
	checkArrayList(addArray);
for(double decimal:value)
{
	addArray.add(decimal);
}
return addArray;
}*/
					//program 14
public List remove(List addArray,double check) throws Exception
{
	checkArrayList(addArray);
	addArray.remove(check);
return addArray;
}

					//program 15
public List removePosition(List addArray,int index) throws Exception
{
	checkArrayList(addArray);
	addArray.remove(index);
return addArray;
}

					//program 16
public List removeElement(List addArray,List addSubArray) throws Exception
{
	checkArrayList(addArray);
	checkArrayList(addSubArray);
	addArray.removeAll(addSubArray);
return addArray;
}

					//program 17
public List removeElements(List addArray,List addSubArray) throws Exception
{
	checkArrayList(addArray);
	checkArrayList(addSubArray);
	addArray.retainAll(addSubArray);
	//addSubArray.remove(addArray);
return addArray;
}

					
/*public List addLong(List addArray,long value[]) throws Exception
{
	checkArrayList(addArray);
for(long values : value)
{
	addArray.add(values);
}
return addArray;
}*/
				//program 18
public List removeAll(List addArray) throws Exception
{
	checkArrayList(addArray);
	addArray.clear();
return addArray;
}

					//program 19
public boolean addCheckString(List addArray,String stringName) throws Exception
{
	checkArrayList(addArray);
	boolean check=addArray.contains(stringName);
return check;
}

}
