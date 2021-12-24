package task;

import java.util.*;
import task.*;

public class HashMapEx
{

public Map<Object,Object> createHashMap()
{
	Map<Object,Object> start=new HashMap<Object,Object>();
return start;
}

private void nullCheckMap(Map<Object,Object> checkMap) throws CheckException
{
if(checkMap == null)
{
	throw new CheckException("Map can't be Null");
}
}

				//program 1
public int mapSize(Map<Object,Object> addMap) throws CheckException
{
	nullCheckMap(addMap);
	int size=addMap.size();
return size;
}

				//program 2,3,4,5,6,7
public Map<Object,Object> addValues(Map<Object,Object> addMap,Object objectKey,Object objectValue) throws CheckException
{
	nullCheckMap(addMap);
	addMap.put(objectKey,objectValue);
return addMap;	
}

				//program 8
public boolean checkKey(Map<Object,Object> addMap,Object objectKey) throws CheckException
{
	nullCheckMap(addMap);
	boolean check=addMap.containsKey(objectKey);
return check;
}

				//program 9
public boolean checkValue(Map<Object,Object> addMap,Object objectValue) throws CheckException
{
	nullCheckMap(addMap);
	boolean check=addMap.containsValue(objectValue);
return check;
}

				//program 10
/*public Map<Object,Object> changeValue(Map<Object,Object> addMap,Map<Object,Object> addSubMap) throws CheckException
{
	nullCheckMap(addMap);
	nullCheckMap(addSubMap);
	addSubMap.putAll(addMap);
return addSubMap;
}*/


/*public Map<Object,Object> changeValue(Map<Object,Object> addMap,Map<Object,Object> addSubMap,Object objectNewValue) throws CheckException
{
	nullCheckMap(addMap);
	nullCheckMap(addSubMap);
	Object objectKey=addMap.keySet();
	addSubMap.put(objectKey,objectNewValue);
	//addSubMap.putAll(addMap);
return addSubMap;
}*/


				//program 11
public Object getValue(Map<Object,Object> addMap,Object objectKey) throws CheckException
{
	nullCheckMap(addMap);
return addMap.get(objectKey);
}

				//program 12
/*public Object getNonValue(Map<Object,Object> addMap,Object objectKey) throws CheckException
{
	nullCheckMap(addMap);
return addMap.get(objectKey);
}*/

				//program 13
public Object returnValue(Map<Object,Object> addMap,Object objectKey,Object objectValue) throws CheckException
{
	nullCheckMap(addMap);
return addMap.getOrDefault(objectKey,objectValue);
}

				//program 14
public Map<Object,Object> removeKey(Map<Object,Object> addMap,Object objectKey) throws CheckException
{
	nullCheckMap(addMap);
	addMap.remove(objectKey);
return addMap;
}

				//program 15
public Map<Object,Object> removeValue(Map<Object,Object> addMap,Object objectKey,Object objectValue) throws CheckException
{
	addMap.remove(objectKey,objectValue);
return addMap;
}

				//program 16
public Map<Object,Object> replace(Map<Object,Object> addMap,Object objectKey,Object objectValue) throws CheckException
{
	nullCheckMap(addMap);
	addMap.replace(objectKey,objectValue);
return addMap;
}

				//program 17
public Map<Object,Object> replaceOne(Map<Object,Object> addMap,Object objectKey,Object objectOldValue,Object objectNewValue) throws CheckException
{ 
	nullCheckMap(addMap);
	addMap.replace(objectKey,objectOldValue,objectNewValue);
return addMap;
}

				//program 18
public Map<Object,Object> transfer(Map<Object,Object> addMap,Map<Object,Object> addSubMap) throws CheckException
{
	nullCheckMap(addMap);
	nullCheckMap(addSubMap);
	addSubMap.putAll(addMap);
return addSubMap;
}

				//program 20
public Map<Object,Object> removeAll(Map<Object,Object> addMap) throws CheckException
{
	nullCheckMap(addMap);
	addMap.clear();
return addMap;
}
}
