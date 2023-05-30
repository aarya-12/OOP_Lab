import java.util.Scanner; 
import java.io.*;
import java.io.Reader;
import java.io.BufferedReader;
public class Main {
    public static void main(String[] args) throws Exception {
        String teamName;
        int won,lost,matpl,i=0;
        try {
            IPL[] t2 = new IPL[50];
            FileReader f1 = new
            FileReader("/Users/aarya/Desktop/java/practical5_6/IPL.txt");
            BufferedReader b1 = new BufferedReader(f1);
            String st;
        while( (st=b1.readLine())!=null){
        System.out.println(st);
        String[] stt = st.split(" ");
        teamName = stt[0];
        matpl = Integer.parseInt(stt[1]);
        won = Integer.parseInt(stt[2]);
        lost = Integer.parseInt(stt[3]);
        System.out.println( teamName+" "+matpl);
        t2[i] = new IPL(teamName,matpl,won,lost);
        t2[i].RegisterTeam(teamName);
        t2[i].updateCount(won,lost);
}

}
catch (FileNotFoundException ob){
    System.out.println("File not Found");
}
}
}