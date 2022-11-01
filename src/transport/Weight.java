package transport;

public enum Weight {
    N1(0D,3.5D),
    N2(3.5,12D),
    N3(12D,null);

   private Double from;
   private Double to;

    public Double getFrom() {
        return from;
    }

    public void setWeightType(Double from) {
        this.from = from;
    }

    public Double getTo() {
        return to;
    }

    public void setTo(Double to) {
        this.to = to;
    }

    Weight(Double from, Double to) {
        this.from=from;
        this.to = to;
    }
}
