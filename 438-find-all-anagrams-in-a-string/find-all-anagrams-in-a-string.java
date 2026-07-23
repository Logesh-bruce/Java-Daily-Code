class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        char e[]=p.toCharArray();
    Arrays.sort(e);
        ArrayList<Integer>l=new ArrayList<>();
       for(int i=0;i<=s.length()-p.length();i++){
        String b=s.substring(i,i+p.length());
        char d[]=b.toCharArray();
        Arrays.sort(d);
        if(Arrays.equals(d,e)){
            l.add(i);
        }
       }return l;
    }
}