public final class Packet{
    private final double temperatureSensor ;
    private final String gpsSensor;
    private final long cardID ;
    private final long timeFrame ;
    private final int checkSum ;

    private Packet (Builder b){
        this.temperatureSensor = b.temperatureSensor ;
        this.gpsSensor = b.gpsSenesor ;
        this.cardID = b.cardID ;
        this.timeFrame = b.timeFrame ; 
        this.checkSum = b.checkSum ;
    }
    
    public double getTemperatureSensor(){
        
        return TemperatureSensor ;

    }

    public String getGpsSensor(){

        return gpsSensor ;

    }

    public long getCardID() {

        return cardID ;

    }

    public long getTimeFrame(){

        return cardID ;

    }

    public String getCheckSum(){

        return checkSum ;

    }

    @Override 
    public String toString(){
        
        return "Packet {card=" + cardID + ", frame =" + timeFrame + ", temp=" + temperatureSensor + ", gps=" + gpsSensor + ", checksum = " + checkSum +"}";

    }

    public static class Builder{
        private double temperatureSensor;
        private String gpsSensor ; 
        private long cardID ;
        private long timeFrame ;
        private int checkSum ;

        public Builder Temperature(double t){
            this.temperatureSensor = t ;
            return this ;
        }

        public Builder gps (String g){
            this.gpsSensor = g ;
            return this ;

        }

        public Builder cardID (long id){
            this.cardID= id ;
            return this ;

        }

        public Builder timeFrame(long f){
            this.timeFrame = f ;
            return this ;

        }

        public Builder checkSum (int c ){
            this.checkSum = c ;
            return this ;

        }

        public Packet build(){
            return new Packet(this) ;
        }

    }
}