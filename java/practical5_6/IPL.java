public class IPL {
    String teamName;
    int totalMatchesPlayed, noOfWon, noOfLost;
    IPL(String name, int totMatPl,int won,int lost){
        teamName=name;
        totalMatchesPlayed = totMatPl;
        noOfWon=won;
        noOfLost=lost;
}
class InvalidCountException extends Exception{

    public String toString(){
            return "Count Invalid";
    }
}
class InvalidTeamName extends Exception{
    String str;
    InvalidTeamName(String str){
        this.str=str;
    }
    public String toString(){
        return "Invalid Team Name. ";
} 
}

void RegisterTeam(String teamName) throws InvalidTeamName{
    char str[] = teamName.toCharArray();
    for(int i = 0;i<str.length;i++){
        if(str[i]>='a'|| str[i]<='z' || str[i]  >='A'|| str[i]<= 'Z'){                
            System.out.println("Team name is valid");
} 
        else{
                if(str[i]>=0|| str[i]<=9){
                    throw new InvalidTeamName("Number is not allowed in Team Name");
} 
                else{
                     throw new InvalidTeamName("Any Special Character is not allowed in Team Name");
                }
        }
    }
}


void updateCount (int won,int lost)throws InvalidCountException{
        int matchesPlayed;
        matchesPlayed = totalMatchesPlayed;
        won = noOfWon;
        lost = noOfLost;
        if((won+lost)!=matchesPlayed){
            throw new InvalidCountException();
        }
        if((lost/matchesPlayed)*100>=40){
            System.out.println("Your Team is disqualified from the tournament");
} 
}
}

