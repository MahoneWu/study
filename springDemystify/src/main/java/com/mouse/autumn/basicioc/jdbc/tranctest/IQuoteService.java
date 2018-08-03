package com.mouse.autumn.basicioc.jdbc.tranctest;

import org.joda.time.DateTime;

/**
 * Created by Mahone Wu on 2018/8/2.
 */
public interface IQuoteService {

    Quote getQuote();

    Quote getQuoteByDataTime(DateTime dateTime);

    void saveQuote(Quote quote);

    void updateQuote(Quote quote);

    void deleteQuote(Quote quote);



}
