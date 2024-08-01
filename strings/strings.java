package strings;
 class strings
{
    public static void main()
    {
        String s="Hello";
        String s1="Game";
        System.out.println(s.charAt(2));
        System.out.println(s.compareTo(s1));
        System.out.println(s.compareToIgnoreCase(s1));
        System.out.println(s.concat(s1));
        System.out.println(s.contains("hell"));
        System.out.println(s.endsWith("o"));
        System.out.println(s.equals(s1));
        System.out.println(s.equalsIgnoreCase(s1));
        System.out.println(s.indexOf('l'));
        System.out.println(s.isEmpty());    
        System.out.println(s.lastIndexOf('l'));
        System.out.println(s.length());
        System.out.println(s.replace('l', 'p'));
        System.out.println(s.replaceFirst("Hello", "hello"));
        System.out.println(s.replaceAll("Hello", "hello"));
        System.out.println(s.startsWith("h"));
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.trim());
        System.out.println(s.valueOf(2));
        System.out.println(s.substring(0,3));
    }
}
