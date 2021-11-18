public class Users implements Iterable {
    public Facebookuser[] fb;
    public Twitteruser[] tw;

    @Override
    public Iterator iterator() {
        return new userIterator();
    }

    public Facebookuser[] getFb() {
        return fb;
    }

    public void setFb(Facebookuser[] fb) {
        this.fb = fb;
    }

    public Twitteruser[] getTw() {
        return tw;
    }

    public void setTw(Twitteruser[] tw) {
        this.tw = tw;
    }

    private class userIterator implements Iterator{

        int index;

        @Override
        public boolean hasNext() {
            if (fb.length+tw.length<index){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            Object ret;
            if (index>fb.length){
                ret = tw[index-fb.length];
            } else{
                ret = fb[index];
            }
            index++;
            return ret;
        }
    }

}
