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

public String[] getStringArray(int num){
System.out.println("Enter the String:");
String [] strArray=new String[num];
for(int i=0;i<num;i++)
{
strArray[i]=sc.nextLine();
}
return strArray;
}

public int[] getIntArray(int num){
System.out.println("Enter the Number:");
int [] intArray=new int[num];
for(int i=0;i<num;i++)
{
intArray[i]=sc.nextInt();
}
return intArray;
}

public double[] getdoubleArray(int num){
System.out.println("Enter the Double:");
double [] douArray=new double[num];
for(int i=0;i<num;i++)
{
douArray[i]=sc.nextDouble();
}
return douArray;
}

public long[] getlongArray(int num){
System.out.println("Enter the Long:");
long [] longArray=new long[num];
for(int i=0;i<num;i++)
{
longArray[i]=sc.nextLong();
}
return longArray;
}

public int getNumber(){
int number=0;
//sc.nextLine();
try{
System.out.println("Enter the Number:");
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
