package models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class GetAccountsResponse {

    @JsonProperty("resources")
    public List<Account> accounts;
}
