/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class MyList {
    Node first;
    Node last;
    Node pointer; //Variables
    //Constructor
    MyList(){
        first=null;
        last=null;  //Constructor without parameters
        pointer=null;
        
    }
    MyList(int data){ //Constructor with parameter 
        Node node =new Node(data);
        first=node; //Pointing node 
        
        last=node;
        node.next=null;
    
    }
    public boolean isEmpty(){
      /*  if(first==null){ // if(first==null && last==null) not necessary
            return true;
        }else{
            return false;
        }
    }*/
      return first==null;
    }
   //Methods  //Is it Empty?
    //Insert the first
    public void insertFirst(int d){
        Node node=new Node(d);
        if(isEmpty()){
            
            //Case empty list
            first=node; //Pointing node 
        
        last=node;
        node.next=null;
            
        }
        else{
           node.next=first; //Case with element
           first=node;
            
        }
        
    }
    //Insert the final
    public void insertLast(int d){
        Node node= new Node(d);
        if(isEmpty()){
            
            //Case empty list
            first=node; //Pointing node 
        
        last=node;
        node.next=null;
            
        }
        else{
           last.next=node; //Case with element
           last=node;
          
            
        }
    }
    //Delete the first
    public void deleteFirst(){
        if(!isEmpty()){
            if(first.next==null){ //Si la lista solo tiene un elemento
                first=null;
                last=null;
            }else{
                first=first.next;
                
            }
        }
    }
      //Delete the final
    public void deleteLast(){
        if(!isEmpty()){
            if(first==last){ //If the list have only a one element  if(first.next==null){ 
                first=last=null;
            }else{//We search in the array
                pointer=first;
               
                while(pointer.next!=last){ // Scrolls the list and stops at the value of  element of the last one
                pointer=pointer.next;
                
            }
                last=pointer;
                last.next=null;
                pointer=null;
                
             
            }
        }
    }
  
    
}
