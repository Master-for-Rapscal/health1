package com.aaa.health.controller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class toCamer {
    private static Pattern linePattern = Pattern.compile("_(\\w)");

    /** 下划线转驼峰 */
    public static String lineToHump(String str) {
        str = str.toLowerCase();
        Matcher matcher = linePattern.matcher(str);
        StringBuffer sb = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(sb, matcher.group(1).toUpperCase());
        }
        matcher.appendTail(sb);
        return sb.toString();
    }

    /** 驼峰转下划线(简单写法，效率低于{@link #humpToLine2(String)}) */
    public static String humpToLine(String str) {
        return str.replaceAll("[A-Z]", "_$0").toLowerCase();
    }

    private static Pattern humpPattern = Pattern.compile("[A-Z]");

    /** 驼峰转下划线,效率比上面高 */
    public static String humpToLine2(String str) {
        Matcher matcher = humpPattern.matcher(str);
        StringBuffer sb = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(sb, "_" + matcher.group(0).toLowerCase());
        }
        matcher.appendTail(sb);
        return sb.toString();
    }

    public static void main(String[] args) {
//        String lineToHump = lineToHump("2010-12-15");
//        System.out.println(lineToHump);// fParentNoLeader
//        System.out.println(humpToLine(lineToHump));// f_parent_no_leader
//        System.out.println(humpToLine2(lineToHump));// f_parent_no_leader

        String lineToHump = "userNather,userBirthdy,userSon";//lineToHump("recordName,recordUnit,recordAdress");
        System.out.println(lineToHump);// fParentNoLeader
        System.out.println(caseToCase(lineToHump));// f_parent_no_leader

    }

    public static String caseToCase(String ids) {
        if (ids.contains(",")) {
            ids=ids.replace(",","},#{");
            ids="#{"+ids+"}";
        }
        return ids;
    }
}
