package hanif.hakim.dev.data;

class SocialMedia {
    String name;

    // Final method cannot be override in child class!
    final public void login(String username, String password) {

    }
}

/*
 * Final Class cannot be inherited anymore!
 */
final class Facebook extends SocialMedia {

}
