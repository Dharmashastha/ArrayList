package test;
import gokul.Str;
import task.Input;

public class Run{

public static void main(String []args){

Str stringCall= new Str();
Input inputCall=new Input(); 
int number=0;
char character=' ';
int i=0;
System.out.println("case 1:Find the length of a String");
System.out.println("case 2:Convert it into character Array");
System.out.println("case 3:Find the character");
System.out.println("case 4:Find the number of occurrences of a given letter/character");
System.out.println("case 5:Find the greatest position of the given letter/character");
System.out.println("case 6:Print the last 5 characters of a given String");
System.out.println("case 7:Print the first 3 characters of a given String");
System.out.println("case 8:Replace the first 3 characters of a String with XYZ");
System.out.println("case 9:Check whether a String starts with \"ent\"");
System.out.println("case 10:Check whether a String ends with \"le\"");
System.out.println("case 11:Convert an all lowercase string to an uppercase string");
System.out.println("case 12:Convert an all uppercase string to an lowercase string");
System.out.println("case 13:Reverse a String");
System.out.println("case 14:Accept a line with multiple Strings");
System.out.println("case 15:Output a Single String without space");
System.out.println("case 16:Multiple Strings & enclose each String into a String array");
System.out.println("case 17:Multiple Strings & merge each String with \"-\"");
System.out.println("case 18:Check whether the two given input String are equal -case sensitive");
System.out.println("case 19:Check whether the two given input String are equal -case in sensitive");
System.out.println("case 20:String with no space either at the beginning or end");
System.out.println("case 21:Exit");
System.out.println("Enter the Task Number:");
try{
i=inputCall.getI();
}
catch(Exception e){
System.out.println("Skipping the input is prohibited");
}
switch(i){
case 1:
try{
    inputCall.getStringName1();
    System.out.println(stringCall.getLength(inputCall.stringName1));
    //System.out.println(stringCall.length(null));
    System.out.println("Your Task "+i+" has been Executed....");
    }
    catch(Exception e)
    {
     System.out.println(e.getMessage());
    }
    break;
case 2:
try{
   inputCall.getStringName1();
    char[] characterArray=stringCall.characterarray(inputCall.stringName1);
    for(char stringName :characterArray){
	System.out.println(stringName);
	}
    System.out.println("Your Task "+i+" has been Executed....");
    }
    catch(Exception e)
    {
     System.out.println(e.getMessage());
    }
    break;
case 3:
try{    
    inputCall.getStringName1();
    number=inputCall.getNumber();
    System.out.println(stringCall.findCharacter(inputCall.stringName1,number));
    System.out.println("Your Task "+i+" has been Executed....");
    }
    catch(Exception e)
    {
     System.out.println(e.getMessage());
    }
    break;
case 4:
try{
    inputCall.getStringName1();
    character=inputCall.getCharacter();
    System.out.println(stringCall.occurences(inputCall.stringName1,character));
    //System.out.println(stringCall.occurences(null,character));
    System.out.println("Your Task "+i+" has been Executed....");
    }
    catch(Exception e)
    {
     System.out.println(e.getMessage());
    }
    break;
case 5:
try{
    inputCall.getStringName1();
    character=inputCall.getCharacter();
    System.out.println(stringCall.position(inputCall.stringName1,character));
    System.out.println("Your Task "+i+" has been Executed....");
    }
    catch(Exception e)
    {
     System.out.println(e.getMessage());
    }
    break;
case 6:
try{
    inputCall.getStringName1();
    number=inputCall.getNumber();
    System.out.println(stringCall.characters1(inputCall.stringName1,number));
    System.out.println("Your Task "+i+" has been Executed....");
    }
    catch(Exception e)
    {
     System.out.println(e.getMessage());
    }
    break;
case 7:
try{
    inputCall.getStringName1();
    number=inputCall.getNumber();
    System.out.println(stringCall.characters2(inputCall.stringName1,number));
    System.out.println("Your Task "+i+" has been Executed....");
    }
    catch(Exception e)
    {
     System.out.println(e.getMessage());
    }
    break;
case 8:
try{    
    inputCall.getStringName1();
    inputCall.getStringName2();
    System.out.println(stringCall.replace(inputCall.stringName1,inputCall.stringName2));
    System.out.println("Your Task "+i+" has been Executed....");
    }
    catch(Exception e)
    {
     System.out.println(e.getMessage());
    }
    break;
case 9:
try{    
    inputCall.getStringName1();
    inputCall.getStringName2();
    System.out.println(stringCall.checkStartsWith(inputCall.stringName1,inputCall.stringName2));
    System.out.println("Your Task "+i+" has been Executed....");
    }
    catch(Exception e)
    {
     System.out.println(e.getMessage());
    }
    break;
case 10:
try{
    inputCall.getStringName1();
    inputCall.getStringName2();
    System.out.println(stringCall.checkEndsWith(inputCall.stringName1,inputCall.stringName2));
    System.out.println("Your Task "+i+" has been Executed....");
    }
    catch(Exception e)
    {
     System.out.println(e.getMessage());
    }
    break;
case 11:
try{
    inputCall.getStringName1();
    System.out.println(stringCall.upperCase(inputCall.stringName1));
    System.out.println("Your Task "+i+" has been Executed....");
    }
    catch(Exception e)
    {
     System.out.println(e.getMessage());
    }
    break;
case 12:
try{
    inputCall.getStringName1();
    System.out.println(stringCall.lowerCase(inputCall.stringName1));
    System.out.println("Your Task "+i+" has been Executed....");
    }
    catch(Exception e)
    {
     System.out.println(e.getMessage());
    }
    break;
case 13:
try{
    inputCall.getStringName1();
    System.out.println(stringCall.reverse(inputCall.stringName1));
    System.out.println("Your Task "+i+" has been Executed....");
    }
    catch(Exception e)
    {
     System.out.println(e.getMessage());
    }
    break;
case 14:
try{
    inputCall.getStringName1();
    inputCall.getStringName2();
    System.out.println(stringCall.multipleString(inputCall.stringName1,inputCall.stringName2));
    System.out.println("Your Task "+i+" has been Executed....");
    }
    catch(Exception e)
    {
     System.out.println(e.getMessage());
    }
    break;
case 15:
try{    
    inputCall.getStringName1();
    inputCall.getStringName2();
    System.out.println(stringCall.space(inputCall.stringName1,inputCall.stringName2));
    System.out.println("Your Task "+i+" has been Executed....");
    }
    catch(Exception e)
    {
     System.out.println(e.getMessage());
    }
    break;
case 16:
try{
    inputCall.getStringName1();
    String[] stringArray=stringCall.array(inputCall.stringName1); 
    for (String stringName : stringArray){ 
    System.out.println(stringName);
    }
    System.out.println("Your Task "+i+" has been Executed....");
    }
    catch(Exception e)
    {
     System.out.println(e.getMessage());
    }
    break;
case 17:
try{
    number=inputCall.getNumber();
    String [] strArray=inputCall.getStringArray(number);
    System.out.println(stringCall.stringMerge(strArray));	
    }
    catch(Exception e)
    {
     System.out.println(e.getMessage());
    }  
    break;
case 18:
try{
    inputCall.getStringName1();
    inputCall.getStringName2();
    System.out.println(stringCall.equal(inputCall.stringName1,inputCall.stringName2));
    System.out.println("Your Task "+i+" has been Executed....");
    }
    catch(Exception e)
    {
     System.out.println(e.getMessage());
    }
    break;
case 19:
try{
    inputCall.getStringName1();
    inputCall.getStringName2();
    System.out.println(stringCall.equalsIgnore(inputCall.stringName1,inputCall.stringName2));
    System.out.println("Your Task "+i+" has been Executed....");
    }
    catch(Exception e)
    {
     System.out.println(e.getMessage());
    }
    break;
case 20:
try{
    inputCall.getStringName1();
    System.out.println(stringCall.trim(inputCall.stringName1));
    System.out.println("Your Task "+i+" has been Executed....");
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
