package java8.myStuff.nullObjectPattern;

public interface NullObjectPattern {

	  void perform();

	  public static final NullObjectPattern dummy = new NullObjectPattern() {
	    public void perform() { 
	     System.out.println("NullObjectPattern");
	    }
	  };

	}
