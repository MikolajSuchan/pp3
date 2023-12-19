public class TV implements CanOnOff,CanChangeChannel,CanChangeVolume{
    private boolean ison;
    private int noch;
    private int volume;

    @Override
    public void on(){
        ison=true;
        noch=1;
    }

    @Override
    public void off(){
        ison=false;
    }

    public boolean display(){
        return ison;
    }

    @Override
    public void channelUp(){
        if(noch>=1 && noch<99 && ison){
        noch+=1;
    }
    }

    @Override
    public void channelDown(){
        if(noch>1 && noch<=99 && ison){
        noch-=1;
    }
    }

    @Override
    public void setChannel(int channelNo){
        if(ison){
        noch=channelNo;
    }
    }
    public int displayNo(){
        if(ison){return noch;}else{return 0;}
    }

    @Override
    public void volumeUp(){
        volume+=1;
    }

    @Override
    public void volumeDown(){
        volume-=1;
    }
}
