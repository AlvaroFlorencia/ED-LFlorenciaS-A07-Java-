/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class Node<T> { //With "T" the data will be of any type
    T data;  //Varable
    Node next;  
    
    public Node(T d){
        this.data=d; //initializing the node
    }
}
