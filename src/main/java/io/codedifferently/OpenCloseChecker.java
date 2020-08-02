package io.codedifferently;
import java.io.*;
import java.util.*;

public class OpenCloseChecker {

    public Boolean isPair(String s){

    Stack <Character> stack= new Stack<Character>();
    for(int i=0;i<s.length();i++){
        char c= s.charAt(i);
        if(c=='('|| c=='{'|| c=='['||c=='<'||c=='\"'|| c=='\''){
            stack.push(c); //puts this char on the stack to await its match
        }
        if(c==')'&& !stack.isEmpty() && stack.peek()=='('){ //if is a match
            stack.pop(); //pops the top value in stack
        }if(c=='}'&& !stack.isEmpty() && stack.peek()=='{') { //if is a match
            stack.pop(); //pops the top value in stack
        }if(c==']'&& !stack.isEmpty() && stack.peek()==']') { //if is a match
            stack.pop(); //pops the top value in stack
        }if(c=='>'&& !stack.isEmpty() && stack.peek()=='<') { //if is a match
            stack.pop(); //pops the top value in stack
        }if(c=='\"'&& !stack.isEmpty() && stack.peek()=='\"') { //if is a match
            stack.pop(); //pops the top value in stack
        }if(c=='\''&& !stack.isEmpty() && stack.peek()=='\'') { //if is a match
            stack.pop(); //pops the top value in stack
        }else{
            //if letter, do nothing, loop continues
        }

        }
    return stack.isEmpty();//returns bool value if stack is empty or not, if it is, output=true
    }




}
