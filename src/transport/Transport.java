package transport;


    public abstract class Transport {
        private String brand;
        private String model;
        private int productionYear;
        private String productionCountry;
        private String color;
        private int maxSpeed;
        private String refill;

        public void setColor(String color) {
            if (color == null) {
                this.color = "белый";
            }

        }

        public String getRefill() {
            if(refill=="Бензиновый двигатель"){
                this.refill="Бензин";
            }if(refill=="Дизельный двигатель"){
                this.refill="Дизельное топливо";
            }else{
                this.refill="Зарядка от электичества";
            }
            return refill;
        }

        public void setRefill(String refill) {
            if(refill=="Бензиновый двигатель"){
                this.refill="Бензин";
            }if(refill=="Дизельный двигатель"){
                this.refill="Дизельное топливо";
            }else{
                this.refill="Зарядка от электичества";
            }
            this.refill = refill;
        }

        public void setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
        }

        public String getBrand() {
            if (brand == null) {
                this.brand = "default";
            }
            return brand;
        }

        public String getModel() {
            if (model == null) {
                this.model = "default";
            }
            return model;
        }

        public int getProductionYear() {
            if (productionYear <= 0) {
                this.productionYear = 2000;
            }
            return productionYear;
        }

        public String getProductionCountry() {
            if (productionCountry == null) {
                this.productionCountry = "default";
            }
            return productionCountry;
        }

        public String getColor() {
            if (color == null) {
                this.color = "белый";
            }
            return color;
        }

        public int getMaxSpeed() {
            if(maxSpeed!=0);
            return maxSpeed;
        }

        public Transport(String brand, String model, int productionYear, String productionCountry, String color , int maxSpeed,String refill) {
            if(maxSpeed!= 0) {
            }
            this.maxSpeed = maxSpeed;
            if (color == null) {
                this.color = "белый";
            }
            this.productionYear = productionYear;
            if (productionYear <= 0) {
                this.productionYear = 2000;
            }
            this.productionCountry = productionCountry;
            if (productionCountry == null) {
                this.productionCountry = "default";
            }
            this.model = model;
            if (model == null) {
                this.model = "default";
            }
            this.brand = brand;
            if (brand == null) {
                this.brand = "default";
            }
            this.refill=refill;
            if(refill=="Бензиновый двигатель"){
                this.refill="Бензин";
            }if(refill=="Дизельный двигатель"){
                this.refill="Дизельное топливо";
            }else{
                this.refill="Зарядка от электичества";
            }

        }
        public abstract void toRefill();
    }



