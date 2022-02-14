public class StringPractice {
  /* returns true if c is a punctuation mark or false otherwise
   * 
   * Punctuation mark is defined as:
   * apostrophe '
   * comma ,
   * period .
   * semicolon ;
   * colon :
   * exclamation point !
   * question mark ? 
   * 
   * (You don't have to worry about any others)
   */
  public static boolean isPunct(char c) {
	  
	  char apost = '\'';
	  char comma = ',';
	  char period = '.';
	  char semi = ';';
	  char colon = ':';
	  char exclPoint = '!';
	  char queMark = '?';
	  
	  if(c != apost && c != comma && c != period && c != semi && c != colon && c != exclPoint && c != queMark)
	  {
		  return false;
	  }
	  return true;
	  
  }

  /*
   * returns the number of punctuation marks
   * found in s.
   *
   * call your isPunct( ) method. Do not copy and paste
   * the same logic into this function */
  public static int numPunct(String s) {
	  int count = 0;
	  
	  for(int i = 0; i < s.length(); i++)
	  {
		  if(isPunct(s.charAt(i)) == true)
			  count ++;
	  }

	  if(count > 0)
	  {
		  return count;
	  }
	  
	  return 0;
  }
  
  /*
   * returns the number of punctuation marks
   * found in s starting at the given index.
   *
   * call your isPunct( ) method. Do not copy and paste
   * the same logic into this function */
  public static int numPunct(String s, int startIndex) {
	  int count = 0;
	  String newString;
	  	  
	  try
	  {
		  newString = s.substring(startIndex);
	  } catch(IndexOutOfBoundsException e)
	  {
		  return 0;
	  }
	  
	  char[] array = newString.toCharArray();
	  
	  for(int i = 0; i < array.length; i++)
	  {
		  if(isPunct(array[i]))
			  count ++;
	  }
  
	  return count;

	  
  }

  /*
   * returns the index of the first occurrence
   * of a punctuation mark in s starting
   * from index startPosition or -1 if there are
   * none at index startPosition or later.
   *
   * When implementing this function, call your isPunct( ) method.
   * Do not simply copy and paste the body of isPunct( ) into this method.
   */
  public static int indexOfFirstPunct(String s, int startPosition) {
//	  int count = 0;
//	  String newString = s.substring(startPosition);
//	  
//	  
//	  char[] array = newString.toCharArray();
//	  
//	  for(int i = 0; i < array.length; i++)
//	  {
//		  if(isPunct(array[i]))
//			  count ++;
//	  }
//	  
//	  if(count > 0)
//		  return count;
	  
	  return 0;
  }

  /*
   * returns the index of the first punctuation mark in s or
   * -1 if s contains no punctuation marks
   *
   * use your solution to indexOfFirstPunct(String s, int startPosition)
   * in this function. Do not repeat the same logic.
   * 
   * Notice that this method has the same name as the
   * previous one, but that it takes a different number of arguments. This is
   * perfectly legal in Java. It's called "method overloading"
   *
   */
  public static int indexOfFirstPunct(String s) {
    return 0;
  }

  /*
   * returns the index of the last occurrence of a punctuation
   * mark in s or -1 if s contains no punctuation
   * 
   * When implementing this function, call your isPunct( ) method.
   * Do not simply copy and paste the body of isPunct( ) into this method.
   */
  public static int indexOfLastPunct(String s) {
	  char[] array = s.toCharArray();
	  
	  for(int i = array.length - 1; i >= 0; i--)
	  {
		  if(isPunct(array[i]))
			  return i;
	  }
	  
	  
	  return -1;
  }

  /*
   * returns a new String which is the same as s but with
   * each instance of oldChar replaced with newChar
   */
  public static String substitute(String s, char oldChar, char newChar) {
	  // Error, char newString and null.
	  char[] array = s.toCharArray();
	  char[] newString = null;
	  for(int i = 0; i < array.length; i++)
	  {
		  if(array[i] == oldChar)
		  {
			  array[i] = newChar;
		  }
		  
		  newString[i] = array[i];
	  }
	  
	  return "";
  }

  /*
   * returns a new String which is the same as s, but
   * with each instance of a punctuation mark replaced
   * with a single space character
   *
   * Use at least one of your other functions in your
   * solution to this.
   *
   */
  public static String substitutePunct(String s) {
	  //Error, null and newString
	  char[] array = s.toCharArray();
	  char[] newString = null;
	  
	  for(int i = 0; i < array.length; i++)
	  {
		  if(array[i] == ' ')
			  array[i] = '.';
		  newString[i] = array[i];
	  }
	  
	  return "";
  }
  
  /*
   * returns a new String which is the same as s,
   * but with all of the punctuation
   * marks removed.
   *
   * Use at least one of your other functions
   * in your solution to this one.
   * 
   */
  public static String withoutPunct(String s) {
	  //Error, cannot return type;
	  char[] array = s.toCharArray();
	  
	  for(int i = 0; i < array.length; i++)
	  {
		  if(isPunct(array[i]))
		  {
			  replace(array[i], "");
		  }
		  
		  //char newString = array[i];
	  }
	  
	 // return newString;
	  
	  return "";
  }

  private static void replace(char c, String string) {
	// TODO Auto-generated method stub
	
}

/* returns true if c is found in s or false otherwise */
  public static boolean foundIn(String s, char c) {
	  char[] array = s.toCharArray();
	  for(int i = 0; i < array.length; i++)
	  {
		  if(array[i] == c)
			  return false;
	  }
	  
	  return true;
  }

  /*
   * Returns true of s contains none of the characters
   * found in chars or false otherwise.
   */
  public static boolean containsNone(String s, String chars) {
	  char[] array = s.toCharArray();
	  char[] arrayChars = chars.toCharArray();
	  for(int i = 0; i < array.length; i++)
	  {
		  for(int j = 0; j < arrayChars.length; j++)
		  {
			  if(array[i] == arrayChars[j])
				  return false;
		  }
	  }
	  
	  
	  return true;
  }
  
  /*
   * Returns true of s is comprised of only punctuation or
   * false otherwise
   *
   * Use at least one of your other
   * functions in this one.
   */
  public static boolean onlyPunct(String s) {
	  char[] array = s.toCharArray();
	  int count = 0;
	  
	  for(int i = 0; i < array.length; i++)
	  {
		  if(isPunct(array[i]) == false)
		  {
			  count ++;
		  }
	  }
	  
	  if(count > 0)
		  return false;
	  
	  return true;
  }

  /*
   * Returns true of s contains no punctuation or
   * false otherwise
   *
   * Use at least one of your other
   * functions in this one.
   */
  public static boolean noPunct(String s) {
	  char[] array = s.toCharArray();
	  for(int i = 0; i < array.length; i++)
		  if(isPunct(array[i]))
			  return false;
	  
	  return true;
  }

  /*
   * returns true if s has two punctuation marks
   * right next to each other or false otherwise
   *
   * use at least one of your other methods
   * in your solution to this method
   */
  public static boolean consecutivePuncts(String s) {
	  // Error, i goes out of bounds
	  char[] array = s.toCharArray();
	  for(int i = 0; i <= array.length; i++)
		  if(isPunct(array[i]) == isPunct(array[i + 1]))
			  return true;
	  return false;
  }
}
