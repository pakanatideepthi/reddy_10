class GuessingGame {
    public int answer;
    public int min;
    public int max;

    public GuessingGame(int min, int max) {
        Random random=new Random();
        int answer=random.nextInt(100);
        int guess=-1;
        while(guess!=answer)
        {
            System.out.println("enter youranswer");
            guess=scanner.nextInt();
    }

    public int guess() {
        if(guess=answer)
        {
            System.out.println("correct,the number was"+answer);
        return 0;
    }

    public void lower() {
        if(guess<answer)
        {
            System.out.println("too low,please try again");
        }
    }

    public void higher() {
        if(guess>answer)
        {
            System.out.println("too high,please try again");
        }
    }
}
