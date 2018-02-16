public class Paper extends Sign {
    @Override
    public boolean wins(Sign sign) {
        if(sign.equals(new Rock())){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean equals(Object obj) {
        return this.getClass().equals(obj.getClass());
    }
}
