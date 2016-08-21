package basic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Administrator on 2016/8/21.
 *
 * 正则表达式基础
 */
public class basic_regular {

    public static void main(String args[]){

//        String aString;
//        System.out.println(Float.valueOf(aString));

		Pattern p= Pattern.compile("\\w{4}[\\w*]");

        String code="";

		// 现在创建 matcher 对象
	    Matcher m = p.matcher(code);

	    if (m.find( )) {
	        System.out.println("Found value: " + m.group(0) );
	        System.out.println("Found value: " + m.group(1) );
	        System.out.println("Found value: " + m.group(2) );
	     } else {
	        System.out.println("NO MATCH");
	     }
    }

}
