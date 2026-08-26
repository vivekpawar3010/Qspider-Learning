package com.jsp;

import java.util.Arrays;

public class CustomString {
    
    private char[] value;

    public CustomString() {
        value = new char[0];
    }

    public CustomString(char[] ch) {
        value = new char[ch.length];
        for(int i = 0; i < ch.length; i++) {
            value[i] = ch[i];
        }
    }
    
    public CustomString(String str) {
        value = new char[str.length()];
        for(int i = 0; i < str.length(); i++) {
            value[i] = str.charAt(i); 
        }
    }

    public int length() {
        return value.length;
    }

    public boolean isEmpty() {
        return value.length == 0;
    }

    public char[] toCharArray() {
        return value;
    }

    public char charAt(int index) {
        return value[index];
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "";
        }
        String res = "";
        for (int i = 0; i < value.length; i++) {
            res = res + value[i];
        }
        return res;
    }

    public int indexOf(int ch, int fromIndex){
    	for(int i = fromIndex; i < value.length; i++){
    		if(value[i] == ch) return i;
    	}
    	return -1;
    }

    public int indexOf(int ch){
    	lastIndexOf(ch, 0);
    }

    public int lastIndexOf(int ch, int fromIndex){
    	for(int i = fromIndex; i >= 0; i--){
    		if(value[i] == ch) return i;
    	}
    	return -1;
    }

    public int lastIndexOf(int ch){
    	lastIndexOf(ch, value.length - 1);
    }



    
}