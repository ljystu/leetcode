class TopVotedCandidate_911 {
    // public HashMap<Integer,Integer> winner=new HashMap<>();
    int [][] winner =new int[5000][2];
    public int[] votes=new int[5000];
    int length=0;
    public TopVotedCandidate_911(int[] persons, int[] times) {
        int max=0,pos=0;
        for(int i=0;i<persons.length;i++){
            votes[persons[i]]++;
            if(votes[persons[i]]>=max){
                pos=persons[i];
                max=votes[persons[i]];
            }
            // winner.put(times[i],pos);
            winner[i][0]=times[i];
            winner[i][1]=pos;
        }
        length=times.length;
    }

    public int q(int t) {
        // while(t>=0){
        //     if(winner.containsKey(t))
        //         return winner.get(t);
        //     t--;
        // }
        // return 0;
        int start=0,end=length-1;
        while(start<=end){
            int mid = end-(end-start)/2;
            if(winner[mid][0]<t){
                start=mid+1;
            }
            else if(winner[mid][0]>t){
                end=mid-1;
            }
            else
                return winner[mid][1];
        }
        return winner[start-1][1];
    }
}

/**
 * Your TopVotedCandidate object will be instantiated and called as such:
 * TopVotedCandidate obj = new TopVotedCandidate(persons, times);
 * int param_1 = obj.q(t);
 */