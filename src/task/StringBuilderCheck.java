package task;
//import gokul.Str;
class StringBuilderCheck{

//StringBuilder stringBuil=new StringBuilder();
Str strCall=new Str();

public void nullCheckStringBuilder(StringBuilder checkStrBuil)throws Exception{
if(checkStrBuil == null)
{
throw new Exception("Stringbuilder can't be null");
}
}
/*public void checkMiniChar(StringBuilder checkStrBuil) throws Exception
{
if(number < findLength(checkStrBuil))
	{
	 throw new Exception("Enter the vaild input(minimum 10 character)");
	}
}*/
public StringBuilder createStringBuilder(String stringName) throws Exception
{
	strCall.checkInputString(stringName);
	StringBuilder createStrBuil=new StringBuilder(stringName);
return createStrBuil;
}

public StringBuilder oneAppend(StringBuilder strBuilder,String stringName) throws Exception
{
nullCheckStringBuilder(strBuilder);
strCall.checkInputString(stringName);
strBuilder.append(stringName);
return strBuilder;
}

public StringBuilder arrayAppend(StringBuilder strBuilder,String [] stringName,String symbol) throws Exception
{
nullCheckStringBuilder(strBuilder);
for(String dummy:stringName)
{
strBuilder.append(dummy);
strBuilder.append(symbol);
}
return strBuilder;
}

//program 1
public int findLength(StringBuilder strBuilder) throws Exception
{
nullCheckStringBuilder(strBuilder);
int length=strBuilder.length();
return length;
}

//program 2
public StringBuilder addSymbol(StringBuilder strBuilder,String[] stringArray1,String symbol) throws Exception
{
nullCheckStringBuilder(strBuilder);
strCall.stringArray(stringArray1);
strCall.checkInputString(symbol);
for(String dummy:stringArray1)
{
	oneAppend(strBuilder,dummy);
	oneAppend(strBuilder,symbol);
}
int length=findLength(strBuilder);
strBuilder.delete(length-1,length);
return strBuilder;
}
//program 3
public StringBuilder insertString(StringBuilder strBuilder,String insertStr,String check) throws Exception
{
nullCheckStringBuilder(strBuilder);
	strBuilder.insert(strBuilder.indexOf(check)+1,insertStr+check);
	return strBuilder;
}
//program 4
public StringBuilder deleteString(StringBuilder strBuilder,String check,int position1) throws Exception
{
nullCheckStringBuilder(strBuilder);
int index=strBuilder.indexOf(check)+1;
	strBuilder.delete(position,index);
return strBuilder;
}

//program 5
public StringBuilder replaceString(StringBuilder strBuilder,char symbol,char check) throws Exception
{
nullCheckStringBuilder(strBuilder);
int length=findLength(strBuilder);
for(int i=0;i<length-1;i++)
{
if(strBuilder.charAt(i) == check)
{
	strBuilder.setCharAt(i,symbol);
}
}
return strBuilder;
}
//program 6
public StringBuilder reverseString(StringBuilder strBuilder) throws Exception
{
nullCheckStringBuilder(strBuilder);
strBuilder.reverse();
return strBuilder;
}
//program 7
public StringBuilder deleteCharString(StringBuilder strBuilder,int position1,int position2) throws Exception
{
nullCheckStringBuilder(strBuilder);
//checkMiniChar(findLength(strBuilder));
if(position1 < findLength(strBuilder))
{
strBuilder.delete(position1,position2);
}
return strBuilder;
}

//program 8
public StringBuilder replaceCharString(StringBuilder strBuilder,String stringName1,int position1,int position2) throws Exception
{
nullCheckStringBuilder(strBuilder);
//checkMiniChar(strBuilder);
if(position1 < findLength(strBuilder))
{
strBuilder.replace(position1,position2,stringName1);
}
return strBuilder;
}

//program 9
public int firstIndex(StringBuilder strBuilder,String[] array,String symbol) throws Exception 
{
nullCheckStringBuilder(strBuilder);
strBuilder=addSymbol(strBuilder,array,symbol);
int i=strBuilder.indexOf(symbol);
return  i;
}
//program 10
public int lastIndex(StringBuilder strBuilder,String[] array,String symbol) throws Exception 
{
nullCheckStringBuilder(strBuilder);
strBuilder=addSymbol(strBuilder,array,symbol);
int i=strBuilder.lastIndexOf(symbol);
return  i;
}
}
