/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mypack;

/**
 *
 * @author Shivam Pandey
 */
public class EncryptionManager {
    String encryptText="";
 public String encryptData(String password)
 {
for(int i=0;i<password.length();i++)
{
    char ch=password.charAt(i);
    int n=ch;
    char newChar;
    if(n>=65&&n<=90)
    {
       n=65-n+122; 
    }
    else if(n>=97&&n<=122)
    {
       n=97-n+90; 
    }
    else if(n>=48&&n<=57)
    {
    n=48-n+57;
    }
    newChar=(char)n;
    encryptText=encryptText+newChar;
}
return encryptText;
 }
    
}
