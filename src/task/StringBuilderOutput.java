package task;

public class StringBuilderOutput
{
public static void main(String []args)
{
StringBuilderCheck checkObj=new StringBuilderCheck();
StringBuilder strBuilder=new StringBuilder();
Input inputCall=new Input();

int number=0;
int length=0;
int stored=0;
char symbol=' ';
String stringName1="";
String stringName2="";
System.out.println("Enter the number:");

try{
number=inputCall.getI();
}
catch(Exception e){
System.out.println("Skipping the input is prohibited");
}

switch(number){
case 1:
try{
    System.out.println("Print the length:");
    System.out.println(checkObj.findLength(strBuilder));
    System.out.println("Enter the String:");
    stringName1 = inputCall.getStringName1();
    strBuilder = checkObj.oneAppend(strBuilder,stringName1);
    length = checkObj.findLength(strBuilder);
    System.out.println("Print the Length:"+length);
    System.out.println("The final String: "+strBuilder);
    }
    catch(Exception e)
    {
     System.out.println(e.getMessage());
    }
    break;
case 2:
try{
    System.out.println("Enter the String:");
    stringName1=inputCall.getStringName1();
    strBuilder=checkObj.createStringBuilder(stringName1);
    length=checkObj.findLength(strBuilder);
    System.out.println("print the length:"+length);
    System.out.println("how many string you want to append");
    stored=inputCall.getNumber();
    String array[]=inputCall.getStringArray(stored);
    System.out.println("Enter the Symbol:");
    stringName2=inputCall.getStringName1();
    strBuilder=checkObj.addSymbol(strBuilder,array,stringName2);
    length=checkObj.findLength(strBuilder);
    System.out.println("length:"+length); 
    System.out.println("The final String: "+strBuilder);
   }
    catch(Exception e)
    {
     System.out.println(e.getMessage());
    }
    break;
case 3:
try{
    System.out.println("how many string you want to append");    
    stored=inputCall.getNumber();
    String array[]=inputCall.getStringArray(stored);
    checkObj.arrayAppend(strBuilder,array);
    System.out.println("Enter the insertStr:");
    stringName2=inputCall.getStringName1();
    strBuilder=checkObj.insertString(strBuilder,stringName2);
    length=checkObj.findLength(strBuilder);
    System.out.println("print the length:"+length); 
    System.out.println("The final String: "+strBuilder);
    }
    catch(Exception e)
    {
     System.out.println(e.getMessage());
    }
    break;
case 4:
try{
    System.out.println("how many string you want to append");
    stored=inputCall.getNumber();
    String array[]=inputCall.getStringArray(stored);
    checkObj.arrayAppend(strBuilder,array);  
    strBuilder=checkObj.deleteString(strBuilder);
    System.out.println("The final String: "+strBuilder);
    length=checkObj.findLength(strBuilder)-1;
    System.out.println("print the length:"+length); 
    }
    catch(Exception e)
    {
     System.out.println(e.getMessage());
    }
    break;
case 5:
try{
    System.out.println("how many string you want to append");
    stored=inputCall.getNumber();
    String array[]=inputCall.getStringArray(stored);
    checkObj.arrayAppend(strBuilder,array);
    System.out.println("Enter the Symbol:");
    symbol=inputCall.getCharacter();
    strBuilder=checkObj.replaceString(strBuilder,symbol);
    length=checkObj.findLength(strBuilder);
    System.out.println("print the length:"+length);
    System.out.println("The final String: "+strBuilder);
    }
    catch(Exception e)
    {
     System.out.println(e.getMessage());
    }
    break;
case 6:
try{
    System.out.println("how many string you want to append");
    stored=inputCall.getNumber();
    String array[]=inputCall.getStringArray(stored);
    checkObj.arrayAppend(strBuilder,array);
    strBuilder=checkObj.reverseString(strBuilder);
    length=checkObj.findLength(strBuilder);
    System.out.println("print the length:"+length);
    System.out.println("The final String: "+strBuilder);
    }
    catch(Exception e)
    {
     System.out.println(e.getMessage());
    }
    break;
case 7:
try{
    System.out.println("how many string you want to append");
    stored=inputCall.getNumber();
    String array[]=inputCall.getStringArray(stored);
    checkObj.arrayAppend(strBuilder,array);
    length=checkObj.findLength(strBuilder);
    System.out.println("length:"+length);
    strBuilder=checkObj.deleteCharString(strBuilder);
    length=checkObj.findLength(strBuilder);
    System.out.println("print the length:"+length);
    System.out.println("The final String: "+strBuilder);
    }
    catch(Exception e)
    {
     System.out.println(e.getMessage());
    }
    break;
case 8:
try{
    System.out.println("how many string you want to append");    
    stored=inputCall.getNumber();
    String array[]=inputCall.getStringArray(stored);
    checkObj.arrayAppend(strBuilder,array);
    System.out.println("Enter the insertStr:");
    stringName1=inputCall.getStringName1();
    length=checkObj.findLength(strBuilder);
    System.out.println("print the length:"+length);
    strBuilder=checkObj.replaceCharString(strBuilder,stringName1);
    length=checkObj.findLength(strBuilder);
    System.out.println("print the length:"+length);
    System.out.println("The final String: "+strBuilder);
    }
    catch(Exception e)
    {
     System.out.println(e.getMessage());
    }
    break;
case 9:
try{
    System.out.println("how many string you want to append");    
    stored=inputCall.getNumber();
    String array[]=inputCall.getStringArray(stored);
    System.out.println("Enter the Symbol:");
    stringName1=inputCall.getStringName1();
    stored=checkObj.firstIndex(strBuilder,array,stringName1);
    length=checkObj.findLength(strBuilder);
    System.out.println("print the length:"+length);
    System.out.println("The final String: "+strBuilder);
    System.out.println("First of index: " +stored);    
    }
    catch(Exception e)
    {
     System.out.println(e.getMessage());
    }
    break;
case 10:
try{
    System.out.println("how many string you want to append");
    stored=inputCall.getNumber();
    String array[]=inputCall.getStringArray(stored);
    System.out.println("Enter the Symbol:");
    stringName1=inputCall.getStringName1();
    stored=checkObj.lastIndex(strBuilder,array,stringName1);
    length=checkObj.findLength(strBuilder);
    System.out.println("print the length:"+length);
    System.out.println("The final String: "+strBuilder);
    System.out.println("Index of last: " +stored);
    }
    catch(Exception e)
    {
     System.out.println(e.getMessage());
    }
    break;
}
}
}

