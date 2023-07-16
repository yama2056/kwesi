package com.app.kwesi;

public class cartitem {

        private int id;
        private int productId;
        private int Quantity;
        private int userId;

        public cartitem(){

        }

        public cartitem(int productId, int quantity, int userId) {
            this.productId = productId;
            Quantity = quantity;
            this.userId = userId;
        }


        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getproductId() {
            return productId;
        }

        public void setproductId(int productId) {
            this.productId = productId;
        }

        public int getQuantity() {
            return Quantity;
        }

        public void setQuantity(int quantity) {
            Quantity = quantity;
        }

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }


    }

