class Solution {
    public String solution(String[] id_pw, String[][] db) {
        int answer = 0;
        
        for (int i=0; i<db.length; i++) {
            String id = id_pw[0];
            String pw = id_pw[1];
            
            if (!id.equals(db[i][0])) {
                continue;
            } else {
                answer++;
            }
            
            if (pw.equals(db[i][1])) {
                answer++;
            }
        }
        
        switch (answer) {
            case 0 : return "fail"; 
            case 1 : return "wrong pw"; 
            case 2 : return "login";
                default : return "fail";
        }
    }
}