class Container{
        int score;
        boolean available=false;  //Flag to represent the state of Container
        void put(int s2){
                score = score + s2;
        }
        int get(){
                return score;
        }
}
