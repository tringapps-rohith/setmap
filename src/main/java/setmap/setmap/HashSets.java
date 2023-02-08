package setmap.setmap;

/**
 * Hello world!
 *
 */
import java.util.*;
import java.util.logging.*;
class HashSets
{
        public static void main(String[] args)
        {
				Logger l=Logger.getLogger("com.api.jar");
                Set<String> hs= new HashSet<String>();
                hs.add("Mr.");
                hs.add("Rohith R");
                hs.add("From");
                hs.add("Mepco");
                hs.add("Schlenk");
                hs.add("Engineering college");
                hs.add("Mepco");
				 hs.add("TA");
                hs.remove("TA");
                l.log(Level.INFO,()-> "HashSet is "+hs);
                Map<String,String>mp=new TreeMap<>();
                mp.put("Hi","Im vijay");
                mp.put("Hello","Im Vijay");
                mp.put("Hi","Im Rohith");
               mp.put("How r u","students");
			    mp.put("hj","tr");
               mp.remove("hj");
                l.log(Level.INFO,()->"\nTree Map is "+mp);
                Set<String> ts=new TreeSet<>();
                ts.add(" Hello");
                ts.add(" Rohith");
                ts.add(" Where");
                ts.add(" Are");
                ts.add(" U");
                ts.add(" From");
				 ts.add("TA");
                ts.remove("TA");
                l.log(Level.INFO,()->"\nTree Set is "+ts);
                Map<String,String>hm=new HashMap<>();
                hm.put(" Hi","Im vijay");
                hm.put(" Hello","Im Vijay");
                hm.put(" Hi","Im Rohith");
                hm.put(" How r u","students");
				 hm.put("hj","tr");
                hm.remove("hj");
                l.log(Level.INFO,()->"\nHash Map is "+hm);

        }
}

