package networkprogramming;
import java.net.*;
public class ConstructorRelative {

	public static void main(String[] args)  throws MalformedURLException{
		// TODO Auto-generated method stub
		
//		// create URL with string URl Representation
//       URL u1=new URL("http:www.janabhawana.com/about");
//       
//       // create URL with Protocol,hostName&path
//       URL u2=new URL(u1,"MailingList.html");
//       System.out.println();
//       
//       //Create URL with protocol ,hostName,port path
//       URL u3=new URL("http:google.com:8080/products/About.html");
//       
//       // create URl with URL and string relative
//       URL u4= new URL("https://www.facebook.com//Home/contact.html");
//       URL u5=new URL(u4,"index.html");
     
		URL u1=new URL("http:www.janabhawana.com/about");
		System.out.println("The query string of"+u1+"is"+u1.getQuery());
		
		//URL page=this.CodeBase();
		//System.out.println("The system downloaded"+page.getProtocol());
		
		
	}

}
