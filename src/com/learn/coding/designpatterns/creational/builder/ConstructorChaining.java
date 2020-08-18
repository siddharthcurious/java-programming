package com.learn.coding.designpatterns.creational.builder;

class Phone {

    public static class Builder {

        private String camera;
        private String screen;
        private String speaker;
        private String body;

        public Builder() {}

        public Phone build(){
            return new Phone(this);
        }

        public Builder camera(String camera){
            this.camera = camera;
            return this;
        }

        public Builder screen(String screen){
            this.screen = screen;
            return this;
        }

        public Builder speaker(String speaker){
            this.speaker = speaker;
            return this;
        }

        public Builder body(String body){
            this.body = body;
            return this;
        }

    }

    private final String camera;
    private final String screen;
    private final String speaker;
    private final String body;

    public Phone(Builder builder){
        this.camera = builder.camera;
        this.screen = builder.screen;
        this.speaker = builder.speaker;
        this.body = builder.body;
    }

    public String getCamera() {
        return camera;
    }

    public String getScreen() {
        return screen;
    }

    public String getSpeaker() {
        return speaker;
    }

    public String getBody() {
        return body;
    }
}

public class ConstructorChaining {
    public static void main(String[] args) {
        Phone.Builder builder = new Phone.Builder();
        builder.camera("16MP").screen("Gorilla").speaker("JBL").body("Metalic");

        Phone phone = builder.build();

        System.out.println(phone.getCamera());
        System.out.println(phone.getScreen());
        System.out.println(phone.getSpeaker());
        System.out.println(phone.getBody());
    }
}
