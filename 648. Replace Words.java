class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        //the ans should be strng
        String ans="";
        
        //we can split the sentence into a strng array
        String s[]=sentence.split(" ");
        
        
        //because we need shortest form of the array
        Collections.sort(dictionary);
        
        
        //loop through the sentence
        for(int i=0;i<s.length;i++){
            boolean flag=true;
            String str=s[i];
            
            
            //check for the right element if present add to the ans
            for(String compare : dictionary){
                int len=compare.length();   
                
                //first check length other wise it give outofboundexc
                if(str.length()>=len &&compare.equals(str.substring(0,len))){
                    ans+=compare+" ";
                    flag=false;
                    break;
                }
            }
            //if not found flag will be false
            if(flag==true){
                ans+=str+" ";
            }
        }
        return ans.trim();
    }
}