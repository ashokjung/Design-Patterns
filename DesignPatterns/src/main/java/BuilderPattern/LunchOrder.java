package BuilderPattern;

public class LunchOrder {

    public static  class Builder{

        private String bread;
        private String condiments;
        private String dressing;
        public  String meat;

        public  Builder(){

        }

        public Builder bread(String bread){
            this.bread = bread;
            return  this;
        }

        public Builder condiments(String condiments){
            this.condiments = condiments;
            return  this;
        }

        public Builder dressing(String dressing){
            this.dressing = dressing;
            return  this;
        }

        public Builder meat(String meat){
            this.meat=meat;
            return  this;
        }

        public LunchOrder build(){
            return new LunchOrder(this);
        }

    }

    private final String bread;
    private final String condiments;
    private final String dressing;
    public final String meat;

    private LunchOrder(Builder builder){
       this.bread = builder.bread;
       this.condiments = builder.condiments;
       this.dressing = builder.dressing;
       this.meat=builder.meat;
    }

    public String getBread() {
        return bread;
    }

    public String getCondiments() {
        return condiments;
    }

    public String getDressing() {
        return dressing;
    }

    public String getMeat() {
        return meat;
    }
}
