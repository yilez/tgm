/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tgm.scrapers.search;

import com.tgm.scrapers.search.type.SearchHTTPType;

/**
 *
 * @author mark
 */
public class SearchTheGamesDBNet extends SearchHTTPType implements SearchInterface {

    private String urlString = "http://thegamesdb.net/api/GetGamesList.php";

    public SearchResults search(String game, String platform) {
        return super.search(game, platform);
    }

    public SearchResults search(String game, long platformId) {
        return super.search(game, platformId);
    }

    public SearchResults search(String game) {
        return super.search(game);
    }
}
