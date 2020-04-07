package pages.google_pages;


import utilities.APIUtil;


public class Test {
    public static void main(String[] args) {

        APIUtil.hitGET("/get_memes");
         APIUtil.getResponseBody().getData().getMemes().get(0);
        System.out.println( APIUtil.getResponseBody().getData().getMemes().get(0));


    }
}
