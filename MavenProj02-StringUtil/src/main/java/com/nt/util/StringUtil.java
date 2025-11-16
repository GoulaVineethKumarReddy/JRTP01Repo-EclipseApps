package com.nt.util;

import java.util.StringTokenizer;

public class StringUtil 
{
  public static int countWords(String text) {
	  StringTokenizer tokenizer = new StringTokenizer(text," ");
//	  String arr[]=text.split(" ");
//	  int count = arr.length;
	  int count = tokenizer.countTokens();
	  return count;
  }
}
