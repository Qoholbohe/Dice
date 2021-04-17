public class Cup 
{
    private int num;
    @SuppressWarnings("unused")
    private Dice[] dice;
    
    public Cup(int num)
    {
        this.num = num; 
        dice = new Dice [num];
        for(int i = 0; i < num; i++)
        {
            dice[i] = new Dice();
            
        }
    }
    
    public void setNum(int num)
    {
        this.num = num;
    }
    
    public int getNum()
    {
        return num;
    }
    
    public void rollPrint()
    {
        
        for(int i = 0; i < num; i++)
        {
        	
            System.out.print("第" + (i+1) + "个骰子的面值:" + dice[i].getFaceValue());
            System.out.println();
        }
    }
}