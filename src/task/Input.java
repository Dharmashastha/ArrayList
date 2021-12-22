package task;
import java.util.Scanner;
import java.lang.String;


public class Input{

Scanner sc=new Scanner(System.in);
public String stringName1="";
public String stringName2="";
public String stringName3="";


public String getStringName1(){
try{
//System.out.println("Enter the String:");
stringName1=sc.nextLine();
if(stringName1 ==null||stringName1.isEmpty())
{
throw new Exception("String can't be empty and null  ");
}
}
catch(Exception e){
System.out.println(e.getMessage()+"Skipping the string input is prohibited");
}
return stringName1;
}

public void getStringName2(){
try{
//System.out.println("Enter the String:");
stringName2=sc.nextLine();
if(stringName2 == null ||stringName2.isEmpty()){
throw new Exception("String can't be empty and null  ");
}
}
catch(Exception e){
System.out.println(e.getMessage()+"Skipping the string input is prohibited");
}
}

public Object[] getStringArray(int num){
System.out.println("Enter the String:");
Object [] strArray=new Object[num];
for(int i=0;i<num;i++)
{
strArray[i]=sc.nextLine();
}
return strArray;
}

public Object[] getObject(int num){
System.out.println("Enter the Number:");
Object [] objArray=new Object[num];
for(int i=0;i<num;i++)
{
objArray[i]=new Object[i];
}
return objArray;
}


public Object[] getIntArray(int num){
System.out.println("Enter the Number:");
Object [] intArray=new Object[num];
for(int i=0;i<num;i++)
{
intArray[i]=sc.nextInt();
}
sc.nextLine();
return intArray;
}



public Object[] getDoubleArray(int num){
System.out.println("Enter the Double:");
Object [] douArray=new Object[num];
for(int i=0;i<num;i++)
{
douArray[i]=sc.nextDouble();
}
sc.nextLine();
return douArray;
}

public Object[] getLongArray(int num){
System.out.println("Enter the Long:");
Object [] longArray=new Object[num];
for(int i=0;i<num;i++)
{
longArray[i]=sc.nextLong();
}
return longArray;
}

public int getNumber(){
int number=0;
try{
//sc.nextLine();
//System.out.println("Enter the Number:");
String stringNumber=sc.nextLine();
if(stringNumber == null||stringNumber.isEmpty()){
throw new Exception("Number can't be empty and null  ");
}
number=Integer.parseInt(stringNumber);
}
catch(Exception e){
System.out.println(e.getMessage()+"Skipping the number input is prohibited");
}
return number;
}


public double getDouble(){
double number=0.00;
//sc.nextLine();
try{
System.out.println("Enter the Number:");
String stringNumber=sc.nextLine();
if(stringNumber == null||stringNumber.isEmpty()){
throw new Exception("Number can't be empty and null  ");
}
number=Double.parseDouble(stringNumber);
}
catch(Exception e){
System.out.println(e.getMessage()+"Skipping the number input is prohibited");
}
return number;
}


public char getCharacter(){
char character=' ';
try{
//System.out.println("Enter the Character:");
String stringCharacter=sc.nextLine();
if(stringCharacter == null||stringCharacter.isEmpty()){
throw new Exception("Chararacter can't be empty and null  ");
}
character=stringCharacter.charAt(0);
}
catch(Exception e){
System.out.println(e.getMessage()+"Skipping the character input is prohibited");
}
return character;
}

public int getI(){
int i=0;
try{
String stringNumber1=sc.nextLine();
if(stringNumber1.isEmpty()||stringNumber1 == null){
throw new Exception("Number can't be empty and null  ");
}
i=Integer.parseInt(stringNumber1);
//i=sc.nextInt();
//sc.nextLine();
}
catch(Exception e){
System.out.println(e.getMessage()+"Skipping the number input is prohibited");
}
return i;
}
}
