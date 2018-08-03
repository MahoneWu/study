package com.mouse.autumn.basicioc.jdbc.tranctest;

/**
 * Created by Mahone Wu on 2018/8/2.
 */
public class QuoteServiceClient {

    private QuoteService quoteService;

    public QuoteService getQuoteService() {
        return quoteService;
    }

    public void setQuoteService(QuoteService quoteService) {
        this.quoteService = quoteService;
    }

    public void test(){
        quoteService.saveQuote(null);

    }

}
