package task;
import java.lang.String;
//import task.Input;

public class Str{

public void checkInputString(String inputString)throws Exception{
if(inputString == null||inputString.isEmpty())
{
throw new Exception("String can't be empty and null");
}
}

public boolean checkInputNumber(int inputLength,int position)throws Exception{
if(position > inputLength || position < 0){
throw new Exception("Number out of Range");
}
return true;
}

public void stringArray(String[] stringArray)throws Exception{
for(String stringOutput:stringArray)
{
checkInputString(stringOutput);
}
}

//program 1
public int getLength(String inputString)throws Exception
{
checkInputString(inputString);
return inputString.length();
}
//program 2
public char[] characterarray(String inputString) throws Exception
{
checkInputString(inputString);
char[] character=inputString.toCharArray();
return character;
}
//program 3
public char findCharacter(String inputString,int position)throws Exception{
checkInputString(inputString);
int length = getLength(inputString);
checkInputNumber(length,position);
char character=inputString.charAt(position);
return character;
}
//program 4
public int occurences(String inputString,char character)throws Exception{
int count=0;
checkInputString(inputString);
int length=getLength(inputString);
for(int i=0;i<length;i++)
{
    if(inputString.charAt(i) == character){
    count++;
    }
}
return count;
}   
     
//program 5
public int position(String inputString,char character)throws Exception{
checkInputString(inputString);
return inputString.lastIndexOf(character);
}
//program 6
public String characters1(String inputString,int position)throws Exception{
int length = getLength(inputString);
checkInputNumber(length,position);
String outputString=inputString.substring(length - position);
return outputString;
}
//program 7
public String characters2(String inputString,int position)throws Exception{
int length = getLength(inputString);
checkInputNumber(length,position);
String outputString=inputString.substring(0,position);
return outputString;
} 
//program 8
public String replace(String inputString,String replaceString)throws Exception{
checkInputString(inputString);
checkInputString(replaceString);
int length =getLength(replaceString);
return inputString+replaceString.substring(length);
}
//program 9
public boolean checkStartsWith(String inputString,String checkString)throws Exception{
checkInputString(inputString);
checkInputString(checkString);
boolean output=inputString.startsWith(checkString);
return output;
}
//program 10
public boolean checkEndsWith(String inputString,String checkString)throws Exception{
checkInputString(inputString);
checkInputString(checkString);
boolean output=inputString.endsWith(checkString);
return output;
}
//program 11
public String upperCase(String inputString)throws Exception{
 checkInputString(inputString);
 return inputString.toUpperCase();
}
//program 12
public String lowerCase(String inputString)throws Exception{
checkInputString(inputString);
return inputString.toLowerCase();
}
//program 13
public String reverse(String inputString)throws Exception{
String reverseString ="";
checkInputString(inputString);
char character;
int length=getLength(inputString);
for(int i=0;i<length;i++){
  character=inputString.charAt(i);
  reverseString=character+reverseString;
  }
return reverseString;
}
//program 14
public String multipleString(String inputString1,String inputString2)throws Exception{
checkInputString(inputString1);
checkInputString(inputString2);
return inputString1.concat(inputString2);
}
//program 15
public String space(String inputString1,String inputString2)throws Exception{
String outputString=multipleString(inputString1,inputString2);
outputString=outputString.replaceAll("\\s","");
return outputString;	
}

//program 16
public String[] array(String inputString1)throws Exception{
checkInputString(inputString1);
String []array=inputString1.split("\\s");
return array;
}
//program 17
public String stringMerge(String[] stringName3) throws Exception
{
stringArray(stringName3);
String outputString=String.join("-",stringName3);
return outputString;
}
//program 18
public boolean equal(String inputString1,String inputString2)throws Exception{
checkInputString(inputString1);
checkInputString(inputString2);
boolean output=inputString1.equals(inputString2);
return output;
}
//program 19
public boolean equalsIgnore(String inputString1,String inputString2)throws Exception{
checkInputString(inputString1);
checkInputString(inputString2);
boolean output=inputString1.equalsIgnoreCase(inputString2);
return output;
}
//program 20
public String trim(String inputString)throws Exception{
checkInputString(inputString);
return inputString.trim();
}
}
