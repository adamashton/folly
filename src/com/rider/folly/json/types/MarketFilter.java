package com.rider.folly.json.types;

import com.rider.folly.json.enums.MarketBettingType;
import com.rider.folly.json.enums.OrderStatus;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Ciaron Rider
 */
public class MarketFilter {
    /**
     * Restrict markets by any text associated with the market such as the Name,
     * Event, Competition, etc. You can include a wildcard (*) character as long
     * as it is not the first character.
     */
    private String textQuery;

    /**
     * Restrict markets by the Exchange where the market operates. Not currently
     * in use, requests for Australian markets should be sent to the Aus
     * Exchange endpoint.
     */
    private Set<String> exchangeIds;

    /**
     * Restrict markets by event type associated with the market. (i.e.,
     * Football, Hockey, etc)
     */
    private Set<String> eventTypeIds;

    /**
     * Restrict markets by the event id associated with the market.
     */
    private Set<String> eventIds;

    /**
     * Restrict markets by the competitions associated with the market.
     */
    private Set<String> competitionIds;

    /**
     * Restrict markets by the market id associated with the market.
     */
    private Set<String> marketIds;

    /**
     * Restrict markets by the venue associated with the market. Currently only
     * Horse Racing markets have venues.
     */
    private Set<String> venues;

    /**
     * Restrict to bsp markets only, if True or non-bsp markets if False. If not
     * specified then returns both BSP and non-BSP markets
     */
    private Boolean bspOnly;

    /**
     * Restrict to markets that will turn in play if True or will not turn in
     * play if false. If not specified, returns both.
     */
    private Boolean turnInPlayEnabled;

    /**
     * Restrict to markets that are currently in play if True or are not
     * currently in play if false. If not specified, returns both.
     */
    private Boolean inPlayOnly;

    /**
     * Restrict to markets that match the betting type of the market (i.e. Odds,
     * Asian Handicap Singles, or Asian Handicap Doubles
     */
    private Set<MarketBettingType> marketBettingTypes;

    /**
     * Restrict to markets that are in the specified country or countries
     */
    private Set<String> marketCountries;

    /**
     * Restrict to markets that match the type of the market (i.e., MATCH_ODDS,
     * HALF_TIME_SCORE). You should use this instead of relying on the market
     * name as the market type codes are the same in all locales
     */
    private Set<String> marketTypeCodes;

    /**
     * Restrict to markets with a market start time before or after the
     * specified date
     */
    private TimeRange marketStartTime;

    /**
     * Restrict to markets that I have one or more orders in these status.
     */
    private Set<OrderStatus> withOrders;

    public Set<String> getCompetitionIds() {
        if (competitionIds == null) {
            competitionIds = new HashSet<>();
        }

        return competitionIds;
    }

    public Set<String> getEventIds() {
        if (eventIds == null) {
            eventIds = new HashSet<>();
        }

        return eventIds;
    }

    public Set<String> getEventTypeIds() {
        if (eventTypeIds == null) {
            eventTypeIds = new HashSet<>();
        }

        return eventTypeIds;
    }

    public Set<String> getExchangeIds() {
        if (exchangeIds == null) {
            exchangeIds = new HashSet<>();
        }

        return exchangeIds;
    }

    public Set<MarketBettingType> getMarketBettingTypes() {
        if (marketBettingTypes == null) {
            marketBettingTypes = new HashSet<>();
        }

        return marketBettingTypes;
    }

    public Set<String> getMarketCountries() {
        if (marketCountries == null) {
            marketCountries = new HashSet<>();
        }

        return marketCountries;
    }

    public Set<String> getMarketIds() {
        if (marketIds == null) {
            marketIds = new HashSet<>();
        }

        return marketIds;
    }

    public TimeRange getMarketStartTime() {
        return marketStartTime;
    }

    public Set<String> getMarketTypeCodes() {
        if (marketTypeCodes == null) {
            marketTypeCodes = new HashSet<>();
        }

        return marketTypeCodes;
    }

    public String getTextQuery() {
        return textQuery;
    }

    public Set<String> getVenues() {
        if (venues == null) {
            venues = new HashSet<>();
        }

        return venues;
    }

    public Set<OrderStatus> getWithOrders() {
        if (withOrders == null) {
            withOrders = new HashSet<>();
        }

        return withOrders;
    }

    public Boolean isBspOnly() {
        return bspOnly;
    }

    public Boolean isInPlayOnly() {
        return inPlayOnly;
    }

    public Boolean isTurnInPlayEnabled() {
        return turnInPlayEnabled;
    }

    @Override
    public String toString() {
        return toString(0);
    }

    public String toString(final int indent) {
        final StringBuilder builder = new StringBuilder();
        String indentString = "";

        for (int indentIndex = 0; indentIndex < indent; indentIndex++) {
            indentString += ' ';
        }

        builder.append(indentString).append("Text Query           : ").append(getTextQuery()).append('\n');
        builder.append(indentString).append("Exchange Ids         : ").append('\n');

        for (final String string : getExchangeIds()) {
            builder.append(indentString).append(indentString).append(string).append('\n');
        }

        builder.append(indentString).append("Event Type Ids       : ").append('\n');

        for (final String string : getEventTypeIds()) {
            builder.append(indentString).append(indentString).append(string).append('\n');
        }

        builder.append(indentString).append("Event Ids            : ").append('\n');

        for (final String string : getEventIds()) {
            builder.append(indentString).append(indentString).append(string).append('\n');
        }

        builder.append(indentString).append("Competition Ids      : ").append('\n');

        for (final String string : getCompetitionIds()) {
            builder.append(indentString).append(indentString).append(string).append('\n');
        }

        builder.append(indentString).append("Market Ids           : ").append('\n');

        for (final String string : getMarketIds()) {
            builder.append(indentString).append(indentString).append(string).append('\n');
        }

        builder.append(indentString).append("Venues               : ").append('\n');

        for (final String string : getVenues()) {
            builder.append(indentString).append(indentString).append(string).append('\n');
        }

        builder.append(indentString).append("BSP Only             : ").append(isBspOnly()).append('\n');
        builder.append(indentString).append("Turn In Play Enabled : ").append(isTurnInPlayEnabled()).append('\n');
        builder.append(indentString).append("In Play Only         : ").append(isInPlayOnly()).append('\n');
        builder.append(indentString).append("Market Betting Types : ").append('\n');

        for (final MarketBettingType marketBettingType : getMarketBettingTypes()) {
            builder.append(indentString).append(indentString).append(marketBettingType).append('\n');
        }

        builder.append(indentString).append("Market Countries     : ").append('\n');

        for (final String string : getMarketCountries()) {
            builder.append(indentString).append(indentString).append(string).append('\n');
        }

        builder.append(indentString).append("Market Type Codes    : ").append('\n');

        for (final String string : getMarketTypeCodes()) {
            builder.append(indentString).append(indentString).append(string).append('\n');
        }

        if (getMarketStartTime() == null) {
            builder.append(indentString).append("Market Start Time    : ").append("Not Set").append('\n');
        } else {
            builder.append(indentString).append("Market Start Time    : ").append('\n').append(getMarketStartTime().toString(indent + Indent.INDENT_SIZE));
        }

        builder.append(indentString).append("With Orders          : ").append('\n');

        for (final OrderStatus orderStatus : getWithOrders()) {
            builder.append(indentString).append(indentString).append(orderStatus).append('\n');
        }

        return builder.toString();
    }
}
