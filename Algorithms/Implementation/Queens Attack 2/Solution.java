import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m_nw, m_n, m_ne, m_e, m_se, m_s, m_sw, m_w = 0;
        int n = in.nextInt();
        int k = in.nextInt();
        int rQueen = in.nextInt();
        int cQueen = in.nextInt();
        
        // assigns the max distance to each direction
        m_nw = Math.min(Math.abs(n-rQueen),Math.abs(1-cQueen));
		m_n = Math.abs(n-rQueen);
		m_ne = Math.min(Math.abs(n-rQueen),Math.abs(n-cQueen));
		m_e = Math.abs(n-cQueen);
		m_se = Math.min(Math.abs(1-rQueen),Math.abs(n-cQueen));
		m_s = Math.abs(1-rQueen);
		m_sw = Math.min(Math.abs(1-rQueen),Math.abs(1-cQueen));
		m_w = Math.abs(1-cQueen);
        
        
        for(int a0 = 0; a0 < k; a0++){
        	int rObstacle = in.nextInt();
            int cObstacle = in.nextInt();
            
            if (rObstacle - rQueen > 0){ // North
            	if (cObstacle - cQueen > 0 && Math.abs(cObstacle-cQueen) == Math.abs(rObstacle-rQueen)){ // NE
            		m_ne = Math.min(m_ne,Math.abs(cObstacle - cQueen)-1);
            	}else if(cObstacle - cQueen == 0){ // N
            		m_n = Math.min(m_n, Math.abs(rObstacle-rQueen)-1);
            	}else if(cObstacle - cQueen < 0 && Math.abs(cObstacle-cQueen) == Math.abs(rObstacle-rQueen)){ // NW
            		m_nw = Math.min(m_nw, Math.abs(cObstacle-cQueen)-1);
            	}            	
            }else if (rObstacle - rQueen == 0){ //West-East
            	if (cObstacle - cQueen > 0){ // E
            		m_e = Math.min(m_e, Math.abs(cObstacle-cQueen)-1);
            	}else if(cObstacle - cQueen < 0){ // W
            		m_w = Math.min(m_w, Math.abs(cObstacle-cQueen)-1);
            	}
            }else if (rObstacle - rQueen < 0){ //South
            	if (cObstacle - cQueen > 0 && Math.abs(cObstacle-cQueen) == Math.abs(rObstacle-rQueen)){ // SE
            		m_se = Math.min(m_se,Math.abs(cObstacle - cQueen)-1);
            	}else if(cObstacle - cQueen == 0){ // S
            		m_s = Math.min(m_s, Math.abs(rObstacle-rQueen)-1);
            	}else if(cObstacle - cQueen < 0 && Math.abs(cObstacle-cQueen) == Math.abs(rObstacle-rQueen)){ // SW
            		m_sw = Math.min(m_sw, Math.abs(cObstacle - cQueen)-1);
            	}
            }
        }
        in.close();
        System.out.println(m_nw+m_n+m_ne+m_e+m_se+m_s+m_sw+m_w);
    }
}