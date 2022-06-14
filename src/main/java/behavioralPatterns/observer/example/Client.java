package behavioralPatterns.observer.example;

public class Client {
    public static void main (String [] args){
        CanalYoutube upbChannel = new CanalYoutube();
        upbChannel.subscription(new UserYoutube("comedia",
                new Persona("123","Eynar")));
        upbChannel.subscription(new UserYoutube("drama",
                new Persona("444","Jose")));
        upbChannel.subscription(new UserYoutube("terror",
                new Persona("555","Juan")));
        upbChannel.subscription(new UserYoutube("comedia",
                new Persona("666","Pedro")));
        upbChannel.uploadVideo(new Video("33333","comediantes","comedia"));

    }
}
